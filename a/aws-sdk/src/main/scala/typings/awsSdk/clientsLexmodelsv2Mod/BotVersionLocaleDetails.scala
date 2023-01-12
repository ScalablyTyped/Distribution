package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotVersionLocaleDetails extends StObject {
  
  /**
    * The version of a bot used for a bot locale.
    */
  var sourceBotVersion: BotVersion
}
object BotVersionLocaleDetails {
  
  inline def apply(sourceBotVersion: BotVersion): BotVersionLocaleDetails = {
    val __obj = js.Dynamic.literal(sourceBotVersion = sourceBotVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotVersionLocaleDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BotVersionLocaleDetails] (val x: Self) extends AnyVal {
    
    inline def setSourceBotVersion(value: BotVersion): Self = StObject.set(x, "sourceBotVersion", value.asInstanceOf[js.Any])
  }
}
