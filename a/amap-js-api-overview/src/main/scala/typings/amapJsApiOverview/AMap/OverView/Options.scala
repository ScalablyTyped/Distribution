package typings.amapJsApiOverview.AMap.OverView

import typings.amapJsApi.AMap.TileLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[L /* <: TileLayer */] extends js.Object {
  
  /**
    * 鹰眼是否展开，默认为false
    */
  var isOpen: js.UndefOr[Boolean] = js.native
  
  /**
    * 鹰眼窗体中需显示的切片图层
    */
  var tileLayer: js.UndefOr[L] = js.native
  
  /**
    * 鹰眼是否显示，默认为true
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply[L /* <: TileLayer */](): Options[L] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[L]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], L /* <: TileLayer */] (val x: Self with Options[L]) extends AnyVal {
    
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
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    
    @scala.inline
    def setTileLayer(value: L): Self = this.set("tileLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileLayer: Self = this.set("tileLayer", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
