package typings
package antdLib.libMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectParam extends js.Object {
  var domEvent: js.Any
  var item: js.Any
  var key: java.lang.String
  var keyPath: js.Array[java.lang.String]
  var selectedKeys: js.Array[java.lang.String]
}

object SelectParam {
  @scala.inline
  def apply(
    domEvent: js.Any,
    item: js.Any,
    key: java.lang.String,
    keyPath: js.Array[java.lang.String],
    selectedKeys: js.Array[java.lang.String]
  ): SelectParam = {
    val __obj = js.Dynamic.literal(domEvent = domEvent, item = item, key = key, keyPath = keyPath, selectedKeys = selectedKeys)
  
    __obj.asInstanceOf[SelectParam]
  }
}

