package typings
package antdDashMobileLib.libStepsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepsProps
  extends antdDashMobileLib.libStepsPropsTypeMod.StepsPropsType {
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var iconPrefix: js.UndefOr[java.lang.String] = js.undefined
  var labelPlacement: js.UndefOr[java.lang.String] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object StepsProps {
  @scala.inline
  def apply(
    children: js.Array[_],
    current: scala.Int | scala.Double = null,
    direction: java.lang.String = null,
    iconPrefix: java.lang.String = null,
    labelPlacement: java.lang.String = null,
    prefixCls: java.lang.String = null,
    size: java.lang.String = null,
    status: java.lang.String = null
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

