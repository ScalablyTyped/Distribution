package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregatedUtterancesSortBy extends StObject {
  
  /**
    * The utterance attribute to sort by.
    */
  var attribute: AggregatedUtterancesSortAttribute
  
  /**
    * Specifies whether to sort the aggregated utterances in ascending or descending order.
    */
  var order: SortOrder
}
object AggregatedUtterancesSortBy {
  
  inline def apply(attribute: AggregatedUtterancesSortAttribute, order: SortOrder): AggregatedUtterancesSortBy = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedUtterancesSortBy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregatedUtterancesSortBy] (val x: Self) extends AnyVal {
    
    inline def setAttribute(value: AggregatedUtterancesSortAttribute): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
