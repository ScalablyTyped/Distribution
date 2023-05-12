package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailSuppression extends StObject {
  
  /**
    * Defines the policy to apply to the avail suppression mode. BEHIND_LIVE_EDGE will always use the full avail suppression policy. AFTER_LIVE_EDGE mode can be used to invoke partial ad break fills when a session starts mid-break.
    */
  var FillPolicy: js.UndefOr[typings.awsSdk.clientsMediatailorMod.FillPolicy] = js.undefined
  
  /**
    * Sets the ad suppression mode. By default, ad suppression is off and all ad breaks are filled with ads or slate. When Mode is set to BEHIND_LIVE_EDGE, ad suppression is active and MediaTailor won't fill ad breaks on or behind the ad suppression Value time in the manifest lookback window. When Mode is set to AFTER_LIVE_EDGE, ad suppression is active and MediaTailor won't fill ad breaks that are within the live edge plus the avail suppression value.
    */
  var Mode: js.UndefOr[typings.awsSdk.clientsMediatailorMod.Mode] = js.undefined
  
  /**
    * A live edge offset time in HH:MM:SS. MediaTailor won't fill ad breaks on or behind this time in the manifest lookback window. If Value is set to 00:00:00, it is in sync with the live edge, and MediaTailor won't fill any ad breaks on or behind the live edge. If you set a Value time, MediaTailor won't fill any ad breaks on or behind this time in the manifest lookback window. For example, if you set 00:45:00, then MediaTailor will fill ad breaks that occur within 45 minutes behind the live edge, but won't fill ad breaks on or behind 45 minutes behind the live edge.
    */
  var Value: js.UndefOr[_String] = js.undefined
}
object AvailSuppression {
  
  inline def apply(): AvailSuppression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailSuppression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AvailSuppression] (val x: Self) extends AnyVal {
    
    inline def setFillPolicy(value: FillPolicy): Self = StObject.set(x, "FillPolicy", value.asInstanceOf[js.Any])
    
    inline def setFillPolicyUndefined: Self = StObject.set(x, "FillPolicy", js.undefined)
    
    inline def setMode(value: Mode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    inline def setValue(value: _String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
