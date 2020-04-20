package typings.antDesignReactNative.styleMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
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
    val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentText = contentText.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerText = headerText.asInstanceOf[js.Any], headerWrap = headerWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionStyle]
  }
}

