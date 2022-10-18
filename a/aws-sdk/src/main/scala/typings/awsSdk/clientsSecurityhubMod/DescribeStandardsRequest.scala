package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStandardsRequest extends StObject {
  
  /**
    * The maximum number of standards to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.MaxResults] = js.undefined
  
  /**
    * The token that is required for pagination. On your first call to the DescribeStandards operation, set the value of this parameter to NULL. For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value returned from the previous response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.NextToken] = js.undefined
}
object DescribeStandardsRequest {
  
  inline def apply(): DescribeStandardsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStandardsRequest]
  }
  
  extension [Self <: DescribeStandardsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
