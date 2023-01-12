package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScalingAction extends StObject {
  
  /**
    * Not available for instance groups. Instance groups use the market type specified for the group.
    */
  var Market: js.UndefOr[MarketType] = js.undefined
  
  /**
    * The type of adjustment the automatic scaling activity makes when triggered, and the periodicity of the adjustment.
    */
  var SimpleScalingPolicyConfiguration: typings.awsSdk.clientsEmrMod.SimpleScalingPolicyConfiguration
}
object ScalingAction {
  
  inline def apply(SimpleScalingPolicyConfiguration: SimpleScalingPolicyConfiguration): ScalingAction = {
    val __obj = js.Dynamic.literal(SimpleScalingPolicyConfiguration = SimpleScalingPolicyConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScalingAction] (val x: Self) extends AnyVal {
    
    inline def setMarket(value: MarketType): Self = StObject.set(x, "Market", value.asInstanceOf[js.Any])
    
    inline def setMarketUndefined: Self = StObject.set(x, "Market", js.undefined)
    
    inline def setSimpleScalingPolicyConfiguration(value: SimpleScalingPolicyConfiguration): Self = StObject.set(x, "SimpleScalingPolicyConfiguration", value.asInstanceOf[js.Any])
  }
}
