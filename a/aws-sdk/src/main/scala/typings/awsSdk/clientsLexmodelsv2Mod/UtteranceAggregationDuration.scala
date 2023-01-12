package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UtteranceAggregationDuration extends StObject {
  
  /**
    * The desired time window for aggregating utterances. 
    */
  var relativeAggregationDuration: RelativeAggregationDuration
}
object UtteranceAggregationDuration {
  
  inline def apply(relativeAggregationDuration: RelativeAggregationDuration): UtteranceAggregationDuration = {
    val __obj = js.Dynamic.literal(relativeAggregationDuration = relativeAggregationDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UtteranceAggregationDuration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UtteranceAggregationDuration] (val x: Self) extends AnyVal {
    
    inline def setRelativeAggregationDuration(value: RelativeAggregationDuration): Self = StObject.set(x, "relativeAggregationDuration", value.asInstanceOf[js.Any])
  }
}
