package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceRoleForAccountResponse extends StObject {
  
  /**
    * The time when the service role was associated with the account.
    */
  var AssociatedAt: js.UndefOr[string] = js.undefined
  
  /**
    * The ARN of the role which is associated with the account.
    */
  var RoleArn: js.UndefOr[string] = js.undefined
}
object GetServiceRoleForAccountResponse {
  
  inline def apply(): GetServiceRoleForAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceRoleForAccountResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetServiceRoleForAccountResponse] (val x: Self) extends AnyVal {
    
    inline def setAssociatedAt(value: string): Self = StObject.set(x, "AssociatedAt", value.asInstanceOf[js.Any])
    
    inline def setAssociatedAtUndefined: Self = StObject.set(x, "AssociatedAt", js.undefined)
    
    inline def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
