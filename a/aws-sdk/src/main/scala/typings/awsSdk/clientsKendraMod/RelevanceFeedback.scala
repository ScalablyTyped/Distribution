package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelevanceFeedback extends StObject {
  
  /**
    * Whether to document was relevant or not relevant to the search.
    */
  var RelevanceValue: RelevanceType
  
  /**
    * The unique identifier of the search result that the user provided relevance feedback for.
    */
  var ResultId: typings.awsSdk.clientsKendraMod.ResultId
}
object RelevanceFeedback {
  
  inline def apply(RelevanceValue: RelevanceType, ResultId: ResultId): RelevanceFeedback = {
    val __obj = js.Dynamic.literal(RelevanceValue = RelevanceValue.asInstanceOf[js.Any], ResultId = ResultId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelevanceFeedback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelevanceFeedback] (val x: Self) extends AnyVal {
    
    inline def setRelevanceValue(value: RelevanceType): Self = StObject.set(x, "RelevanceValue", value.asInstanceOf[js.Any])
    
    inline def setResultId(value: ResultId): Self = StObject.set(x, "ResultId", value.asInstanceOf[js.Any])
  }
}
