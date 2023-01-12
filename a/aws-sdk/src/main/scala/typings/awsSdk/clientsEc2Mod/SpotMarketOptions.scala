package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotMarketOptions extends StObject {
  
  /**
    * Deprecated.
    */
  var BlockDurationMinutes: js.UndefOr[Integer] = js.undefined
  
  /**
    * The behavior when a Spot Instance is interrupted. The default is terminate.
    */
  var InstanceInterruptionBehavior: js.UndefOr[typings.awsSdk.clientsEc2Mod.InstanceInterruptionBehavior] = js.undefined
  
  /**
    * The maximum hourly price that you're willing to pay for a Spot Instance. We do not recommend using this parameter because it can lead to increased interruptions. If you do not specify this parameter, you will pay the current Spot price.  If you specify a maximum price, your Spot Instances will be interrupted more frequently than if you do not specify this parameter. 
    */
  var MaxPrice: js.UndefOr[String] = js.undefined
  
  /**
    * The Spot Instance request type. For RunInstances, persistent Spot Instance requests are only supported when the instance interruption behavior is either hibernate or stop.
    */
  var SpotInstanceType: js.UndefOr[typings.awsSdk.clientsEc2Mod.SpotInstanceType] = js.undefined
  
  /**
    * The end date of the request, in UTC format (YYYY-MM-DDTHH:MM:SSZ). Supported only for persistent requests.   For a persistent request, the request remains active until the ValidUntil date and time is reached. Otherwise, the request remains active until you cancel it.   For a one-time request, ValidUntil is not supported. The request remains active until all instances launch or you cancel the request.  
    */
  var ValidUntil: js.UndefOr[js.Date] = js.undefined
}
object SpotMarketOptions {
  
  inline def apply(): SpotMarketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotMarketOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpotMarketOptions] (val x: Self) extends AnyVal {
    
    inline def setBlockDurationMinutes(value: Integer): Self = StObject.set(x, "BlockDurationMinutes", value.asInstanceOf[js.Any])
    
    inline def setBlockDurationMinutesUndefined: Self = StObject.set(x, "BlockDurationMinutes", js.undefined)
    
    inline def setInstanceInterruptionBehavior(value: InstanceInterruptionBehavior): Self = StObject.set(x, "InstanceInterruptionBehavior", value.asInstanceOf[js.Any])
    
    inline def setInstanceInterruptionBehaviorUndefined: Self = StObject.set(x, "InstanceInterruptionBehavior", js.undefined)
    
    inline def setMaxPrice(value: String): Self = StObject.set(x, "MaxPrice", value.asInstanceOf[js.Any])
    
    inline def setMaxPriceUndefined: Self = StObject.set(x, "MaxPrice", js.undefined)
    
    inline def setSpotInstanceType(value: SpotInstanceType): Self = StObject.set(x, "SpotInstanceType", value.asInstanceOf[js.Any])
    
    inline def setSpotInstanceTypeUndefined: Self = StObject.set(x, "SpotInstanceType", js.undefined)
    
    inline def setValidUntil(value: js.Date): Self = StObject.set(x, "ValidUntil", value.asInstanceOf[js.Any])
    
    inline def setValidUntilUndefined: Self = StObject.set(x, "ValidUntil", js.undefined)
  }
}
