package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEntityRecognizerSummariesResponse extends StObject {
  
  /**
    * The list entity recognizer summaries.
    */
  var EntityRecognizerSummariesList: js.UndefOr[typings.awsSdk.clientsComprehendMod.EntityRecognizerSummariesList] = js.undefined
  
  /**
    * The list entity recognizer summaries.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListEntityRecognizerSummariesResponse {
  
  inline def apply(): ListEntityRecognizerSummariesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEntityRecognizerSummariesResponse]
  }
  
  extension [Self <: ListEntityRecognizerSummariesResponse](x: Self) {
    
    inline def setEntityRecognizerSummariesList(value: EntityRecognizerSummariesList): Self = StObject.set(x, "EntityRecognizerSummariesList", value.asInstanceOf[js.Any])
    
    inline def setEntityRecognizerSummariesListUndefined: Self = StObject.set(x, "EntityRecognizerSummariesList", js.undefined)
    
    inline def setEntityRecognizerSummariesListVarargs(value: EntityRecognizerSummary*): Self = StObject.set(x, "EntityRecognizerSummariesList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
