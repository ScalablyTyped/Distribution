package typings.awsSdk.applicationautoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeScalableTargetsResponse extends StObject {
  
  /**
    * The token required to get the next set of results. This value is null if there are no more results to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The scalable targets that match the request parameters.
    */
  var ScalableTargets: js.UndefOr[typings.awsSdk.applicationautoscalingMod.ScalableTargets] = js.undefined
}
object DescribeScalableTargetsResponse {
  
  inline def apply(): DescribeScalableTargetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScalableTargetsResponse]
  }
  
  extension [Self <: DescribeScalableTargetsResponse](x: Self) {
    
    inline def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setScalableTargets(value: ScalableTargets): Self = StObject.set(x, "ScalableTargets", value.asInstanceOf[js.Any])
    
    inline def setScalableTargetsUndefined: Self = StObject.set(x, "ScalableTargets", js.undefined)
    
    inline def setScalableTargetsVarargs(value: ScalableTarget*): Self = StObject.set(x, "ScalableTargets", js.Array(value :_*))
  }
}
