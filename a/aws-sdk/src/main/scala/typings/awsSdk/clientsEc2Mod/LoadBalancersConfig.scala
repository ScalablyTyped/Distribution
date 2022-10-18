package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadBalancersConfig extends StObject {
  
  /**
    * The Classic Load Balancers.
    */
  var ClassicLoadBalancersConfig: js.UndefOr[typings.awsSdk.clientsEc2Mod.ClassicLoadBalancersConfig] = js.undefined
  
  /**
    * The target groups.
    */
  var TargetGroupsConfig: js.UndefOr[typings.awsSdk.clientsEc2Mod.TargetGroupsConfig] = js.undefined
}
object LoadBalancersConfig {
  
  inline def apply(): LoadBalancersConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancersConfig]
  }
  
  extension [Self <: LoadBalancersConfig](x: Self) {
    
    inline def setClassicLoadBalancersConfig(value: ClassicLoadBalancersConfig): Self = StObject.set(x, "ClassicLoadBalancersConfig", value.asInstanceOf[js.Any])
    
    inline def setClassicLoadBalancersConfigUndefined: Self = StObject.set(x, "ClassicLoadBalancersConfig", js.undefined)
    
    inline def setTargetGroupsConfig(value: TargetGroupsConfig): Self = StObject.set(x, "TargetGroupsConfig", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupsConfigUndefined: Self = StObject.set(x, "TargetGroupsConfig", js.undefined)
  }
}
