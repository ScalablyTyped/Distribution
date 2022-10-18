package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotAliasHistoryEvent extends StObject {
  
  /**
    * The version of the bot that was used in the event. 
    */
  var botVersion: js.UndefOr[BotVersion] = js.undefined
  
  /**
    * The date and time that the event ended.
    */
  var endDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time that the event started.
    */
  var startDate: js.UndefOr[js.Date] = js.undefined
}
object BotAliasHistoryEvent {
  
  inline def apply(): BotAliasHistoryEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BotAliasHistoryEvent]
  }
  
  extension [Self <: BotAliasHistoryEvent](x: Self) {
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
