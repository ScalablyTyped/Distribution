package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetDataQualityResultResponse extends StObject {
  
  /**
    * A list of DataQualityResult objects representing the data quality results.
    */
  var Results: DataQualityResultsList
  
  /**
    * A list of result IDs for which results were not found.
    */
  var ResultsNotFound: js.UndefOr[DataQualityResultIds] = js.undefined
}
object BatchGetDataQualityResultResponse {
  
  inline def apply(Results: DataQualityResultsList): BatchGetDataQualityResultResponse = {
    val __obj = js.Dynamic.literal(Results = Results.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetDataQualityResultResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetDataQualityResultResponse] (val x: Self) extends AnyVal {
    
    inline def setResults(value: DataQualityResultsList): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    inline def setResultsNotFound(value: DataQualityResultIds): Self = StObject.set(x, "ResultsNotFound", value.asInstanceOf[js.Any])
    
    inline def setResultsNotFoundUndefined: Self = StObject.set(x, "ResultsNotFound", js.undefined)
    
    inline def setResultsNotFoundVarargs(value: HashString*): Self = StObject.set(x, "ResultsNotFound", js.Array(value*))
    
    inline def setResultsVarargs(value: DataQualityResult*): Self = StObject.set(x, "Results", js.Array(value*))
  }
}
