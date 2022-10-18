package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetGroupStickinessConfig extends StObject {
  
  /**
    * The time period, in seconds, during which requests from a client should be routed to the same target group. The range is 1-604800 seconds (7 days).
    */
  var DurationSeconds: js.UndefOr[TargetGroupStickinessDurationSeconds] = js.undefined
  
  /**
    * Indicates whether target group stickiness is enabled.
    */
  var Enabled: js.UndefOr[TargetGroupStickinessEnabled] = js.undefined
}
object TargetGroupStickinessConfig {
  
  inline def apply(): TargetGroupStickinessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetGroupStickinessConfig]
  }
  
  extension [Self <: TargetGroupStickinessConfig](x: Self) {
    
    inline def setDurationSeconds(value: TargetGroupStickinessDurationSeconds): Self = StObject.set(x, "DurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationSecondsUndefined: Self = StObject.set(x, "DurationSeconds", js.undefined)
    
    inline def setEnabled(value: TargetGroupStickinessEnabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
