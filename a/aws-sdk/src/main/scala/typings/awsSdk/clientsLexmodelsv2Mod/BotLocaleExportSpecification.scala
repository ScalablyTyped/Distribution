package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotLocaleExportSpecification extends StObject {
  
  /**
    * The identifier of the bot to create the locale for.
    */
  var botId: Id
  
  /**
    * The version of the bot to export.
    */
  var botVersion: BotVersion
  
  /**
    * The identifier of the language and locale to export. The string must match one of the locales in the bot.
    */
  var localeId: LocaleId
}
object BotLocaleExportSpecification {
  
  inline def apply(botId: Id, botVersion: BotVersion, localeId: LocaleId): BotLocaleExportSpecification = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotLocaleExportSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BotLocaleExportSpecification] (val x: Self) extends AnyVal {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
  }
}
