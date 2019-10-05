package typings.atAntDashDesignIconsDashReact.libComponentsIconMod

import typings.atAntDashDesignIcons.libTypesMod.IconDefinition
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var focusable: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var primaryColor: js.UndefOr[String] = js.undefined
  var secondaryColor: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var `type`: String | IconDefinition
}

object IconProps {
  @scala.inline
  def apply(
    `type`: String | IconDefinition,
    className: String = null,
    focusable: String = null,
    onClick: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit = null,
    primaryColor: String = null,
    secondaryColor: String = null,
    style: CSSProperties = null
  ): IconProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (focusable != null) __obj.updateDynamic("focusable")(focusable)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor)
    if (secondaryColor != null) __obj.updateDynamic("secondaryColor")(secondaryColor)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[IconProps]
  }
}

