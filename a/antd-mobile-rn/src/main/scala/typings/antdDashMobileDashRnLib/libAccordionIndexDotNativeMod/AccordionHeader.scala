package typings
package antdDashMobileDashRnLib.libAccordionIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionHeader extends js.Object {
  var content: reactLib.reactMod.ReactNs.ReactElement[_]
  var style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  var title: java.lang.String
}

object AccordionHeader {
  @scala.inline
  def apply(
    content: reactLib.reactMod.ReactNs.ReactElement[_],
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle],
    title: java.lang.String
  ): AccordionHeader = {
    val __obj = js.Dynamic.literal(content = content, style = style.asInstanceOf[js.Any], title = title)
  
    __obj.asInstanceOf[AccordionHeader]
  }
}

