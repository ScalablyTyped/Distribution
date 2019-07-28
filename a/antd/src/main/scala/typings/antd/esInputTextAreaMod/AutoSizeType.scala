package typings.antd.esInputTextAreaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoSizeType extends js.Object {
  var maxRows: js.UndefOr[Double] = js.undefined
  var minRows: js.UndefOr[Double] = js.undefined
}

object AutoSizeType {
  @scala.inline
  def apply(maxRows: Int | Double = null, minRows: Int | Double = null): AutoSizeType = {
    val __obj = js.Dynamic.literal()
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (minRows != null) __obj.updateDynamic("minRows")(minRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoSizeType]
  }
}

