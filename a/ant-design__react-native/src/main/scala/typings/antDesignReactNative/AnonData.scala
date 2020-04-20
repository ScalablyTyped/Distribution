package typings.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var cols: Double
  var data: js.Array[scala.Nothing]
  var disabled: Boolean
}

object AnonData {
  @scala.inline
  def apply(cols: Double, data: js.Array[scala.Nothing], disabled: Boolean): AnonData = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

