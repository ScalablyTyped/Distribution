package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntentStatistics extends StObject {
  
  /**
    * The number of recommended intents associated with the bot recommendation.
    */
  var discoveredIntentCount: js.UndefOr[Count] = js.undefined
}
object IntentStatistics {
  
  inline def apply(): IntentStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntentStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntentStatistics] (val x: Self) extends AnyVal {
    
    inline def setDiscoveredIntentCount(value: Count): Self = StObject.set(x, "discoveredIntentCount", value.asInstanceOf[js.Any])
    
    inline def setDiscoveredIntentCountUndefined: Self = StObject.set(x, "discoveredIntentCount", js.undefined)
  }
}
