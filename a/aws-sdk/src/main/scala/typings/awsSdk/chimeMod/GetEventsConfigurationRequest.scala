package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEventsConfigurationRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  
  /**
    * The bot ID.
    */
  var BotId: NonEmptyString = js.native
}
object GetEventsConfigurationRequest {
  
  @scala.inline
  def apply(AccountId: NonEmptyString, BotId: NonEmptyString): GetEventsConfigurationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BotId = BotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEventsConfigurationRequest]
  }
  
  @scala.inline
  implicit class GetEventsConfigurationRequestMutableBuilder[Self <: GetEventsConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotId(value: NonEmptyString): Self = StObject.set(x, "BotId", value.asInstanceOf[js.Any])
  }
}
