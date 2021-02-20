package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateUserData extends UserData[AppMetadata, UserMetadata] {
  
  var client_id: js.UndefOr[String] = js.native
  
  var connection: js.UndefOr[String] = js.native
  
  var verify_password: js.UndefOr[Boolean] = js.native
  
  var verify_phone_number: js.UndefOr[Boolean] = js.native
}
object UpdateUserData {
  
  @scala.inline
  def apply(): UpdateUserData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateUserData]
  }
  
  @scala.inline
  implicit class UpdateUserDataMutableBuilder[Self <: UpdateUserData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
    
    @scala.inline
    def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    @scala.inline
    def setVerify_password(value: Boolean): Self = StObject.set(x, "verify_password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerify_passwordUndefined: Self = StObject.set(x, "verify_password", js.undefined)
    
    @scala.inline
    def setVerify_phone_number(value: Boolean): Self = StObject.set(x, "verify_phone_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerify_phone_numberUndefined: Self = StObject.set(x, "verify_phone_number", js.undefined)
  }
}
