package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.CircleOptions
import typings.amapJsSdk.AMap.MarkerOptions
import typings.amapJsSdk.AMap.Pixel
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonDom extends StObject {
  
  var buttonDom: js.UndefOr[String | HTMLElement] = js.undefined
  
  var buttonOffset: js.UndefOr[Pixel] = js.undefined
  
  var buttonPosition: js.UndefOr[String] = js.undefined
  
  var circleOptions: js.UndefOr[CircleOptions] = js.undefined
  
  var convert: js.UndefOr[Boolean] = js.undefined
  
  var enableHighAccuracy: js.UndefOr[Boolean] = js.undefined
  
  var markerOptions: js.UndefOr[MarkerOptions] = js.undefined
  
  var maximumAge: js.UndefOr[Double] = js.undefined
  
  var noIpLocate: js.UndefOr[Boolean] = js.undefined
  
  var panToLocation: js.UndefOr[Boolean] = js.undefined
  
  var showButton: js.UndefOr[Boolean] = js.undefined
  
  var showCircle: js.UndefOr[Boolean] = js.undefined
  
  var showMarker: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var useNative: js.UndefOr[Boolean] = js.undefined
  
  var zoomToAccuracy: js.UndefOr[Boolean] = js.undefined
}
object ButtonDom {
  
  inline def apply(): ButtonDom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonDom]
  }
  
  extension [Self <: ButtonDom](x: Self) {
    
    inline def setButtonDom(value: String | HTMLElement): Self = StObject.set(x, "buttonDom", value.asInstanceOf[js.Any])
    
    inline def setButtonDomUndefined: Self = StObject.set(x, "buttonDom", js.undefined)
    
    inline def setButtonOffset(value: Pixel): Self = StObject.set(x, "buttonOffset", value.asInstanceOf[js.Any])
    
    inline def setButtonOffsetUndefined: Self = StObject.set(x, "buttonOffset", js.undefined)
    
    inline def setButtonPosition(value: String): Self = StObject.set(x, "buttonPosition", value.asInstanceOf[js.Any])
    
    inline def setButtonPositionUndefined: Self = StObject.set(x, "buttonPosition", js.undefined)
    
    inline def setCircleOptions(value: CircleOptions): Self = StObject.set(x, "circleOptions", value.asInstanceOf[js.Any])
    
    inline def setCircleOptionsUndefined: Self = StObject.set(x, "circleOptions", js.undefined)
    
    inline def setConvert(value: Boolean): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
    
    inline def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
    
    inline def setEnableHighAccuracy(value: Boolean): Self = StObject.set(x, "enableHighAccuracy", value.asInstanceOf[js.Any])
    
    inline def setEnableHighAccuracyUndefined: Self = StObject.set(x, "enableHighAccuracy", js.undefined)
    
    inline def setMarkerOptions(value: MarkerOptions): Self = StObject.set(x, "markerOptions", value.asInstanceOf[js.Any])
    
    inline def setMarkerOptionsUndefined: Self = StObject.set(x, "markerOptions", js.undefined)
    
    inline def setMaximumAge(value: Double): Self = StObject.set(x, "maximumAge", value.asInstanceOf[js.Any])
    
    inline def setMaximumAgeUndefined: Self = StObject.set(x, "maximumAge", js.undefined)
    
    inline def setNoIpLocate(value: Boolean): Self = StObject.set(x, "noIpLocate", value.asInstanceOf[js.Any])
    
    inline def setNoIpLocateUndefined: Self = StObject.set(x, "noIpLocate", js.undefined)
    
    inline def setPanToLocation(value: Boolean): Self = StObject.set(x, "panToLocation", value.asInstanceOf[js.Any])
    
    inline def setPanToLocationUndefined: Self = StObject.set(x, "panToLocation", js.undefined)
    
    inline def setShowButton(value: Boolean): Self = StObject.set(x, "showButton", value.asInstanceOf[js.Any])
    
    inline def setShowButtonUndefined: Self = StObject.set(x, "showButton", js.undefined)
    
    inline def setShowCircle(value: Boolean): Self = StObject.set(x, "showCircle", value.asInstanceOf[js.Any])
    
    inline def setShowCircleUndefined: Self = StObject.set(x, "showCircle", js.undefined)
    
    inline def setShowMarker(value: Boolean): Self = StObject.set(x, "showMarker", value.asInstanceOf[js.Any])
    
    inline def setShowMarkerUndefined: Self = StObject.set(x, "showMarker", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUseNative(value: Boolean): Self = StObject.set(x, "useNative", value.asInstanceOf[js.Any])
    
    inline def setUseNativeUndefined: Self = StObject.set(x, "useNative", js.undefined)
    
    inline def setZoomToAccuracy(value: Boolean): Self = StObject.set(x, "zoomToAccuracy", value.asInstanceOf[js.Any])
    
    inline def setZoomToAccuracyUndefined: Self = StObject.set(x, "zoomToAccuracy", js.undefined)
  }
}
