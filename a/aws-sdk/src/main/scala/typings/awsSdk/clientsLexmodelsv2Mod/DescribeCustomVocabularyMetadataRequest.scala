package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCustomVocabularyMetadataRequest extends StObject {
  
  /**
    * The unique identifier of the bot that contains the custom vocabulary.
    */
  var botId: Id
  
  /**
    * The bot version of the bot to return metadata for.
    */
  var botVersion: BotVersion
  
  /**
    * The locale to return the custom vocabulary information for. The locale must be en_GB.
    */
  var localeId: LocaleId
}
object DescribeCustomVocabularyMetadataRequest {
  
  inline def apply(botId: Id, botVersion: BotVersion, localeId: LocaleId): DescribeCustomVocabularyMetadataRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCustomVocabularyMetadataRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeCustomVocabularyMetadataRequest] (val x: Self) extends AnyVal {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
  }
}
