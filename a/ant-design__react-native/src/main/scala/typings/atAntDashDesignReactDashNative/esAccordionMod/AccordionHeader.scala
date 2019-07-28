package typings.atAntDashDesignReactDashNative.esAccordionMod

import typings.react.reactMod.ReactElement
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionHeader extends js.Object {
  var content: ReactElement
  var style: StyleProp[ViewStyle]
  var title: String
}

object AccordionHeader {
  @scala.inline
  def apply(content: ReactElement, style: StyleProp[ViewStyle], title: String): AccordionHeader = {
    val __obj = js.Dynamic.literal(content = content, style = style.asInstanceOf[js.Any], title = title)
  
    __obj.asInstanceOf[AccordionHeader]
  }
}

