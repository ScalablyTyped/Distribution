package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotSummary extends StObject {
  
  /**
    * The unique identifier assigned to the bot. Use this ID to get detailed information about the bot with the DescribeBot operation.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The name of the bot.
    */
  var botName: js.UndefOr[Name] = js.undefined
  
  /**
    * The current status of the bot. When the status is Available the bot is ready for use.
    */
  var botStatus: js.UndefOr[BotStatus] = js.undefined
  
  /**
    * The type of the bot.
    */
  var botType: js.UndefOr[BotType] = js.undefined
  
  /**
    * The description of the bot.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The date and time that the bot was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The latest numerical version in use for the bot.
    */
  var latestBotVersion: js.UndefOr[NumericalBotVersion] = js.undefined
}
object BotSummary {
  
  inline def apply(): BotSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BotSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BotSummary] (val x: Self) extends AnyVal {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotName(value: Name): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    inline def setBotNameUndefined: Self = StObject.set(x, "botName", js.undefined)
    
    inline def setBotStatus(value: BotStatus): Self = StObject.set(x, "botStatus", value.asInstanceOf[js.Any])
    
    inline def setBotStatusUndefined: Self = StObject.set(x, "botStatus", js.undefined)
    
    inline def setBotType(value: BotType): Self = StObject.set(x, "botType", value.asInstanceOf[js.Any])
    
    inline def setBotTypeUndefined: Self = StObject.set(x, "botType", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setLatestBotVersion(value: NumericalBotVersion): Self = StObject.set(x, "latestBotVersion", value.asInstanceOf[js.Any])
    
    inline def setLatestBotVersionUndefined: Self = StObject.set(x, "latestBotVersion", js.undefined)
  }
}
