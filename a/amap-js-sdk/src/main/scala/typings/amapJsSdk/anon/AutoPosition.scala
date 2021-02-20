package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.Marker
import typings.amapJsSdk.AMap.Pixel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoPosition extends StObject {
  
  var autoPosition: js.UndefOr[Boolean] = js.native
  
  var direction: js.UndefOr[Boolean] = js.native
  
  var liteStyle: js.UndefOr[Boolean] = js.native
  
  var locate: js.UndefOr[Boolean] = js.native
  
  var locationMarker: js.UndefOr[Marker] = js.native
  
  var noIpLocate: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Pixel] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var ruler: js.UndefOr[Boolean] = js.native
  
  var useNative: js.UndefOr[Boolean] = js.native
}
object AutoPosition {
  
  @scala.inline
  def apply(): AutoPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoPosition]
  }
  
  @scala.inline
  implicit class AutoPositionMutableBuilder[Self <: AutoPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoPosition(value: Boolean): Self = StObject.set(x, "autoPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPositionUndefined: Self = StObject.set(x, "autoPosition", js.undefined)
    
    @scala.inline
    def setDirection(value: Boolean): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setLiteStyle(value: Boolean): Self = StObject.set(x, "liteStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiteStyleUndefined: Self = StObject.set(x, "liteStyle", js.undefined)
    
    @scala.inline
    def setLocate(value: Boolean): Self = StObject.set(x, "locate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocateUndefined: Self = StObject.set(x, "locate", js.undefined)
    
    @scala.inline
    def setLocationMarker(value: Marker): Self = StObject.set(x, "locationMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationMarkerUndefined: Self = StObject.set(x, "locationMarker", js.undefined)
    
    @scala.inline
    def setNoIpLocate(value: Boolean): Self = StObject.set(x, "noIpLocate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoIpLocateUndefined: Self = StObject.set(x, "noIpLocate", js.undefined)
    
    @scala.inline
    def setOffset(value: Pixel): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRuler(value: Boolean): Self = StObject.set(x, "ruler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulerUndefined: Self = StObject.set(x, "ruler", js.undefined)
    
    @scala.inline
    def setUseNative(value: Boolean): Self = StObject.set(x, "useNative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNativeUndefined: Self = StObject.set(x, "useNative", js.undefined)
  }
}
