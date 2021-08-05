package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.DrivingPolicy
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extensions extends StObject {
  
  var extensions: js.UndefOr[String] = js.undefined
  
  var hideMarkers: js.UndefOr[Boolean] = js.undefined
  
  var map: js.UndefOr[typings.amapJsSdk.AMap.Map] = js.undefined
  
  var panel: js.UndefOr[String | HTMLElement] = js.undefined
  
  var policy: js.UndefOr[DrivingPolicy] = js.undefined
  
  var showTraffic: js.UndefOr[Boolean] = js.undefined
}
object Extensions {
  
  inline def apply(): Extensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Extensions]
  }
  
  extension [Self <: Extensions](x: Self) {
    
    inline def setExtensions(value: String): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setHideMarkers(value: Boolean): Self = StObject.set(x, "hideMarkers", value.asInstanceOf[js.Any])
    
    inline def setHideMarkersUndefined: Self = StObject.set(x, "hideMarkers", js.undefined)
    
    inline def setMap(value: typings.amapJsSdk.AMap.Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setPanel(value: String | HTMLElement): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
    
    inline def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
    
    inline def setPolicy(value: DrivingPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setShowTraffic(value: Boolean): Self = StObject.set(x, "showTraffic", value.asInstanceOf[js.Any])
    
    inline def setShowTrafficUndefined: Self = StObject.set(x, "showTraffic", js.undefined)
  }
}
