package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStandardsResponse extends StObject {
  
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.NextToken] = js.undefined
  
  /**
    * A list of available standards.
    */
  var Standards: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.Standards] = js.undefined
}
object DescribeStandardsResponse {
  
  inline def apply(): DescribeStandardsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStandardsResponse]
  }
  
  extension [Self <: DescribeStandardsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStandards(value: Standards): Self = StObject.set(x, "Standards", value.asInstanceOf[js.Any])
    
    inline def setStandardsUndefined: Self = StObject.set(x, "Standards", js.undefined)
    
    inline def setStandardsVarargs(value: Standard*): Self = StObject.set(x, "Standards", js.Array(value*))
  }
}
