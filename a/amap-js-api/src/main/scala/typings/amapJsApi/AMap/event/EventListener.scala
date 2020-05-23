package typings.amapJsApi.AMap.event

import typings.amapJsApi.amapJsApiNumbers.`0`
import typings.amapJsApi.amapJsApiNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventListener[T /* <: `0` | `1` */] extends js.Object {
  var `type`: T
}

object EventListener {
  @scala.inline
  def apply[T](`type`: T): EventListener[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventListener[T]]
  }
}

