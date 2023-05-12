package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplacePermissionAssociationsRequest extends StObject {
  
  /**
    * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This lets you safely retry the request without accidentally performing the same operation a second time. Passing the same value to a later call to an operation requires that you also pass the same value for all other parameters. We recommend that you use a UUID type of value.. If you don't provide this value, then Amazon Web Services generates a random one for you. If you retry the operation with the same ClientToken, but with different parameters, the retry fails with an IdempotentParameterMismatch error.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the managed permission that you want to replace.
    */
  var fromPermissionArn: String
  
  /**
    * Specifies that you want to updated the permissions for only those resource shares that use the specified version of the managed permission.
    */
  var fromPermissionVersion: js.UndefOr[Integer] = js.undefined
  
  /**
    * Specifies the ARN of the managed permission that you want to associate with resource shares in place of the one specified by fromPerssionArn and fromPermissionVersion. The operation always associates the version that is currently the default for the specified managed permission.
    */
  var toPermissionArn: String
}
object ReplacePermissionAssociationsRequest {
  
  inline def apply(fromPermissionArn: String, toPermissionArn: String): ReplacePermissionAssociationsRequest = {
    val __obj = js.Dynamic.literal(fromPermissionArn = fromPermissionArn.asInstanceOf[js.Any], toPermissionArn = toPermissionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplacePermissionAssociationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplacePermissionAssociationsRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setFromPermissionArn(value: String): Self = StObject.set(x, "fromPermissionArn", value.asInstanceOf[js.Any])
    
    inline def setFromPermissionVersion(value: Integer): Self = StObject.set(x, "fromPermissionVersion", value.asInstanceOf[js.Any])
    
    inline def setFromPermissionVersionUndefined: Self = StObject.set(x, "fromPermissionVersion", js.undefined)
    
    inline def setToPermissionArn(value: String): Self = StObject.set(x, "toPermissionArn", value.asInstanceOf[js.Any])
  }
}
