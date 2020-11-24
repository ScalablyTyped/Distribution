package typings.amapJsApiMapType.AMap.MapType

import typings.amapJsApiMapType.amapJsApiMapTypeNumbers.`0`
import typings.amapJsApiMapType.amapJsApiMapTypeNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * 初始化默认图层类型，默认为0
    * 取值为0：默认底图
    * 取值为1：卫星图
    */
  var defaultType: js.UndefOr[`0` | `1`] = js.native
  
  /**
    * 是否叠加路网图层，默认false
    */
  var showRoad: js.UndefOr[Boolean] = js.native
  
  /**
    * 是否叠加实时交通图层，默认false
    */
  var showTraffic: js.UndefOr[Boolean] = js.native
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
    def setDefaultType(value: `0` | `1`): Self = this.set("defaultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultType: Self = this.set("defaultType", js.undefined)
    
    @scala.inline
    def setShowRoad(value: Boolean): Self = this.set("showRoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRoad: Self = this.set("showRoad", js.undefined)
    
    @scala.inline
    def setShowTraffic(value: Boolean): Self = this.set("showTraffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTraffic: Self = this.set("showTraffic", js.undefined)
  }
}
