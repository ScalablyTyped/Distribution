package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateServiceRoleToAccountResponse extends StObject {
  
  /**
    * The time when the service role was associated with IoT Greengrass for your Amazon Web Services account in this Amazon Web Services Region.
    */
  var associatedAt: js.UndefOr[String] = js.undefined
}
object AssociateServiceRoleToAccountResponse {
  
  inline def apply(): AssociateServiceRoleToAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateServiceRoleToAccountResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateServiceRoleToAccountResponse] (val x: Self) extends AnyVal {
    
    inline def setAssociatedAt(value: String): Self = StObject.set(x, "associatedAt", value.asInstanceOf[js.Any])
    
    inline def setAssociatedAtUndefined: Self = StObject.set(x, "associatedAt", js.undefined)
  }
}
