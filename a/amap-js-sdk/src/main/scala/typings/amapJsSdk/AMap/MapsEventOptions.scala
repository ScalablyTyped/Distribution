package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 此对象用于表示地图、覆盖物、叠加层上的各种鼠标事件返回，包含以下字段：
  */
@js.native
trait MapsEventOptions extends StObject {
  
  var lnglat: LngLat = js.native
  
  var pixel: Pixel = js.native
  
  var target: js.Any = js.native
  
  var `type`: String = js.native
}
object MapsEventOptions {
  
  @scala.inline
  def apply(lnglat: LngLat, pixel: Pixel, target: js.Any, `type`: String): MapsEventOptions = {
    val __obj = js.Dynamic.literal(lnglat = lnglat.asInstanceOf[js.Any], pixel = pixel.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapsEventOptions]
  }
  
  @scala.inline
  implicit class MapsEventOptionsMutableBuilder[Self <: MapsEventOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLnglat(value: LngLat): Self = StObject.set(x, "lnglat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixel(value: Pixel): Self = StObject.set(x, "pixel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
