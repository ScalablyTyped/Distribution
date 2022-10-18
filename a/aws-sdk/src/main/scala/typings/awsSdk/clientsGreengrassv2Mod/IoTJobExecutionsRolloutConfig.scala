package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IoTJobExecutionsRolloutConfig extends StObject {
  
  /**
    * The exponential rate to increase the job rollout rate.
    */
  var exponentialRate: js.UndefOr[IoTJobExponentialRolloutRate] = js.undefined
  
  /**
    * The maximum number of devices that receive a pending job notification, per minute.
    */
  var maximumPerMinute: js.UndefOr[IoTJobMaxExecutionsPerMin] = js.undefined
}
object IoTJobExecutionsRolloutConfig {
  
  inline def apply(): IoTJobExecutionsRolloutConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IoTJobExecutionsRolloutConfig]
  }
  
  extension [Self <: IoTJobExecutionsRolloutConfig](x: Self) {
    
    inline def setExponentialRate(value: IoTJobExponentialRolloutRate): Self = StObject.set(x, "exponentialRate", value.asInstanceOf[js.Any])
    
    inline def setExponentialRateUndefined: Self = StObject.set(x, "exponentialRate", js.undefined)
    
    inline def setMaximumPerMinute(value: IoTJobMaxExecutionsPerMin): Self = StObject.set(x, "maximumPerMinute", value.asInstanceOf[js.Any])
    
    inline def setMaximumPerMinuteUndefined: Self = StObject.set(x, "maximumPerMinute", js.undefined)
  }
}
