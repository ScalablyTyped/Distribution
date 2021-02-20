package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResetPersonalPINRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  
  /**
    * The user ID.
    */
  var UserId: NonEmptyString = js.native
}
object ResetPersonalPINRequest {
  
  @scala.inline
  def apply(AccountId: NonEmptyString, UserId: NonEmptyString): ResetPersonalPINRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetPersonalPINRequest]
  }
  
  @scala.inline
  implicit class ResetPersonalPINRequestMutableBuilder[Self <: ResetPersonalPINRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: NonEmptyString): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
