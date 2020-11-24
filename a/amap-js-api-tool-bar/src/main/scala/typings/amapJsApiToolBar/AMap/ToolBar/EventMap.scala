package typings.amapJsApiToolBar.AMap.ToolBar

import typings.amapJsApi.AMap.Event_
import typings.amapJsApiToolBar.amapJsApiToolBarStrings.`location-failed`
import typings.amapJsApiToolBar.amapJsApiToolBarStrings.`location-success`
import typings.amapJsApiToolBar.amapJsApiToolBarStrings.hide
import typings.amapJsApiToolBar.amapJsApiToolBarStrings.location
import typings.amapJsApiToolBar.amapJsApiToolBarStrings.show
import typings.amapJsApiToolBar.amapJsApiToolBarStrings.zoomin
import typings.amapJsApiToolBar.amapJsApiToolBarStrings.zoomout
import typings.amapJsApiToolBar.anon.Lnglat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventMap extends js.Object {
  
  var hide: Event_[typings.amapJsApiToolBar.amapJsApiToolBarStrings.hide, js.UndefOr[scala.Nothing]] = js.native
  
  var location: Event_[typings.amapJsApiToolBar.amapJsApiToolBarStrings.location, Lnglat] = js.native
  
   // TODO geolocation.getCurrentPosition
  var `location-failed`: Event_[
    typings.amapJsApiToolBar.amapJsApiToolBarStrings.`location-failed`, 
    js.UndefOr[scala.Nothing]
  ] = js.native
  
  // internal
  var `location-success`: Event_[
    typings.amapJsApiToolBar.amapJsApiToolBarStrings.`location-success`, 
    js.UndefOr[scala.Nothing]
  ] = js.native
  
  var show: Event_[typings.amapJsApiToolBar.amapJsApiToolBarStrings.show, js.UndefOr[scala.Nothing]] = js.native
  
  var zoomchanged: Event_[zoomin | zoomout, js.UndefOr[scala.Nothing]] = js.native
}
object EventMap {
  
  @scala.inline
  def apply(
    hide: Event_[hide, js.UndefOr[scala.Nothing]],
    location: Event_[location, Lnglat],
    `location-failed`: Event_[`location-failed`, js.UndefOr[scala.Nothing]],
    `location-success`: Event_[`location-success`, js.UndefOr[scala.Nothing]],
    show: Event_[show, js.UndefOr[scala.Nothing]],
    zoomchanged: Event_[zoomin | zoomout, js.UndefOr[scala.Nothing]]
  ): EventMap = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], zoomchanged = zoomchanged.asInstanceOf[js.Any])
    __obj.updateDynamic("location-failed")(`location-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("location-success")(`location-success`.asInstanceOf[js.Any])
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
    def setLocation(value: Event_[location, Lnglat]): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLocation-failed`(value: Event_[`location-failed`, js.UndefOr[scala.Nothing]]): Self = this.set("location-failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLocation-success`(value: Event_[`location-success`, js.UndefOr[scala.Nothing]]): Self = this.set("location-success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: Event_[show, js.UndefOr[scala.Nothing]]): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomchanged(value: Event_[zoomin | zoomout, js.UndefOr[scala.Nothing]]): Self = this.set("zoomchanged", value.asInstanceOf[js.Any])
  }
}
