package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLoadBasedAutoScalingResult extends StObject {
  
  /**
    * An array of LoadBasedAutoScalingConfiguration objects that describe each layer's configuration.
    */
  var LoadBasedAutoScalingConfigurations: js.UndefOr[typings.awsSdk.clientsOpsworksMod.LoadBasedAutoScalingConfigurations] = js.undefined
}
object DescribeLoadBasedAutoScalingResult {
  
  inline def apply(): DescribeLoadBasedAutoScalingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBasedAutoScalingResult]
  }
  
  extension [Self <: DescribeLoadBasedAutoScalingResult](x: Self) {
    
    inline def setLoadBasedAutoScalingConfigurations(value: LoadBasedAutoScalingConfigurations): Self = StObject.set(x, "LoadBasedAutoScalingConfigurations", value.asInstanceOf[js.Any])
    
    inline def setLoadBasedAutoScalingConfigurationsUndefined: Self = StObject.set(x, "LoadBasedAutoScalingConfigurations", js.undefined)
    
    inline def setLoadBasedAutoScalingConfigurationsVarargs(value: LoadBasedAutoScalingConfiguration*): Self = StObject.set(x, "LoadBasedAutoScalingConfigurations", js.Array(value*))
  }
}
