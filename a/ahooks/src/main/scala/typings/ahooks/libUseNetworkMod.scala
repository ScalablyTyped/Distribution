package typings.ahooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseNetworkMod {
  
  @JSImport("ahooks/lib/useNetwork", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): NetworkState = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[NetworkState]
  
  trait NetworkState extends StObject {
    
    var downlink: js.UndefOr[Double] = js.undefined
    
    var downlinkMax: js.UndefOr[Double] = js.undefined
    
    var effectiveType: js.UndefOr[String] = js.undefined
    
    var online: js.UndefOr[Boolean] = js.undefined
    
    var rtt: js.UndefOr[Double] = js.undefined
    
    var saveData: js.UndefOr[Boolean] = js.undefined
    
    var since: js.UndefOr[js.Date] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object NetworkState {
    
    inline def apply(): NetworkState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkState]
    }
    
    extension [Self <: NetworkState](x: Self) {
      
      inline def setDownlink(value: Double): Self = StObject.set(x, "downlink", value.asInstanceOf[js.Any])
      
      inline def setDownlinkMax(value: Double): Self = StObject.set(x, "downlinkMax", value.asInstanceOf[js.Any])
      
      inline def setDownlinkMaxUndefined: Self = StObject.set(x, "downlinkMax", js.undefined)
      
      inline def setDownlinkUndefined: Self = StObject.set(x, "downlink", js.undefined)
      
      inline def setEffectiveType(value: String): Self = StObject.set(x, "effectiveType", value.asInstanceOf[js.Any])
      
      inline def setEffectiveTypeUndefined: Self = StObject.set(x, "effectiveType", js.undefined)
      
      inline def setOnline(value: Boolean): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
      
      inline def setOnlineUndefined: Self = StObject.set(x, "online", js.undefined)
      
      inline def setRtt(value: Double): Self = StObject.set(x, "rtt", value.asInstanceOf[js.Any])
      
      inline def setRttUndefined: Self = StObject.set(x, "rtt", js.undefined)
      
      inline def setSaveData(value: Boolean): Self = StObject.set(x, "saveData", value.asInstanceOf[js.Any])
      
      inline def setSaveDataUndefined: Self = StObject.set(x, "saveData", js.undefined)
      
      inline def setSince(value: js.Date): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
      
      inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
