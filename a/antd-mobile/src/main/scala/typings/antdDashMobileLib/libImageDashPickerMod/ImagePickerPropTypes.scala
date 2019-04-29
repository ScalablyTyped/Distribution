package typings
package antdDashMobileLib.libImageDashPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagePickerPropTypes
  extends antdDashMobileLib.libImageDashPickerPropsTypeMod.ImagePickerPropTypes {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
}

object ImagePickerPropTypes {
  @scala.inline
  def apply(
    accept: java.lang.String = null,
    capture: js.Any = null,
    className: java.lang.String = null,
    disableDelete: js.UndefOr[scala.Boolean] = js.undefined,
    files: js.Array[js.Object] = null,
    length: scala.Double | java.lang.String = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    onAddImageClick: () => scala.Unit = null,
    onChange: (/* files */ js.Array[js.Object], /* operationType */ java.lang.String, /* index */ js.UndefOr[scala.Double]) => scala.Unit = null,
    onFail: /* msg */ java.lang.String => scala.Unit = null,
    onImageClick: (/* index */ js.UndefOr[scala.Double], /* files */ js.UndefOr[js.Array[js.Object]]) => scala.Unit = null,
    prefixCls: java.lang.String = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
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

