package typings.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBatchPredictionsOutput extends StObject {
  
  /**
    * The ID of the next page in the paginated results that indicates at least one more page follows.
    */
  var NextToken: js.UndefOr[StringType] = js.undefined
  
  /**
    * A list of BatchPrediction objects that meet the search criteria. 
    */
  var Results: js.UndefOr[BatchPredictions] = js.undefined
}
object DescribeBatchPredictionsOutput {
  
  inline def apply(): DescribeBatchPredictionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBatchPredictionsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeBatchPredictionsOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: StringType): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResults(value: BatchPredictions): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "Results", js.undefined)
    
    inline def setResultsVarargs(value: BatchPrediction*): Self = StObject.set(x, "Results", js.Array(value*))
  }
}
