package typings.antdDashMobile.esWhiteDashSpacePropsTypeMod

import typings.antdDashMobile.antdDashMobileStrings.lg
import typings.antdDashMobile.antdDashMobileStrings.md
import typings.antdDashMobile.antdDashMobileStrings.sm
import typings.antdDashMobile.antdDashMobileStrings.xl
import typings.antdDashMobile.antdDashMobileStrings.xs
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

