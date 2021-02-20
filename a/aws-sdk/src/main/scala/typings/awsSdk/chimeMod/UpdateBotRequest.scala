package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateBotRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  
  /**
    * The bot ID.
    */
  var BotId: NonEmptyString = js.native
  
  /**
    * When true, stops the specified bot from running in your account.
    */
  var Disabled: js.UndefOr[NullableBoolean] = js.native
}
object UpdateBotRequest {
  
  @scala.inline
  def apply(AccountId: NonEmptyString, BotId: NonEmptyString): UpdateBotRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BotId = BotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBotRequest]
  }
  
  @scala.inline
  implicit class UpdateBotRequestMutableBuilder[Self <: UpdateBotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotId(value: NonEmptyString): Self = StObject.set(x, "BotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: NullableBoolean): Self = StObject.set(x, "Disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "Disabled", js.undefined)
  }
}
