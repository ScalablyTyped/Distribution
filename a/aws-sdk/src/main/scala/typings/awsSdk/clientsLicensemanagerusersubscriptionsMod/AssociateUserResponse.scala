package typings.awsSdk.clientsLicensemanagerusersubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateUserResponse extends StObject {
  
  /**
    * Metadata that describes the associate user operation.
    */
  var InstanceUserSummary: typings.awsSdk.clientsLicensemanagerusersubscriptionsMod.InstanceUserSummary
}
object AssociateUserResponse {
  
  inline def apply(InstanceUserSummary: InstanceUserSummary): AssociateUserResponse = {
    val __obj = js.Dynamic.literal(InstanceUserSummary = InstanceUserSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateUserResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateUserResponse] (val x: Self) extends AnyVal {
    
    inline def setInstanceUserSummary(value: InstanceUserSummary): Self = StObject.set(x, "InstanceUserSummary", value.asInstanceOf[js.Any])
  }
}
