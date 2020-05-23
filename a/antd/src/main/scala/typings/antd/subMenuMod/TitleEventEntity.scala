package typings.antd.subMenuMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleEventEntity extends js.Object {
  var domEvent: Event
  var key: String
}

object TitleEventEntity {
  @scala.inline
  def apply(domEvent: Event, key: String): TitleEventEntity = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleEventEntity]
  }
}

