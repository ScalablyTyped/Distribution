package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetAdvisorCollectorsResponse extends StObject {
  
  /**
    * Provides descriptions of the Fleet Advisor collectors, including the collectors' name and ID, and the latest inventory data. 
    */
  var Collectors: js.UndefOr[CollectorResponses] = js.undefined
  
  /**
    * If NextToken is returned, there are more results available. The value of NextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeFleetAdvisorCollectorsResponse {
  
  inline def apply(): DescribeFleetAdvisorCollectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetAdvisorCollectorsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFleetAdvisorCollectorsResponse] (val x: Self) extends AnyVal {
    
    inline def setCollectors(value: CollectorResponses): Self = StObject.set(x, "Collectors", value.asInstanceOf[js.Any])
    
    inline def setCollectorsUndefined: Self = StObject.set(x, "Collectors", js.undefined)
    
    inline def setCollectorsVarargs(value: CollectorResponse*): Self = StObject.set(x, "Collectors", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
