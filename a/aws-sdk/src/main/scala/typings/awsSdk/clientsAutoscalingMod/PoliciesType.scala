package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PoliciesType extends StObject {
  
  /**
    * A string that indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The scaling policies.
    */
  var ScalingPolicies: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.ScalingPolicies] = js.undefined
}
object PoliciesType {
  
  inline def apply(): PoliciesType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoliciesType]
  }
  
  extension [Self <: PoliciesType](x: Self) {
    
    inline def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setScalingPolicies(value: ScalingPolicies): Self = StObject.set(x, "ScalingPolicies", value.asInstanceOf[js.Any])
    
    inline def setScalingPoliciesUndefined: Self = StObject.set(x, "ScalingPolicies", js.undefined)
    
    inline def setScalingPoliciesVarargs(value: ScalingPolicy*): Self = StObject.set(x, "ScalingPolicies", js.Array(value*))
  }
}
