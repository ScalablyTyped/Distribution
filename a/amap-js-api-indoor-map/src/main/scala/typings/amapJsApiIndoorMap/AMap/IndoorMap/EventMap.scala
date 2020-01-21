package typings.amapJsApiIndoorMap.AMap.IndoorMap

import typings.amapJsApi.AMap.Event_
import typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.click
import typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.complete
import typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.floor_complete
import typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.mouseout
import typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.mouseover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var click: MouseEvent[typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.click]
  var complete: Event_[
    typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.complete, 
    js.UndefOr[scala.Nothing]
  ]
  var floor_complete: Event_[typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.floor_complete, SearchResult]
  var mouseout: MouseEvent[typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.mouseout]
  var mouseover: MouseEvent[typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.mouseover]
}

object EventMap {
  @scala.inline
  def apply(
    click: MouseEvent[click],
    complete: Event_[complete, js.UndefOr[scala.Nothing]],
    floor_complete: Event_[floor_complete, SearchResult],
    mouseout: MouseEvent[mouseout],
    mouseover: MouseEvent[mouseover]
  ): EventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], floor_complete = floor_complete.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

