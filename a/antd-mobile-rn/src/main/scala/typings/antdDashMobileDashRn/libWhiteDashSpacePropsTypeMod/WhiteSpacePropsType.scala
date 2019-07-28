package typings.antdDashMobileDashRn.libWhiteDashSpacePropsTypeMod

import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.lg
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.md
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.sm
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.xl
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.xs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhiteSpacePropsType extends js.Object {
  var size: js.UndefOr[xs | sm | md | lg | xl] = js.undefined
}

object WhiteSpacePropsType {
  @scala.inline
  def apply(size: xs | sm | md | lg | xl = null): WhiteSpacePropsType = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiteSpacePropsType]
  }
}

