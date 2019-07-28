package typings.antd.esMenuMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickParam extends js.Object {
  var domEvent: Event
  var item: js.Any
  var key: String
  var keyPath: js.Array[String]
}

object ClickParam {
  @scala.inline
  def apply(domEvent: Event, item: js.Any, key: String, keyPath: js.Array[String]): ClickParam = {
    val __obj = js.Dynamic.literal(domEvent = domEvent, item = item, key = key, keyPath = keyPath)
  
    __obj.asInstanceOf[ClickParam]
  }
}

