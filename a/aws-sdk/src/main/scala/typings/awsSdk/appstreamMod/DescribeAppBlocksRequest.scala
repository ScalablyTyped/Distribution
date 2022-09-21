package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppBlocksRequest extends StObject {
  
  /**
    * The ARNs of the app blocks.
    */
  var Arns: js.UndefOr[ArnList] = js.undefined
  
  /**
    * The maximum size of each page of results.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The pagination token used to retrieve the next page of results for this operation.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeAppBlocksRequest {
  
  inline def apply(): DescribeAppBlocksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAppBlocksRequest]
  }
  
  extension [Self <: DescribeAppBlocksRequest](x: Self) {
    
    inline def setArns(value: ArnList): Self = StObject.set(x, "Arns", value.asInstanceOf[js.Any])
    
    inline def setArnsUndefined: Self = StObject.set(x, "Arns", js.undefined)
    
    inline def setArnsVarargs(value: Arn*): Self = StObject.set(x, "Arns", js.Array(value*))
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
