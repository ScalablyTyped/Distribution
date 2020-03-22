package typings.antd.sizeContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeContextProps extends js.Object {
  var size: js.UndefOr[SizeType] = js.undefined
}

object SizeContextProps {
  @scala.inline
  def apply(size: SizeType = null): SizeContextProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeContextProps]
  }
}

