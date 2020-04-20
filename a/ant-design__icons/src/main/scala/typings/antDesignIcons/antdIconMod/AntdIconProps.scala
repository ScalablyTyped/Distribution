package typings.antDesignIcons.antdIconMod

import typings.antDesignIcons.iconMod.IconBaseProps
import typings.antDesignIcons.twoTonePrimaryColorMod.TwoToneColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntdIconProps extends IconBaseProps {
  var twoToneColor: js.UndefOr[TwoToneColor] = js.undefined
}

object AntdIconProps {
  @scala.inline
  def apply(IconBaseProps: IconBaseProps = null, twoToneColor: TwoToneColor = null): AntdIconProps = {
    val __obj = js.Dynamic.literal()
    if (IconBaseProps != null) js.Dynamic.global.Object.assign(__obj, IconBaseProps)
    if (twoToneColor != null) __obj.updateDynamic("twoToneColor")(twoToneColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntdIconProps]
  }
}

