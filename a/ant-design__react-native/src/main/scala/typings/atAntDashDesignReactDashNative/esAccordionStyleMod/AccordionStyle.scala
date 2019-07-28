package typings.atAntDashDesignReactDashNative.esAccordionStyleMod

import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionStyle extends js.Object {
  var arrow: TextStyle
  var container: ViewStyle
  var content: ViewStyle
  var contentText: TextStyle
  var header: ViewStyle
  var headerText: TextStyle
  var headerWrap: ViewStyle
}

object AccordionStyle {
  @scala.inline
  def apply(
    arrow: TextStyle,
    container: ViewStyle,
    content: ViewStyle,
    contentText: TextStyle,
    header: ViewStyle,
    headerText: TextStyle,
    headerWrap: ViewStyle
  ): AccordionStyle = {
    val __obj = js.Dynamic.literal(arrow = arrow, container = container, content = content, contentText = contentText, header = header, headerText = headerText, headerWrap = headerWrap)
  
    __obj.asInstanceOf[AccordionStyle]
  }
}

