package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAwsNetworkPerformanceDataResult extends StObject {
  
  /**
    * The list of data responses.
    */
  var DataResponses: js.UndefOr[typings.awsSdk.clientsEc2Mod.DataResponses] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object GetAwsNetworkPerformanceDataResult {
  
  inline def apply(): GetAwsNetworkPerformanceDataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAwsNetworkPerformanceDataResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAwsNetworkPerformanceDataResult] (val x: Self) extends AnyVal {
    
    inline def setDataResponses(value: DataResponses): Self = StObject.set(x, "DataResponses", value.asInstanceOf[js.Any])
    
    inline def setDataResponsesUndefined: Self = StObject.set(x, "DataResponses", js.undefined)
    
    inline def setDataResponsesVarargs(value: DataResponse*): Self = StObject.set(x, "DataResponses", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
