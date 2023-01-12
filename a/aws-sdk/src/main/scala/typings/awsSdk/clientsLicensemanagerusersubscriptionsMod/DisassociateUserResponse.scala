package typings.awsSdk.clientsLicensemanagerusersubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateUserResponse extends StObject {
  
  /**
    * Metadata that describes the associate user operation.
    */
  var InstanceUserSummary: typings.awsSdk.clientsLicensemanagerusersubscriptionsMod.InstanceUserSummary
}
object DisassociateUserResponse {
  
  inline def apply(InstanceUserSummary: InstanceUserSummary): DisassociateUserResponse = {
    val __obj = js.Dynamic.literal(InstanceUserSummary = InstanceUserSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateUserResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateUserResponse] (val x: Self) extends AnyVal {
    
    inline def setInstanceUserSummary(value: InstanceUserSummary): Self = StObject.set(x, "InstanceUserSummary", value.asInstanceOf[js.Any])
  }
}
