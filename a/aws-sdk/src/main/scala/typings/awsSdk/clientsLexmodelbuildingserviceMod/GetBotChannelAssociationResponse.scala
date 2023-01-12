package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBotChannelAssociationResponse extends StObject {
  
  /**
    * An alias pointing to the specific version of the Amazon Lex bot to which this association is being made.
    */
  var botAlias: js.UndefOr[AliasName] = js.undefined
  
  /**
    * Provides information that the messaging platform needs to communicate with the Amazon Lex bot.
    */
  var botConfiguration: js.UndefOr[ChannelConfigurationMap] = js.undefined
  
  /**
    * The name of the Amazon Lex bot.
    */
  var botName: js.UndefOr[BotName] = js.undefined
  
  /**
    * The date that the association between the bot and the channel was created.
    */
  var createdDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A description of the association between the bot and the channel.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * If status is FAILED, Amazon Lex provides the reason that it failed to create the association.
    */
  var failureReason: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the association between the bot and the channel.
    */
  var name: js.UndefOr[BotChannelName] = js.undefined
  
  /**
    * The status of the bot channel.     CREATED - The channel has been created and is ready for use.    IN_PROGRESS - Channel creation is in progress.    FAILED - There was an error creating the channel. For information about the reason for the failure, see the failureReason field.  
    */
  var status: js.UndefOr[ChannelStatus] = js.undefined
  
  /**
    * The type of the messaging platform.
    */
  var `type`: js.UndefOr[ChannelType] = js.undefined
}
object GetBotChannelAssociationResponse {
  
  inline def apply(): GetBotChannelAssociationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBotChannelAssociationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBotChannelAssociationResponse] (val x: Self) extends AnyVal {
    
    inline def setBotAlias(value: AliasName): Self = StObject.set(x, "botAlias", value.asInstanceOf[js.Any])
    
    inline def setBotAliasUndefined: Self = StObject.set(x, "botAlias", js.undefined)
    
    inline def setBotConfiguration(value: ChannelConfigurationMap): Self = StObject.set(x, "botConfiguration", value.asInstanceOf[js.Any])
    
    inline def setBotConfigurationUndefined: Self = StObject.set(x, "botConfiguration", js.undefined)
    
    inline def setBotName(value: BotName): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    inline def setBotNameUndefined: Self = StObject.set(x, "botName", js.undefined)
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setName(value: BotChannelName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: ChannelStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: ChannelType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
