package typings.antdDashMobile.libIconMod

import typings.antdDashMobile.antdDashMobileStrings.lg
import typings.antdDashMobile.antdDashMobileStrings.md
import typings.antdDashMobile.antdDashMobileStrings.sm
import typings.antdDashMobile.antdDashMobileStrings.xs
import typings.antdDashMobile.antdDashMobileStrings.xxs
import typings.antdDashMobile.libIconPropsTypeMod.IconPropsType
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLProps<std.SVGSVGElement>, 'size' | 'type'> ]: react.react.HTMLProps<std.SVGSVGElement>[P]} */ trait IconProps extends IconPropsType {
  var onClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var size: js.UndefOr[xxs | xs | sm | md | lg] = js.undefined
}

object IconProps {
  @scala.inline
  def apply(
    `type`: String,
    color: String = null,
    onClick: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit = null,
    size: xxs | xs | sm | md | lg = null
  ): IconProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
}

