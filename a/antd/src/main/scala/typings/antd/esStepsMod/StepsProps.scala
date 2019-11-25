package typings.antd.esStepsMod

import typings.antd.antdStrings.error
import typings.antd.antdStrings.finish
import typings.antd.antdStrings.horizontal
import typings.antd.antdStrings.navigation
import typings.antd.antdStrings.process
import typings.antd.antdStrings.small
import typings.antd.antdStrings.vertical
import typings.antd.antdStrings.wait
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepsProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var current: js.UndefOr[Double] = js.undefined
  var direction: js.UndefOr[horizontal | vertical] = js.undefined
  var iconPrefix: js.UndefOr[String] = js.undefined
  var initial: js.UndefOr[Double] = js.undefined
  var labelPlacement: js.UndefOr[horizontal | vertical] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* current */ Double, Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var progressDot: js.UndefOr[Boolean | js.Function] = js.undefined
  var size: js.UndefOr[typings.antd.antdStrings.default | small] = js.undefined
  var status: js.UndefOr[wait | process | finish | error] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var `type`: js.UndefOr[typings.antd.antdStrings.default | navigation] = js.undefined
}

object StepsProps {
  @scala.inline
  def apply(
    className: String = null,
    current: Int | Double = null,
    direction: horizontal | vertical = null,
    iconPrefix: String = null,
    initial: Int | Double = null,
    labelPlacement: horizontal | vertical = null,
    onChange: /* current */ Double => Unit = null,
    prefixCls: String = null,
    progressDot: Boolean | js.Function = null,
    size: typings.antd.antdStrings.default | small = null,
    status: wait | process | finish | error = null,
    style: CSSProperties = null,
    `type`: typings.antd.antdStrings.default | navigation = null
  ): StepsProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (iconPrefix != null) __obj.updateDynamic("iconPrefix")(iconPrefix.asInstanceOf[js.Any])
    if (initial != null) __obj.updateDynamic("initial")(initial.asInstanceOf[js.Any])
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (progressDot != null) __obj.updateDynamic("progressDot")(progressDot.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepsProps]
  }
}

