package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.Marker
import typings.amapJsSdk.AMap.Pixel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoPosition extends StObject {
  
  var autoPosition: js.UndefOr[Boolean] = js.undefined
  
  var direction: js.UndefOr[Boolean] = js.undefined
  
  var liteStyle: js.UndefOr[Boolean] = js.undefined
  
  var locate: js.UndefOr[Boolean] = js.undefined
  
  var locationMarker: js.UndefOr[Marker] = js.undefined
  
  var noIpLocate: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[Pixel] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var ruler: js.UndefOr[Boolean] = js.undefined
  
  var useNative: js.UndefOr[Boolean] = js.undefined
}
object AutoPosition {
  
  inline def apply(): AutoPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoPosition]
  }
  
  extension [Self <: AutoPosition](x: Self) {
    
    inline def setAutoPosition(value: Boolean): Self = StObject.set(x, "autoPosition", value.asInstanceOf[js.Any])
    
    inline def setAutoPositionUndefined: Self = StObject.set(x, "autoPosition", js.undefined)
    
    inline def setDirection(value: Boolean): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setLiteStyle(value: Boolean): Self = StObject.set(x, "liteStyle", value.asInstanceOf[js.Any])
    
    inline def setLiteStyleUndefined: Self = StObject.set(x, "liteStyle", js.undefined)
    
    inline def setLocate(value: Boolean): Self = StObject.set(x, "locate", value.asInstanceOf[js.Any])
    
    inline def setLocateUndefined: Self = StObject.set(x, "locate", js.undefined)
    
    inline def setLocationMarker(value: Marker): Self = StObject.set(x, "locationMarker", value.asInstanceOf[js.Any])
    
    inline def setLocationMarkerUndefined: Self = StObject.set(x, "locationMarker", js.undefined)
    
    inline def setNoIpLocate(value: Boolean): Self = StObject.set(x, "noIpLocate", value.asInstanceOf[js.Any])
    
    inline def setNoIpLocateUndefined: Self = StObject.set(x, "noIpLocate", js.undefined)
    
    inline def setOffset(value: Pixel): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRuler(value: Boolean): Self = StObject.set(x, "ruler", value.asInstanceOf[js.Any])
    
    inline def setRulerUndefined: Self = StObject.set(x, "ruler", js.undefined)
    
    inline def setUseNative(value: Boolean): Self = StObject.set(x, "useNative", value.asInstanceOf[js.Any])
    
    inline def setUseNativeUndefined: Self = StObject.set(x, "useNative", js.undefined)
  }
}
