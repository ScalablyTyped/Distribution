package typings.antdDashMobile.esAccordionMod

import typings.antdDashMobile.esAccordionPropsTypeMod.AccordionPropsTypes
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionProps extends AccordionPropsTypes {
  var accordion: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var openAnimation: js.UndefOr[js.Any] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object AccordionProps {
  @scala.inline
  def apply(
    accordion: js.UndefOr[Boolean] = js.undefined,
    activeKey: String | js.Array[String] = null,
    className: String = null,
    defaultActiveKey: String | js.Array[String] = null,
    onChange: /* x */ js.Any => Unit = null,
    openAnimation: js.Any = null,
    prefixCls: String = null,
    style: CSSProperties = null
  ): AccordionProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accordion)) __obj.updateDynamic("accordion")(accordion.asInstanceOf[js.Any])
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultActiveKey != null) __obj.updateDynamic("defaultActiveKey")(defaultActiveKey.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (openAnimation != null) __obj.updateDynamic("openAnimation")(openAnimation.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionProps]
  }
}

