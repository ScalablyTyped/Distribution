package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBotLocaleRequest extends StObject {
  
  /**
    * The unique identifier of the bot that contains the locale.
    */
  var botId: Id
  
  /**
    * The version of the bot that contains the locale. 
    */
  var botVersion: DraftBotVersion
  
  /**
    * The identifier of the language and locale that will be deleted. The string must match one of the supported locales. For more information, see Supported languages.
    */
  var localeId: LocaleId
}
object DeleteBotLocaleRequest {
  
  inline def apply(botId: Id, botVersion: DraftBotVersion, localeId: LocaleId): DeleteBotLocaleRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBotLocaleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteBotLocaleRequest] (val x: Self) extends AnyVal {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
  }
}
