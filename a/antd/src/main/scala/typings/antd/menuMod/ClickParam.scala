package typings.antd.menuMod

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickParam extends js.Object {
  var domEvent: Event_
  var item: js.Any
  var key: String
  var keyPath: js.Array[String]
}

object ClickParam {
  @scala.inline
  def apply(domEvent: Event_, item: js.Any, key: String, keyPath: js.Array[String]): ClickParam = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickParam]
  }
}

