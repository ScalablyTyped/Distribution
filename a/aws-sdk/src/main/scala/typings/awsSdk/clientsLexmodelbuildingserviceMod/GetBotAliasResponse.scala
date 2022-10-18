package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBotAliasResponse extends StObject {
  
  /**
    * The name of the bot that the alias points to.
    */
  var botName: js.UndefOr[BotName] = js.undefined
  
  /**
    * The version of the bot that the alias points to.
    */
  var botVersion: js.UndefOr[Version] = js.undefined
  
  /**
    * Checksum of the bot alias.
    */
  var checksum: js.UndefOr[String] = js.undefined
  
  /**
    * The settings that determine how Amazon Lex uses conversation logs for the alias.
    */
  var conversationLogs: js.UndefOr[ConversationLogsResponse] = js.undefined
  
  /**
    * The date that the bot alias was created.
    */
  var createdDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A description of the bot alias.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The date that the bot alias was updated. When you create a resource, the creation date and the last updated date are the same.
    */
  var lastUpdatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the bot alias.
    */
  var name: js.UndefOr[AliasName] = js.undefined
}
object GetBotAliasResponse {
  
  inline def apply(): GetBotAliasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBotAliasResponse]
  }
  
  extension [Self <: GetBotAliasResponse](x: Self) {
    
    inline def setBotName(value: BotName): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    inline def setBotNameUndefined: Self = StObject.set(x, "botName", js.undefined)
    
    inline def setBotVersion(value: Version): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    inline def setConversationLogs(value: ConversationLogsResponse): Self = StObject.set(x, "conversationLogs", value.asInstanceOf[js.Any])
    
    inline def setConversationLogsUndefined: Self = StObject.set(x, "conversationLogs", js.undefined)
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLastUpdatedDate(value: js.Date): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateUndefined: Self = StObject.set(x, "lastUpdatedDate", js.undefined)
    
    inline def setName(value: AliasName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
