package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var cols: Double
  var data: js.Array[scala.Nothing]
  var disabled: Boolean
}

object Data {
  @scala.inline
  def apply(cols: Double, data: js.Array[scala.Nothing], disabled: Boolean): Data = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

