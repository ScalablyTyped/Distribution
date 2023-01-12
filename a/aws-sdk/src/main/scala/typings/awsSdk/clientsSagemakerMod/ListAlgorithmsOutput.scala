package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAlgorithmsOutput extends StObject {
  
  /**
    * &gt;An array of AlgorithmSummary objects, each of which lists an algorithm.
    */
  var AlgorithmSummaryList: typings.awsSdk.clientsSagemakerMod.AlgorithmSummaryList
  
  /**
    * If the response is truncated, SageMaker returns this token. To retrieve the next set of algorithms, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListAlgorithmsOutput {
  
  inline def apply(AlgorithmSummaryList: AlgorithmSummaryList): ListAlgorithmsOutput = {
    val __obj = js.Dynamic.literal(AlgorithmSummaryList = AlgorithmSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAlgorithmsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAlgorithmsOutput] (val x: Self) extends AnyVal {
    
    inline def setAlgorithmSummaryList(value: AlgorithmSummaryList): Self = StObject.set(x, "AlgorithmSummaryList", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmSummaryListVarargs(value: AlgorithmSummary*): Self = StObject.set(x, "AlgorithmSummaryList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
