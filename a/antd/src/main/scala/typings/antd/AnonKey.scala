package typings.antd

import typings.react.mod.ReactText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var key: ReactText
  var keyPath: js.Array[ReactText]
}

object AnonKey {
  @scala.inline
  def apply(key: ReactText, keyPath: js.Array[ReactText]): AnonKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKey]
  }
}

