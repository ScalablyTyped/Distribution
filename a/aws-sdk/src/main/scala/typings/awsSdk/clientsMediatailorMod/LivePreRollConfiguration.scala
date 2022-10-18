package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LivePreRollConfiguration extends StObject {
  
  /**
    * The URL for the ad decision server (ADS) for pre-roll ads. This includes the specification of static parameters and placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as needed when calling the ADS. Alternately, for testing, you can provide a static VAST URL. The maximum length is 25,000 characters.
    */
  var AdDecisionServerUrl: js.UndefOr[string] = js.undefined
  
  /**
    * The maximum allowed duration for the pre-roll ad avail. AWS Elemental MediaTailor won't play pre-roll ads to exceed this duration, regardless of the total duration of ads that the ADS returns.
    */
  var MaxDurationSeconds: js.UndefOr[integer] = js.undefined
}
object LivePreRollConfiguration {
  
  inline def apply(): LivePreRollConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LivePreRollConfiguration]
  }
  
  extension [Self <: LivePreRollConfiguration](x: Self) {
    
    inline def setAdDecisionServerUrl(value: string): Self = StObject.set(x, "AdDecisionServerUrl", value.asInstanceOf[js.Any])
    
    inline def setAdDecisionServerUrlUndefined: Self = StObject.set(x, "AdDecisionServerUrl", js.undefined)
    
    inline def setMaxDurationSeconds(value: integer): Self = StObject.set(x, "MaxDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxDurationSecondsUndefined: Self = StObject.set(x, "MaxDurationSeconds", js.undefined)
  }
}
