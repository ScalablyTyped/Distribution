package typings
package antdDashMobileDashRnLib.libWhiteDashSpacePropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhiteSpacePropsType extends js.Object {
  var size: js.UndefOr[
    antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.xs | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.sm | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.md | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.lg | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.xl
  ] = js.undefined
}

object WhiteSpacePropsType {
  @scala.inline
  def apply(
    size: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.xs | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.sm | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.md | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.lg | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.xl = null
  ): WhiteSpacePropsType = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiteSpacePropsType]
  }
}

