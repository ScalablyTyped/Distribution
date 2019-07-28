package typings.antdDashMobile.esStepsMod

import typings.antdDashMobile.esStepsPropsTypeMod.StepsPropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepsProps extends StepsPropsType {
  var direction: js.UndefOr[String] = js.undefined
  var iconPrefix: js.UndefOr[String] = js.undefined
  var labelPlacement: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
}

object StepsProps {
  @scala.inline
  def apply(
    children: js.Array[_],
    current: Int | Double = null,
    direction: String = null,
    iconPrefix: String = null,
    labelPlacement: String = null,
    prefixCls: String = null,
    size: String = null,
    status: String = null
  ): StepsProps = {
    val __obj = js.Dynamic.literal(children = children)
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (iconPrefix != null) __obj.updateDynamic("iconPrefix")(iconPrefix)
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (size != null) __obj.updateDynamic("size")(size)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[StepsProps]
  }
}

