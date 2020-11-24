package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 此对象用于表示地图、覆盖物、叠加层上的各种鼠标事件返回，包含以下字段：
  */
@js.native
trait MapsEventOptions extends js.Object {
  
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
  implicit class MapsEventOptionsOps[Self <: MapsEventOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLnglat(value: LngLat): Self = this.set("lnglat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixel(value: Pixel): Self = this.set("pixel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
