package typings
package antdDashMobileLib.libWingDashBlankPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WingBlankPropsType extends js.Object {
  var size: js.UndefOr[
    antdDashMobileLib.antdDashMobileLibStrings.sm | antdDashMobileLib.antdDashMobileLibStrings.md | antdDashMobileLib.antdDashMobileLibStrings.lg
  ] = js.undefined
}

object WingBlankPropsType {
  @scala.inline
  def apply(
    size: antdDashMobileLib.antdDashMobileLibStrings.sm | antdDashMobileLib.antdDashMobileLibStrings.md | antdDashMobileLib.antdDashMobileLibStrings.lg = null
  ): WingBlankPropsType = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[WingBlankPropsType]
  }
}

