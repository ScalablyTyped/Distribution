package typings.antdDashMobile.esImageDashPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagePickerPropTypes
  extends typings.antdDashMobile.esImageDashPickerPropsTypeMod.ImagePickerPropTypes {
  var className: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
}

object ImagePickerPropTypes {
  @scala.inline
  def apply(
    accept: String = null,
    capture: js.Any = null,
    className: String = null,
    disableDelete: js.UndefOr[Boolean] = js.undefined,
    files: js.Array[js.Object] = null,
    length: Double | String = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onAddImageClick: () => Unit = null,
    onChange: (/* files */ js.Array[js.Object], /* operationType */ String, /* index */ js.UndefOr[Double]) => Unit = null,
    onFail: /* msg */ String => Unit = null,
    onImageClick: (/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[js.Object]]) => Unit = null,
    prefixCls: String = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null
  ): ImagePickerPropTypes = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (capture != null) __obj.updateDynamic("capture")(capture)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disableDelete)) __obj.updateDynamic("disableDelete")(disableDelete)
    if (files != null) __obj.updateDynamic("files")(files)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (onAddImageClick != null) __obj.updateDynamic("onAddImageClick")(js.Any.fromFunction0(onAddImageClick))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onFail != null) __obj.updateDynamic("onFail")(js.Any.fromFunction1(onFail))
    if (onImageClick != null) __obj.updateDynamic("onImageClick")(js.Any.fromFunction2(onImageClick))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ImagePickerPropTypes]
  }
}

