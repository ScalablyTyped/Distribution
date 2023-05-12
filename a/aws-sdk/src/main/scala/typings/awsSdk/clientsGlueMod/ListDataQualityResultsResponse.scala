package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataQualityResultsResponse extends StObject {
  
  /**
    * A pagination token, if more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * A list of DataQualityResultDescription objects.
    */
  var Results: DataQualityResultDescriptionList
}
object ListDataQualityResultsResponse {
  
  inline def apply(Results: DataQualityResultDescriptionList): ListDataQualityResultsResponse = {
    val __obj = js.Dynamic.literal(Results = Results.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataQualityResultsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDataQualityResultsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResults(value: DataQualityResultDescriptionList): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: DataQualityResultDescription*): Self = StObject.set(x, "Results", js.Array(value*))
  }
}
