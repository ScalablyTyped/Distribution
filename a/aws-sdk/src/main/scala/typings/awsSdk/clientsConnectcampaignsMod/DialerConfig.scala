package typings.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialerConfig extends StObject {
  
  var predictiveDialerConfig: js.UndefOr[PredictiveDialerConfig] = js.undefined
  
  var progressiveDialerConfig: js.UndefOr[ProgressiveDialerConfig] = js.undefined
}
object DialerConfig {
  
  inline def apply(): DialerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialerConfig] (val x: Self) extends AnyVal {
    
    inline def setPredictiveDialerConfig(value: PredictiveDialerConfig): Self = StObject.set(x, "predictiveDialerConfig", value.asInstanceOf[js.Any])
    
    inline def setPredictiveDialerConfigUndefined: Self = StObject.set(x, "predictiveDialerConfig", js.undefined)
    
    inline def setProgressiveDialerConfig(value: ProgressiveDialerConfig): Self = StObject.set(x, "progressiveDialerConfig", value.asInstanceOf[js.Any])
    
    inline def setProgressiveDialerConfigUndefined: Self = StObject.set(x, "progressiveDialerConfig", js.undefined)
  }
}
