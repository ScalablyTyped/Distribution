package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataValue extends js.Object {
  var data: js.Any
  var value: js.Any
}

object DataValue {
  @scala.inline
  def apply(data: js.Any, value: js.Any): DataValue = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataValue]
  }
}

