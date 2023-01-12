package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTimeBasedAutoScalingResult extends StObject {
  
  /**
    * An array of TimeBasedAutoScalingConfiguration objects that describe the configuration for the specified instances.
    */
  var TimeBasedAutoScalingConfigurations: js.UndefOr[typings.awsSdk.clientsOpsworksMod.TimeBasedAutoScalingConfigurations] = js.undefined
}
object DescribeTimeBasedAutoScalingResult {
  
  inline def apply(): DescribeTimeBasedAutoScalingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTimeBasedAutoScalingResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTimeBasedAutoScalingResult] (val x: Self) extends AnyVal {
    
    inline def setTimeBasedAutoScalingConfigurations(value: TimeBasedAutoScalingConfigurations): Self = StObject.set(x, "TimeBasedAutoScalingConfigurations", value.asInstanceOf[js.Any])
    
    inline def setTimeBasedAutoScalingConfigurationsUndefined: Self = StObject.set(x, "TimeBasedAutoScalingConfigurations", js.undefined)
    
    inline def setTimeBasedAutoScalingConfigurationsVarargs(value: TimeBasedAutoScalingConfiguration*): Self = StObject.set(x, "TimeBasedAutoScalingConfigurations", js.Array(value*))
  }
}
