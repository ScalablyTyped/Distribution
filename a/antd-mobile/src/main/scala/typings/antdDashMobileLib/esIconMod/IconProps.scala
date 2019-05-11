package typings
package antdDashMobileLib.esIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLProps<std.SVGSVGElement>, 'size' | 'type'> ]: react.react.HTMLProps<std.SVGSVGElement>[P]} */ trait IconProps
  extends antdDashMobileLib.esIconPropsTypeMod.IconPropsType {
  var onClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.SVGSVGElement]] = js.undefined
  var size: js.UndefOr[
    antdDashMobileLib.antdDashMobileLibStrings.xxs | antdDashMobileLib.antdDashMobileLibStrings.xs | antdDashMobileLib.antdDashMobileLibStrings.sm | antdDashMobileLib.antdDashMobileLibStrings.md | antdDashMobileLib.antdDashMobileLibStrings.lg
  ] = js.undefined
}

object IconProps {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    color: java.lang.String = null,
    onClick: reactLib.reactMod.MouseEventHandler[stdLib.SVGSVGElement] = null,
    size: antdDashMobileLib.antdDashMobileLibStrings.xxs | antdDashMobileLib.antdDashMobileLibStrings.xs | antdDashMobileLib.antdDashMobileLibStrings.sm | antdDashMobileLib.antdDashMobileLibStrings.md | antdDashMobileLib.antdDashMobileLibStrings.lg = null
  ): IconProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (color != null) __obj.updateDynamic("color")(color)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
}

