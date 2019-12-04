package typings.atAntDashDesignReactDashNative

import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@ant-design/react-native.@ant-design/react-native/lib/accordion/style.AccordionStyle> */
trait PartialAccordionStyle extends js.Object {
  var arrow: js.UndefOr[TextStyle] = js.undefined
  var container: js.UndefOr[ViewStyle] = js.undefined
  var content: js.UndefOr[ViewStyle] = js.undefined
  var contentText: js.UndefOr[TextStyle] = js.undefined
  var header: js.UndefOr[ViewStyle] = js.undefined
  var headerText: js.UndefOr[TextStyle] = js.undefined
  var headerWrap: js.UndefOr[ViewStyle] = js.undefined
}

object PartialAccordionStyle {
  @scala.inline
  def apply(
    arrow: TextStyle = null,
    container: ViewStyle = null,
    content: ViewStyle = null,
    contentText: TextStyle = null,
    header: ViewStyle = null,
    headerText: TextStyle = null,
    headerWrap: ViewStyle = null
  ): PartialAccordionStyle = {
    val __obj = js.Dynamic.literal()
    if (arrow != null) __obj.updateDynamic("arrow")(arrow.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentText != null) __obj.updateDynamic("contentText")(contentText.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headerText != null) __obj.updateDynamic("headerText")(headerText.asInstanceOf[js.Any])
    if (headerWrap != null) __obj.updateDynamic("headerWrap")(headerWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialAccordionStyle]
  }
}

