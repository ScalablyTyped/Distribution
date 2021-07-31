package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bot extends StObject {
  
  /**
    * The bot email address.
    */
  var BotEmail: js.UndefOr[SensitiveString] = js.undefined
  
  /**
    * The bot ID.
    */
  var BotId: js.UndefOr[String] = js.undefined
  
  /**
    * The bot type.
    */
  var BotType: js.UndefOr[typings.awsSdk.chimeMod.BotType] = js.undefined
  
  /**
    * The bot creation timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
  
  /**
    * When true, the bot is stopped from running in your account.
    */
  var Disabled: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * The bot display name.
    */
  var DisplayName: js.UndefOr[SensitiveString] = js.undefined
  
  /**
    * The security token used to authenticate Amazon Chime with the outgoing event endpoint.
    */
  var SecurityToken: js.UndefOr[SensitiveString] = js.undefined
  
  /**
    * The updated bot timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
  
  /**
    * The unique ID for the bot user.
    */
  var UserId: js.UndefOr[String] = js.undefined
}
object Bot {
  
  @scala.inline
  def apply(): Bot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bot]
  }
  
  @scala.inline
  implicit class BotMutableBuilder[Self <: Bot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBotEmail(value: SensitiveString): Self = StObject.set(x, "BotEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotEmailUndefined: Self = StObject.set(x, "BotEmail", js.undefined)
    
    @scala.inline
    def setBotId(value: String): Self = StObject.set(x, "BotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotIdUndefined: Self = StObject.set(x, "BotId", js.undefined)
    
    @scala.inline
    def setBotType(value: BotType): Self = StObject.set(x, "BotType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotTypeUndefined: Self = StObject.set(x, "BotType", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: Iso8601Timestamp): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setDisabled(value: NullableBoolean): Self = StObject.set(x, "Disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "Disabled", js.undefined)
    
    @scala.inline
    def setDisplayName(value: SensitiveString): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setSecurityToken(value: SensitiveString): Self = StObject.set(x, "SecurityToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityTokenUndefined: Self = StObject.set(x, "SecurityToken", js.undefined)
    
    @scala.inline
    def setUpdatedTimestamp(value: Iso8601Timestamp): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
