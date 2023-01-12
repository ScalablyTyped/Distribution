package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccessKeyRequest extends StObject {
  
  /**
    * The name of the IAM user that the new key will belong to. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: js.UndefOr[existingUserNameType] = js.undefined
}
object CreateAccessKeyRequest {
  
  inline def apply(): CreateAccessKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAccessKeyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAccessKeyRequest] (val x: Self) extends AnyVal {
    
    inline def setUserName(value: existingUserNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
