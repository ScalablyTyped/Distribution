package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEntityRecognizerSummariesRequest extends StObject {
  
  /**
    * The maximum number of results to return on each page. The default is 100.
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListEntityRecognizerSummariesRequest {
  
  inline def apply(): ListEntityRecognizerSummariesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEntityRecognizerSummariesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEntityRecognizerSummariesRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
