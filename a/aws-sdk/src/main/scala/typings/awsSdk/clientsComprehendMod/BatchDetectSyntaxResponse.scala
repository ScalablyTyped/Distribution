package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDetectSyntaxResponse extends StObject {
  
  /**
    * A list containing one object for each document that contained an error. The results are sorted in ascending order by the Index field and match the order of the documents in the input list. If there are no errors in the batch, the ErrorList is empty.
    */
  var ErrorList: BatchItemErrorList
  
  /**
    * A list of objects containing the results of the operation. The results are sorted in ascending order by the Index field and match the order of the documents in the input list. If all of the documents contain an error, the ResultList is empty.
    */
  var ResultList: ListOfDetectSyntaxResult
}
object BatchDetectSyntaxResponse {
  
  inline def apply(ErrorList: BatchItemErrorList, ResultList: ListOfDetectSyntaxResult): BatchDetectSyntaxResponse = {
    val __obj = js.Dynamic.literal(ErrorList = ErrorList.asInstanceOf[js.Any], ResultList = ResultList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetectSyntaxResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDetectSyntaxResponse] (val x: Self) extends AnyVal {
    
    inline def setErrorList(value: BatchItemErrorList): Self = StObject.set(x, "ErrorList", value.asInstanceOf[js.Any])
    
    inline def setErrorListVarargs(value: BatchItemError*): Self = StObject.set(x, "ErrorList", js.Array(value*))
    
    inline def setResultList(value: ListOfDetectSyntaxResult): Self = StObject.set(x, "ResultList", value.asInstanceOf[js.Any])
    
    inline def setResultListVarargs(value: BatchDetectSyntaxItemResult*): Self = StObject.set(x, "ResultList", js.Array(value*))
  }
}
