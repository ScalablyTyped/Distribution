package typings.antdDashMobileDashRn.libImageDashPickerIndexDotNativeMod

import typings.antdDashMobileDashRn.libImageDashPickerPropsTypeMod.ImagePickerPropTypes
import typings.antdDashMobileDashRn.libImageDashPickerStyleIndexDotNativeMod.IImagePickerStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagePickerNativeProps extends ImagePickerPropTypes {
  @JSName("styles")
  var styles_ImagePickerNativeProps: js.UndefOr[IImagePickerStyle] = js.undefined
}

object ImagePickerNativeProps {
  @scala.inline
  def apply(
    files: js.Array[js.Object] = null,
    onAddImageClick: () => Unit = null,
    onChange: (/* files */ js.Array[js.Object], /* operationType */ String, /* index */ js.UndefOr[Double]) => Unit = null,
    onFail: /* msg */ String => Unit = null,
    onImageClick: (/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[js.Object]]) => Unit = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    styles: IImagePickerStyle = null
  ): ImagePickerNativeProps = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (onAddImageClick != null) __obj.updateDynamic("onAddImageClick")(js.Any.fromFunction0(onAddImageClick))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onFail != null) __obj.updateDynamic("onFail")(js.Any.fromFunction1(onFail))
    if (onImageClick != null) __obj.updateDynamic("onImageClick")(js.Any.fromFunction2(onImageClick))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePickerNativeProps]
  }
}

