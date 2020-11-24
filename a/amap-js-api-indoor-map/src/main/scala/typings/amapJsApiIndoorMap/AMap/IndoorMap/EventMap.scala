package typings.amapJsApiIndoorMap.AMap.IndoorMap

import typings.amapJsApi.AMap.Event_
import typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.click
import typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.complete
import typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.floor_complete
import typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.mouseout
import typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.mouseover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventMap extends js.Object {
  
  var click: MouseEvent[typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.click] = js.native
  
  var complete: Event_[
    typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.complete, 
    js.UndefOr[scala.Nothing]
  ] = js.native
  
  var floor_complete: Event_[typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.floor_complete, SearchResult] = js.native
  
  var mouseout: MouseEvent[typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.mouseout] = js.native
  
  var mouseover: MouseEvent[typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.mouseover] = js.native
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
    def setClick(value: MouseEvent[click]): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: Event_[complete, js.UndefOr[scala.Nothing]]): Self = this.set("complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloor_complete(value: Event_[floor_complete, SearchResult]): Self = this.set("floor_complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseout(value: MouseEvent[mouseout]): Self = this.set("mouseout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseover(value: MouseEvent[mouseover]): Self = this.set("mouseover", value.asInstanceOf[js.Any])
  }
}
