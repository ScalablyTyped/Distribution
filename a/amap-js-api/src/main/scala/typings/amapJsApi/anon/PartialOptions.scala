package typings.amapJsApi.anon

import typings.amapJsApi.AMap.Bounds
import typings.amapJsApi.AMap.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<amap-js-api.AMap.MediaLayer.Options> */
trait PartialOptions extends StObject {
  
  var bounds: js.UndefOr[Bounds] = js.undefined
  
  var map: js.UndefOr[Map] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}
object PartialOptions {
  
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  
  @scala.inline
  implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setZooms(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "zooms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomsUndefined: Self = StObject.set(x, "zooms", js.undefined)
  }
}
