package typings
package antdDashMobileLib.libWhiteDashSpacePropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhiteSpacePropsType extends js.Object {
  var size: js.UndefOr[
    antdDashMobileLib.antdDashMobileLibStrings.xs | antdDashMobileLib.antdDashMobileLibStrings.sm | antdDashMobileLib.antdDashMobileLibStrings.md | antdDashMobileLib.antdDashMobileLibStrings.lg | antdDashMobileLib.antdDashMobileLibStrings.xl
  ] = js.undefined
}

object WhiteSpacePropsType {
  @scala.inline
  def apply(
    size: antdDashMobileLib.antdDashMobileLibStrings.xs | antdDashMobileLib.antdDashMobileLibStrings.sm | antdDashMobileLib.antdDashMobileLibStrings.md | antdDashMobileLib.antdDashMobileLibStrings.lg | antdDashMobileLib.antdDashMobileLibStrings.xl = null
  ): WhiteSpacePropsType = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiteSpacePropsType]
  }
}

