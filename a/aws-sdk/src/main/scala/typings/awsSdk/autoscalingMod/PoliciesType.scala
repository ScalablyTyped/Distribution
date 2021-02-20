package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoliciesType extends StObject {
  
  /**
    * A string that indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.native
  
  /**
    * The scaling policies.
    */
  var ScalingPolicies: js.UndefOr[typings.awsSdk.autoscalingMod.ScalingPolicies] = js.native
}
object PoliciesType {
  
  @scala.inline
  def apply(): PoliciesType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoliciesType]
  }
  
  @scala.inline
  implicit class PoliciesTypeMutableBuilder[Self <: PoliciesType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setScalingPolicies(value: ScalingPolicies): Self = StObject.set(x, "ScalingPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingPoliciesUndefined: Self = StObject.set(x, "ScalingPolicies", js.undefined)
    
    @scala.inline
    def setScalingPoliciesVarargs(value: ScalingPolicy*): Self = StObject.set(x, "ScalingPolicies", js.Array(value :_*))
  }
}
