package typings.antd

import typings.antd.antdStrings.circle
import typings.antd.antdStrings.default
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.antd.antdStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCircle extends js.Object {
  var shape: js.UndefOr[circle | square] = js.undefined
  var size: js.UndefOr[Double | small | default | large] = js.undefined
}

object AnonCircle {
  @scala.inline
  def apply(shape: circle | square = null, size: Double | small | default | large = null): AnonCircle = {
    val __obj = js.Dynamic.literal()
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCircle]
  }
}

