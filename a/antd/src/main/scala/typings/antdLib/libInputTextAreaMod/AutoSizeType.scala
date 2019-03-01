package typings
package antdLib.libInputTextAreaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoSizeType extends js.Object {
  var maxRows: js.UndefOr[scala.Double] = js.undefined
  var minRows: js.UndefOr[scala.Double] = js.undefined
}

object AutoSizeType {
  @scala.inline
  def apply(maxRows: scala.Int | scala.Double = null, minRows: scala.Int | scala.Double = null): AutoSizeType = {
    val __obj = js.Dynamic.literal()
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (minRows != null) __obj.updateDynamic("minRows")(minRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoSizeType]
  }
}

