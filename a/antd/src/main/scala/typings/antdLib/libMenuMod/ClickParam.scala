package typings
package antdLib.libMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickParam extends js.Object {
  var domEvent: js.Any
  var item: js.Any
  var key: java.lang.String
  var keyPath: js.Array[java.lang.String]
}

object ClickParam {
  @scala.inline
  def apply(domEvent: js.Any, item: js.Any, key: java.lang.String, keyPath: js.Array[java.lang.String]): ClickParam = {
    val __obj = js.Dynamic.literal(domEvent = domEvent, item = item, key = key, keyPath = keyPath)
  
    __obj.asInstanceOf[ClickParam]
  }
}

