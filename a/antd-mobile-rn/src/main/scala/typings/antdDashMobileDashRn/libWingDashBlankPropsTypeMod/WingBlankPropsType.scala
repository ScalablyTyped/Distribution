package typings.antdDashMobileDashRn.libWingDashBlankPropsTypeMod

import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.lg
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.md
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.sm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WingBlankPropsType extends js.Object {
  var size: js.UndefOr[sm | md | lg] = js.undefined
}

object WingBlankPropsType {
  @scala.inline
  def apply(size: sm | md | lg = null): WingBlankPropsType = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[WingBlankPropsType]
  }
}

