package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDocumentClassifierSummariesResponse extends StObject {
  
  /**
    * The list of summaries of document classifiers.
    */
  var DocumentClassifierSummariesList: js.UndefOr[typings.awsSdk.clientsComprehendMod.DocumentClassifierSummariesList] = js.undefined
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListDocumentClassifierSummariesResponse {
  
  inline def apply(): ListDocumentClassifierSummariesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDocumentClassifierSummariesResponse]
  }
  
  extension [Self <: ListDocumentClassifierSummariesResponse](x: Self) {
    
    inline def setDocumentClassifierSummariesList(value: DocumentClassifierSummariesList): Self = StObject.set(x, "DocumentClassifierSummariesList", value.asInstanceOf[js.Any])
    
    inline def setDocumentClassifierSummariesListUndefined: Self = StObject.set(x, "DocumentClassifierSummariesList", js.undefined)
    
    inline def setDocumentClassifierSummariesListVarargs(value: DocumentClassifierSummary*): Self = StObject.set(x, "DocumentClassifierSummariesList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
