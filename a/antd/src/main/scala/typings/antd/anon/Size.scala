package typings.antd.anon

import typings.antd.sizeContextMod.SizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var size: js.UndefOr[SizeType | Double] = js.undefined
}

object Size {
  @scala.inline
  def apply(size: SizeType | Double = null): Size = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
}

