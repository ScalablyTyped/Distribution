package typings.atAntDashDesignReactDashNative

import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@ant-design/react-native.@ant-design/react-native/lib/picker/style.PickerStyle> */
trait PartialPickerStyle extends js.Object {
  var actionText: js.UndefOr[TextStyle] = js.undefined
  var dismissText: js.UndefOr[TextStyle] = js.undefined
  var header: js.UndefOr[ViewStyle] = js.undefined
  var headerItem: js.UndefOr[ViewStyle] = js.undefined
  var modal: js.UndefOr[ViewStyle] = js.undefined
  var okText: js.UndefOr[TextStyle] = js.undefined
  var title: js.UndefOr[TextStyle] = js.undefined
}

object PartialPickerStyle {
  @scala.inline
  def apply(
    actionText: TextStyle = null,
    dismissText: TextStyle = null,
    header: ViewStyle = null,
    headerItem: ViewStyle = null,
    modal: ViewStyle = null,
    okText: TextStyle = null,
    title: TextStyle = null
  ): PartialPickerStyle = {
    val __obj = js.Dynamic.literal()
    if (actionText != null) __obj.updateDynamic("actionText")(actionText.asInstanceOf[js.Any])
    if (dismissText != null) __obj.updateDynamic("dismissText")(dismissText.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headerItem != null) __obj.updateDynamic("headerItem")(headerItem.asInstanceOf[js.Any])
    if (modal != null) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickerStyle]
  }
}

