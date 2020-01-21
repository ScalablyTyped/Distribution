package typings.amapJsApiMapType.AMap.MapType

import typings.amapJsApi.AMap.Event_
import typings.amapJsApiMapType.amapJsApiMapTypeStrings.hide
import typings.amapJsApiMapType.amapJsApiMapTypeStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var hide: Event_[typings.amapJsApiMapType.amapJsApiMapTypeStrings.hide, js.UndefOr[scala.Nothing]]
  var show: Event_[typings.amapJsApiMapType.amapJsApiMapTypeStrings.show, js.UndefOr[scala.Nothing]]
}

object EventMap {
  @scala.inline
  def apply(hide: Event_[hide, js.UndefOr[scala.Nothing]], show: Event_[show, js.UndefOr[scala.Nothing]]): EventMap = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

