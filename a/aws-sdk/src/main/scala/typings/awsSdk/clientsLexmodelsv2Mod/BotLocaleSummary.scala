package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotLocaleSummary extends StObject {
  
  /**
    * The current status of the bot locale. When the status is Built the locale is ready for use.
    */
  var botLocaleStatus: js.UndefOr[BotLocaleStatus] = js.undefined
  
  /**
    * The description of the bot locale.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * A timestamp of the date and time that the bot locale was last built.
    */
  var lastBuildSubmittedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A timestamp of the date and time that the bot locale was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The language and locale of the bot locale.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * The name of the bot locale.
    */
  var localeName: js.UndefOr[LocaleName] = js.undefined
}
object BotLocaleSummary {
  
  inline def apply(): BotLocaleSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BotLocaleSummary]
  }
  
  extension [Self <: BotLocaleSummary](x: Self) {
    
    inline def setBotLocaleStatus(value: BotLocaleStatus): Self = StObject.set(x, "botLocaleStatus", value.asInstanceOf[js.Any])
    
    inline def setBotLocaleStatusUndefined: Self = StObject.set(x, "botLocaleStatus", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLastBuildSubmittedDateTime(value: js.Date): Self = StObject.set(x, "lastBuildSubmittedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastBuildSubmittedDateTimeUndefined: Self = StObject.set(x, "lastBuildSubmittedDateTime", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
    
    inline def setLocaleName(value: LocaleName): Self = StObject.set(x, "localeName", value.asInstanceOf[js.Any])
    
    inline def setLocaleNameUndefined: Self = StObject.set(x, "localeName", js.undefined)
  }
}
