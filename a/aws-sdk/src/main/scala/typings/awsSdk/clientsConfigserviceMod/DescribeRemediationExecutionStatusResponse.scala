package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRemediationExecutionStatusResponse extends StObject {
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Returns a list of remediation execution statuses objects.
    */
  var RemediationExecutionStatuses: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.RemediationExecutionStatuses] = js.undefined
}
object DescribeRemediationExecutionStatusResponse {
  
  inline def apply(): DescribeRemediationExecutionStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRemediationExecutionStatusResponse]
  }
  
  extension [Self <: DescribeRemediationExecutionStatusResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRemediationExecutionStatuses(value: RemediationExecutionStatuses): Self = StObject.set(x, "RemediationExecutionStatuses", value.asInstanceOf[js.Any])
    
    inline def setRemediationExecutionStatusesUndefined: Self = StObject.set(x, "RemediationExecutionStatuses", js.undefined)
    
    inline def setRemediationExecutionStatusesVarargs(value: RemediationExecutionStatus*): Self = StObject.set(x, "RemediationExecutionStatuses", js.Array(value*))
  }
}
