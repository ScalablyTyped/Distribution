package typings.amapJsApiToolBar.AMap.ToolBar

import typings.amapJsApi.AMap.Event_
import typings.amapJsApiToolBar.AnonLnglat
import typings.amapJsApiToolBar.amapJsApiToolBarStrings.`location-failed`
import typings.amapJsApiToolBar.amapJsApiToolBarStrings.`location-success`
import typings.amapJsApiToolBar.amapJsApiToolBarStrings.hide
import typings.amapJsApiToolBar.amapJsApiToolBarStrings.location
import typings.amapJsApiToolBar.amapJsApiToolBarStrings.show
import typings.amapJsApiToolBar.amapJsApiToolBarStrings.zoomin
import typings.amapJsApiToolBar.amapJsApiToolBarStrings.zoomout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var hide: Event_[typings.amapJsApiToolBar.amapJsApiToolBarStrings.hide, js.UndefOr[scala.Nothing]]
  var location: Event_[typings.amapJsApiToolBar.amapJsApiToolBarStrings.location, AnonLnglat]
   // TODO geolocation.getCurrentPosition
  var `location-failed`: Event_[
    typings.amapJsApiToolBar.amapJsApiToolBarStrings.`location-failed`, 
    js.UndefOr[scala.Nothing]
  ]
  // internal
  var `location-success`: Event_[
    typings.amapJsApiToolBar.amapJsApiToolBarStrings.`location-success`, 
    js.UndefOr[scala.Nothing]
  ]
  var show: Event_[typings.amapJsApiToolBar.amapJsApiToolBarStrings.show, js.UndefOr[scala.Nothing]]
  var zoomchanged: Event_[zoomin | zoomout, js.UndefOr[scala.Nothing]]
}

object EventMap {
  @scala.inline
  def apply(
    hide: Event_[hide, js.UndefOr[scala.Nothing]],
    location: Event_[location, AnonLnglat],
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
}

