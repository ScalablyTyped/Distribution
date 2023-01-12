package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIntentRequest extends StObject {
  
  /**
    * The identifier of the bot associated with the intent.
    */
  var botId: Id
  
  /**
    * The version of the bot associated with the intent.
    */
  var botVersion: BotVersion
  
  /**
    * The identifier of the intent to describe.
    */
  var intentId: Id
  
  /**
    * The identifier of the language and locale of the intent to describe. The string must match one of the supported locales. For more information, see Supported languages.
    */
  var localeId: LocaleId
}
object DescribeIntentRequest {
  
  inline def apply(botId: Id, botVersion: BotVersion, intentId: Id, localeId: LocaleId): DescribeIntentRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], intentId = intentId.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIntentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeIntentRequest] (val x: Self) extends AnyVal {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setIntentId(value: Id): Self = StObject.set(x, "intentId", value.asInstanceOf[js.Any])
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
  }
}
