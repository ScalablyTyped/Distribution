package typings.awsSdk.clientsPinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReputationOptions extends StObject {
  
  /**
    * The date and time (in Unix time) when the reputation metrics were last given a fresh start. When your account is given a fresh start, your reputation metrics are calculated starting from the date of the fresh start.
    */
  var LastFreshStart: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If true, tracking of reputation metrics is enabled for the configuration set. If false, tracking of reputation metrics is disabled for the configuration set.
    */
  var ReputationMetricsEnabled: js.UndefOr[Enabled] = js.undefined
}
object ReputationOptions {
  
  inline def apply(): ReputationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReputationOptions]
  }
  
  extension [Self <: ReputationOptions](x: Self) {
    
    inline def setLastFreshStart(value: js.Date): Self = StObject.set(x, "LastFreshStart", value.asInstanceOf[js.Any])
    
    inline def setLastFreshStartUndefined: Self = StObject.set(x, "LastFreshStart", js.undefined)
    
    inline def setReputationMetricsEnabled(value: Enabled): Self = StObject.set(x, "ReputationMetricsEnabled", value.asInstanceOf[js.Any])
    
    inline def setReputationMetricsEnabledUndefined: Self = StObject.set(x, "ReputationMetricsEnabled", js.undefined)
  }
}
