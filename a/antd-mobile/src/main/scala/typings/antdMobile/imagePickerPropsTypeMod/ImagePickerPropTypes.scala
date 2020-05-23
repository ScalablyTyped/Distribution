package typings.antdMobile.imagePickerPropsTypeMod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagePickerPropTypes extends js.Object {
  var accept: js.UndefOr[String] = js.undefined
  var capture: js.UndefOr[js.Any] = js.undefined
  var disableDelete: js.UndefOr[Boolean] = js.undefined
  var files: js.UndefOr[js.Array[ImageFile]] = js.undefined
  var length: js.UndefOr[Double | String] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var onAddImageClick: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* files */ js.Array[ImageFile], 
      /* operationType */ String, 
      /* index */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  var onFail: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
  var onImageClick: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[ImageFile]], Unit]
  ] = js.undefined
  var selectable: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object ImagePickerPropTypes {
  @scala.inline
  def apply(
    accept: String = null,
    capture: js.Any = null,
    disableDelete: js.UndefOr[Boolean] = js.undefined,
    files: js.Array[ImageFile] = null,
    length: Double | String = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onAddImageClick: /* e */ MouseEvent[Element, NativeMouseEvent] => Unit = null,
    onChange: (/* files */ js.Array[ImageFile], /* operationType */ String, /* index */ js.UndefOr[Double]) => Unit = null,
    onFail: /* msg */ String => Unit = null,
    onImageClick: (/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[ImageFile]]) => Unit = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): ImagePickerPropTypes = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDelete)) __obj.updateDynamic("disableDelete")(disableDelete.get.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    if (onAddImageClick != null) __obj.updateDynamic("onAddImageClick")(js.Any.fromFunction1(onAddImageClick))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onFail != null) __obj.updateDynamic("onFail")(js.Any.fromFunction1(onFail))
    if (onImageClick != null) __obj.updateDynamic("onImageClick")(js.Any.fromFunction2(onImageClick))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePickerPropTypes]
  }
}

