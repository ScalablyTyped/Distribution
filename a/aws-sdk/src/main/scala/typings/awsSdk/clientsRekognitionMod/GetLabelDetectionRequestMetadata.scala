package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLabelDetectionRequestMetadata extends StObject {
  
  /**
    * The aggregation method chosen for a GetLabelDetection request.
    */
  var AggregateBy: js.UndefOr[LabelDetectionAggregateBy] = js.undefined
  
  /**
    * The sorting method chosen for a GetLabelDetection request.
    */
  var SortBy: js.UndefOr[LabelDetectionSortBy] = js.undefined
}
object GetLabelDetectionRequestMetadata {
  
  inline def apply(): GetLabelDetectionRequestMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLabelDetectionRequestMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLabelDetectionRequestMetadata] (val x: Self) extends AnyVal {
    
    inline def setAggregateBy(value: LabelDetectionAggregateBy): Self = StObject.set(x, "AggregateBy", value.asInstanceOf[js.Any])
    
    inline def setAggregateByUndefined: Self = StObject.set(x, "AggregateBy", js.undefined)
    
    inline def setSortBy(value: LabelDetectionSortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
  }
}
