package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestMetricFilterResponse extends StObject {
  
  /**
    * The matched events.
    */
  var matches: js.UndefOr[MetricFilterMatches] = js.undefined
}
object TestMetricFilterResponse {
  
  inline def apply(): TestMetricFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestMetricFilterResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestMetricFilterResponse] (val x: Self) extends AnyVal {
    
    inline def setMatches(value: MetricFilterMatches): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    inline def setMatchesVarargs(value: MetricFilterMatchRecord*): Self = StObject.set(x, "matches", js.Array(value*))
  }
}
