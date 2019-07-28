package typings.antd

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DomEvent extends js.Object {
  var domEvent: MouseEvent
  var key: String
}

object Anon_DomEvent {
  @scala.inline
  def apply(domEvent: MouseEvent, key: String): Anon_DomEvent = {
    val __obj = js.Dynamic.literal(domEvent = domEvent, key = key)
  
    __obj.asInstanceOf[Anon_DomEvent]
  }
}

