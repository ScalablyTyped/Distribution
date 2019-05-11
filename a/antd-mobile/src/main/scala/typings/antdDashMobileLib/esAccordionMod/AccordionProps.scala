package typings
package antdDashMobileLib.esAccordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionProps
  extends antdDashMobileLib.esAccordionPropsTypeMod.AccordionPropsTypes {
  var accordion: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var openAnimation: js.UndefOr[js.Any] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object AccordionProps {
  @scala.inline
  def apply(
    accordion: js.UndefOr[scala.Boolean] = js.undefined,
    activeKey: java.lang.String | js.Array[java.lang.String] = null,
    className: java.lang.String = null,
    defaultActiveKey: java.lang.String | js.Array[java.lang.String] = null,
    onChange: /* x */ js.Any => scala.Unit = null,
    openAnimation: js.Any = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null
  ): AccordionProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accordion)) __obj.updateDynamic("accordion")(accordion)
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultActiveKey != null) __obj.updateDynamic("defaultActiveKey")(defaultActiveKey.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (openAnimation != null) __obj.updateDynamic("openAnimation")(openAnimation)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[AccordionProps]
  }
}

