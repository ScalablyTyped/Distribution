package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBotVersionRequest extends StObject {
  
  /**
    * The identifier of the bot to create the version for.
    */
  var botId: Id
  
  /**
    * Specifies the locales that Amazon Lex adds to this version. You can choose the Draft version or any other previously published version for each locale. When you specify a source version, the locale data is copied from the source version to the new version.
    */
  var botVersionLocaleSpecification: BotVersionLocaleSpecification
  
  /**
    * A description of the version. Use the description to help identify the version in lists.
    */
  var description: js.UndefOr[Description] = js.undefined
}
object CreateBotVersionRequest {
  
  inline def apply(botId: Id, botVersionLocaleSpecification: BotVersionLocaleSpecification): CreateBotVersionRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersionLocaleSpecification = botVersionLocaleSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBotVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateBotVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersionLocaleSpecification(value: BotVersionLocaleSpecification): Self = StObject.set(x, "botVersionLocaleSpecification", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
