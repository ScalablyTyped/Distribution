package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRecommendationLimitationsResponse extends StObject {
  
  /**
    * The list of limitations for recommendations of target Amazon Web Services engines.
    */
  var Limitations: js.UndefOr[LimitationList] = js.undefined
  
  /**
    * The unique pagination token returned for you to pass to a subsequent request. Fleet Advisor returns this token when the number of records in the response is greater than the MaxRecords value. To retrieve the next page, make the call again using the returned token and keeping all other arguments unchanged.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeRecommendationLimitationsResponse {
  
  inline def apply(): DescribeRecommendationLimitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRecommendationLimitationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeRecommendationLimitationsResponse] (val x: Self) extends AnyVal {
    
    inline def setLimitations(value: LimitationList): Self = StObject.set(x, "Limitations", value.asInstanceOf[js.Any])
    
    inline def setLimitationsUndefined: Self = StObject.set(x, "Limitations", js.undefined)
    
    inline def setLimitationsVarargs(value: Limitation*): Self = StObject.set(x, "Limitations", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
