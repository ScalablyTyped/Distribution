package typings
package antdDashMobileLib.esImageDashPickerPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagePickerPropTypes extends js.Object {
  var accept: js.UndefOr[java.lang.String] = js.undefined
  var capture: js.UndefOr[js.Any] = js.undefined
  var disableDelete: js.UndefOr[scala.Boolean] = js.undefined
  var files: js.UndefOr[js.Array[js.Object]] = js.undefined
  var length: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var onAddImageClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* files */ js.Array[js.Object], 
      /* operationType */ java.lang.String, 
      /* index */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  var onFail: js.UndefOr[js.Function1[/* msg */ java.lang.String, scala.Unit]] = js.undefined
  var onImageClick: js.UndefOr[
    js.Function2[
      /* index */ js.UndefOr[scala.Double], 
      /* files */ js.UndefOr[js.Array[js.Object]], 
      scala.Unit
    ]
  ] = js.undefined
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object ImagePickerPropTypes {
  @scala.inline
  def apply(
    accept: java.lang.String = null,
    capture: js.Any = null,
    disableDelete: js.UndefOr[scala.Boolean] = js.undefined,
    files: js.Array[js.Object] = null,
    length: scala.Double | java.lang.String = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    onAddImageClick: () => scala.Unit = null,
    onChange: (/* files */ js.Array[js.Object], /* operationType */ java.lang.String, /* index */ js.UndefOr[scala.Double]) => scala.Unit = null,
    onFail: /* msg */ java.lang.String => scala.Unit = null,
    onImageClick: (/* index */ js.UndefOr[scala.Double], /* files */ js.UndefOr[js.Array[js.Object]]) => scala.Unit = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    style: js.Object = null
  ): ImagePickerPropTypes = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (capture != null) __obj.updateDynamic("capture")(capture)
    if (!js.isUndefined(disableDelete)) __obj.updateDynamic("disableDelete")(disableDelete)
    if (files != null) __obj.updateDynamic("files")(files)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (onAddImageClick != null) __obj.updateDynamic("onAddImageClick")(js.Any.fromFunction0(onAddImageClick))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onFail != null) __obj.updateDynamic("onFail")(js.Any.fromFunction1(onFail))
    if (onImageClick != null) __obj.updateDynamic("onImageClick")(js.Any.fromFunction2(onImageClick))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ImagePickerPropTypes]
  }
}

