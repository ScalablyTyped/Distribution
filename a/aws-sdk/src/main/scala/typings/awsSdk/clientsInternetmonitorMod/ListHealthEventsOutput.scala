package typings.awsSdk.clientsInternetmonitorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHealthEventsOutput extends StObject {
  
  /**
    * A list of health events.
    */
  var HealthEvents: HealthEventList
  
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListHealthEventsOutput {
  
  inline def apply(HealthEvents: HealthEventList): ListHealthEventsOutput = {
    val __obj = js.Dynamic.literal(HealthEvents = HealthEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHealthEventsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListHealthEventsOutput] (val x: Self) extends AnyVal {
    
    inline def setHealthEvents(value: HealthEventList): Self = StObject.set(x, "HealthEvents", value.asInstanceOf[js.Any])
    
    inline def setHealthEventsVarargs(value: HealthEvent*): Self = StObject.set(x, "HealthEvents", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
