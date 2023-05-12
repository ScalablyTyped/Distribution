package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomVocabularyItemsRequest extends StObject {
  
  /**
    * The identifier of the version of the bot associated with this custom vocabulary.
    */
  var botId: Id
  
  /**
    * The bot version of the bot to the list custom vocabulary request.
    */
  var botVersion: BotVersion
  
  /**
    * The identifier of the language and locale where this custom vocabulary is used. The string must match one of the supported locales. For more information, see Supported languages (https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html).
    */
  var localeId: LocaleId
  
  /**
    * The maximum number of items returned by the list operation.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The nextToken identifier to the list custom vocabulary request.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListCustomVocabularyItemsRequest {
  
  inline def apply(botId: Id, botVersion: BotVersion, localeId: LocaleId): ListCustomVocabularyItemsRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCustomVocabularyItemsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCustomVocabularyItemsRequest] (val x: Self) extends AnyVal {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
