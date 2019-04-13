package typings
package antdLib.libStepsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepsProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var current: js.UndefOr[scala.Double] = js.undefined
  var direction: js.UndefOr[antdLib.antdLibStrings.horizontal | antdLib.antdLibStrings.vertical] = js.undefined
  var iconPrefix: js.UndefOr[java.lang.String] = js.undefined
  var initial: js.UndefOr[scala.Double] = js.undefined
  var labelPlacement: js.UndefOr[antdLib.antdLibStrings.horizontal | antdLib.antdLibStrings.vertical] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var progressDot: js.UndefOr[scala.Boolean | js.Function] = js.undefined
  var size: js.UndefOr[antdLib.antdLibStrings.default | antdLib.antdLibStrings.small] = js.undefined
  var status: js.UndefOr[
    antdLib.antdLibStrings.wait | antdLib.antdLibStrings.process | antdLib.antdLibStrings.finish | antdLib.antdLibStrings.error
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object StepsProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    current: scala.Int | scala.Double = null,
    direction: antdLib.antdLibStrings.horizontal | antdLib.antdLibStrings.vertical = null,
    iconPrefix: java.lang.String = null,
    initial: scala.Int | scala.Double = null,
    labelPlacement: antdLib.antdLibStrings.horizontal | antdLib.antdLibStrings.vertical = null,
    prefixCls: java.lang.String = null,
    progressDot: scala.Boolean | js.Function = null,
    size: antdLib.antdLibStrings.default | antdLib.antdLibStrings.small = null,
    status: antdLib.antdLibStrings.wait | antdLib.antdLibStrings.process | antdLib.antdLibStrings.finish | antdLib.antdLibStrings.error = null,
    style: reactLib.reactMod.CSSProperties = null
  ): StepsProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (iconPrefix != null) __obj.updateDynamic("iconPrefix")(iconPrefix)
    if (initial != null) __obj.updateDynamic("initial")(initial.asInstanceOf[js.Any])
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (progressDot != null) __obj.updateDynamic("progressDot")(progressDot.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[StepsProps]
  }
}

