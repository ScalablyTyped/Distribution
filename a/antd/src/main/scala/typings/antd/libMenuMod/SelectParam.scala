package typings.antd.libMenuMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectParam extends js.Object {
  var domEvent: Event
  var item: js.Any
  var key: String
  var keyPath: js.Array[String]
  var selectedKeys: js.Array[String]
}

object SelectParam {
  @scala.inline
  def apply(
    domEvent: Event,
    item: js.Any,
    key: String,
    keyPath: js.Array[String],
    selectedKeys: js.Array[String]
  ): SelectParam = {
    val __obj = js.Dynamic.literal(domEvent = domEvent, item = item, key = key, keyPath = keyPath, selectedKeys = selectedKeys)
  
    __obj.asInstanceOf[SelectParam]
  }
}

