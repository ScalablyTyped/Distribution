package typings.amapJsApiControlBar.AMap.ControlBar

import typings.amapJsApi.AMap.Event_
import typings.amapJsApiControlBar.amapJsApiControlBarStrings.hide
import typings.amapJsApiControlBar.amapJsApiControlBarStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventMap extends js.Object {
  
  var hide: Event_[
    typings.amapJsApiControlBar.amapJsApiControlBarStrings.hide, 
    js.UndefOr[scala.Nothing]
  ] = js.native
  
  var show: Event_[
    typings.amapJsApiControlBar.amapJsApiControlBarStrings.show, 
    js.UndefOr[scala.Nothing]
  ] = js.native
}
object EventMap {
  
  @scala.inline
  def apply(hide: Event_[hide, js.UndefOr[scala.Nothing]], show: Event_[show, js.UndefOr[scala.Nothing]]): EventMap = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
  
  @scala.inline
  implicit class EventMapOps[Self <: EventMap] (val x: Self) extends AnyVal {
    
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
    def setHide(value: Event_[hide, js.UndefOr[scala.Nothing]]): Self = this.set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: Event_[show, js.UndefOr[scala.Nothing]]): Self = this.set("show", value.asInstanceOf[js.Any])
  }
}
