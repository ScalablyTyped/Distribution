package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromotePermissionCreatedFromPolicyRequest extends StObject {
  
  /**
    * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This lets you safely retry the request without accidentally performing the same operation a second time. Passing the same value to a later call to an operation requires that you also pass the same value for all other parameters. We recommend that you use a UUID type of value.. If you don't provide this value, then Amazon Web Services generates a random one for you. If you retry the operation with the same ClientToken, but with different parameters, the retry fails with an IdempotentParameterMismatch error.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a name for the promoted customer managed permission.
    */
  var name: String
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the CREATED_FROM_POLICY permission that you want to promote. You can get this Amazon Resource Name (ARN) by calling the ListResourceSharePermissions operation.
    */
  var permissionArn: String
}
object PromotePermissionCreatedFromPolicyRequest {
  
  inline def apply(name: String, permissionArn: String): PromotePermissionCreatedFromPolicyRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], permissionArn = permissionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromotePermissionCreatedFromPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PromotePermissionCreatedFromPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPermissionArn(value: String): Self = StObject.set(x, "permissionArn", value.asInstanceOf[js.Any])
  }
}
