package typings.antd

import typings.antd.sizeContextMod.SizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSize extends js.Object {
  var size: js.UndefOr[SizeType | Double] = js.undefined
}

object AnonSize {
  @scala.inline
  def apply(size: SizeType | Double = null): AnonSize = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSize]
  }
}

