package typings.antdDashMobileDashRn.libImageDashPickerPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagePickerPropTypes extends js.Object {
  var files: js.UndefOr[js.Array[js.Object]] = js.undefined
  var onAddImageClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* files */ js.Array[js.Object], 
      /* operationType */ String, 
      /* index */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  var onFail: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
  var onImageClick: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[js.Object]], Unit]
  ] = js.undefined
  var selectable: js.UndefOr[Boolean] = js.undefined
  var styles: js.UndefOr[js.Object] = js.undefined
}

object ImagePickerPropTypes {
  @scala.inline
  def apply(
    files: js.Array[js.Object] = null,
    onAddImageClick: () => Unit = null,
    onChange: (/* files */ js.Array[js.Object], /* operationType */ String, /* index */ js.UndefOr[Double]) => Unit = null,
    onFail: /* msg */ String => Unit = null,
    onImageClick: (/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[js.Object]]) => Unit = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    styles: js.Object = null
  ): ImagePickerPropTypes = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files)
    if (onAddImageClick != null) __obj.updateDynamic("onAddImageClick")(js.Any.fromFunction0(onAddImageClick))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onFail != null) __obj.updateDynamic("onFail")(js.Any.fromFunction1(onFail))
    if (onImageClick != null) __obj.updateDynamic("onImageClick")(js.Any.fromFunction2(onImageClick))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[ImagePickerPropTypes]
  }
}

