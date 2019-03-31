package typings
package antdDashMobileDashRnLib.libImageDashPickerIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagePickerNativeProps
  extends antdDashMobileDashRnLib.libImageDashPickerPropsTypeMod.ImagePickerPropTypes {
  @JSName("styles")
  var styles_ImagePickerNativeProps: js.UndefOr[
    antdDashMobileDashRnLib.libImageDashPickerStyleIndexDotNativeMod.IImagePickerStyle
  ] = js.undefined
}

object ImagePickerNativeProps {
  @scala.inline
  def apply(
    files: js.Array[js.Object] = null,
    onAddImageClick: () => scala.Unit = null,
    onChange: (/* files */ js.Array[js.Object], /* operationType */ java.lang.String, /* index */ js.UndefOr[scala.Double]) => scala.Unit = null,
    onFail: /* msg */ java.lang.String => scala.Unit = null,
    onImageClick: (/* index */ js.UndefOr[scala.Double], /* files */ js.UndefOr[js.Array[js.Object]]) => scala.Unit = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    styles: antdDashMobileDashRnLib.libImageDashPickerStyleIndexDotNativeMod.IImagePickerStyle = null
  ): ImagePickerNativeProps = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files)
    if (onAddImageClick != null) __obj.updateDynamic("onAddImageClick")(js.Any.fromFunction0(onAddImageClick))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onFail != null) __obj.updateDynamic("onFail")(js.Any.fromFunction1(onFail))
    if (onImageClick != null) __obj.updateDynamic("onImageClick")(js.Any.fromFunction2(onImageClick))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[ImagePickerNativeProps]
  }
}

