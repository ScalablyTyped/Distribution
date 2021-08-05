package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTerminationPolicyTypesAnswer extends StObject {
  
  /**
    * The termination policies supported by Amazon EC2 Auto Scaling: OldestInstance, OldestLaunchConfiguration, NewestInstance, ClosestToNextInstanceHour, Default, OldestLaunchTemplate, and AllocationStrategy.
    */
  var TerminationPolicyTypes: js.UndefOr[TerminationPolicies] = js.undefined
}
object DescribeTerminationPolicyTypesAnswer {
  
  inline def apply(): DescribeTerminationPolicyTypesAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTerminationPolicyTypesAnswer]
  }
  
  extension [Self <: DescribeTerminationPolicyTypesAnswer](x: Self) {
    
    inline def setTerminationPolicyTypes(value: TerminationPolicies): Self = StObject.set(x, "TerminationPolicyTypes", value.asInstanceOf[js.Any])
    
    inline def setTerminationPolicyTypesUndefined: Self = StObject.set(x, "TerminationPolicyTypes", js.undefined)
    
    inline def setTerminationPolicyTypesVarargs(value: XmlStringMaxLen1600*): Self = StObject.set(x, "TerminationPolicyTypes", js.Array(value :_*))
  }
}
