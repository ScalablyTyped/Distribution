package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotVersionSummary extends StObject {
  
  /**
    * The name of the bot associated with the version.
    */
  var botName: js.UndefOr[Name] = js.undefined
  
  /**
    * The status of the bot. When the status is available, the version of the bot is ready for use.
    */
  var botStatus: js.UndefOr[BotStatus] = js.undefined
  
  /**
    * The numeric version of the bot, or DRAFT to indicate that this is the version of the bot that can be updated..
    */
  var botVersion: js.UndefOr[BotVersion] = js.undefined
  
  /**
    * A timestamp of the date and time that the version was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the version.
    */
  var description: js.UndefOr[Description] = js.undefined
}
object BotVersionSummary {
  
  inline def apply(): BotVersionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BotVersionSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BotVersionSummary] (val x: Self) extends AnyVal {
    
    inline def setBotName(value: Name): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    inline def setBotNameUndefined: Self = StObject.set(x, "botName", js.undefined)
    
    inline def setBotStatus(value: BotStatus): Self = StObject.set(x, "botStatus", value.asInstanceOf[js.Any])
    
    inline def setBotStatusUndefined: Self = StObject.set(x, "botStatus", js.undefined)
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
