package typings.amapJsApi.AMap.View2D

import typings.amapJsApi.AMap.LocationValue
import typings.amapJsApi.amapJsApiStrings.EPGS3395
import typings.amapJsApi.amapJsApiStrings.EPGS3857
import typings.amapJsApi.amapJsApiStrings.EPGS4326
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * 地图中心点坐标值
    */
  var center: js.UndefOr[LocationValue] = js.native
  
  /**
    * 地图显示的参考坐标系
    */
  var crs: js.UndefOr[EPGS3857 | EPGS3395 | EPGS4326] = js.native
  
  /**
    * 地图顺时针旋转角度
    */
  var rotation: js.UndefOr[Double] = js.native
  
  /**
    * 地图显示的缩放级别
    */
  var zoom: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCenter(value: LocationValue): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setCrs(value: EPGS3857 | EPGS3395 | EPGS4326): Self = this.set("crs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrs: Self = this.set("crs", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
