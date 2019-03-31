package typings
package antdDashMobileDashRnLib.libWingDashBlankPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WingBlankPropsType extends js.Object {
  var size: js.UndefOr[
    antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.sm | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.md | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.lg
  ] = js.undefined
}

object WingBlankPropsType {
  @scala.inline
  def apply(
    size: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.sm | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.md | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.lg = null
  ): WingBlankPropsType = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[WingBlankPropsType]
  }
}

