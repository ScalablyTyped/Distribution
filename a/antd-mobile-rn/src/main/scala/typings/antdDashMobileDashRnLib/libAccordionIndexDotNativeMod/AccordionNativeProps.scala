package typings
package antdDashMobileDashRnLib.libAccordionIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionNativeProps
  extends antdDashMobileDashRnLib.libAccordionPropsTypeMod.AccordionPropsTypes {
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var styles: js.UndefOr[antdDashMobileDashRnLib.libAccordionStyleIndexDotNativeMod.AccordionStyle] = js.undefined
}

object AccordionNativeProps {
  @scala.inline
  def apply(
    activeKey: java.lang.String | js.Array[java.lang.String] = null,
    defaultActiveKey: java.lang.String | js.Array[java.lang.String] = null,
    onChange: /* x */ js.Any => scala.Unit = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    styles: antdDashMobileDashRnLib.libAccordionStyleIndexDotNativeMod.AccordionStyle = null
  ): AccordionNativeProps = {
    val __obj = js.Dynamic.literal()
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (defaultActiveKey != null) __obj.updateDynamic("defaultActiveKey")(defaultActiveKey.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[AccordionNativeProps]
  }
}

