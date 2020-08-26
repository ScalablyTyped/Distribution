package typings.antdMobile.imagePickerPropsTypeMod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagePickerPropTypes extends js.Object {
  var accept: js.UndefOr[String] = js.native
  var capture: js.UndefOr[js.Any] = js.native
  var disableDelete: js.UndefOr[Boolean] = js.native
  var files: js.UndefOr[js.Array[ImageFile]] = js.native
  var length: js.UndefOr[Double | String] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var onAddImageClick: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.native
  var onChange: js.UndefOr[
    js.Function3[
      /* files */ js.Array[ImageFile], 
      /* operationType */ String, 
      /* index */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  var onFail: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
  var onImageClick: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[ImageFile]], Unit]
  ] = js.native
  var selectable: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object ImagePickerPropTypes {
  @scala.inline
  def apply(): ImagePickerPropTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePickerPropTypes]
  }
  @scala.inline
  implicit class ImagePickerPropTypesOps[Self <: ImagePickerPropTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    @scala.inline
    def setCapture(value: js.Any): Self = this.set("capture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    @scala.inline
    def setDisableDelete(value: Boolean): Self = this.set("disableDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableDelete: Self = this.set("disableDelete", js.undefined)
    @scala.inline
    def setFilesVarargs(value: ImageFile*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[ImageFile]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setLength(value: Double | String): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setOnAddImageClick(value: /* e */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = this.set("onAddImageClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAddImageClick: Self = this.set("onAddImageClick", js.undefined)
    @scala.inline
    def setOnChange(
      value: (/* files */ js.Array[ImageFile], /* operationType */ String, /* index */ js.UndefOr[Double]) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnFail(value: /* msg */ String => Unit): Self = this.set("onFail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFail: Self = this.set("onFail", js.undefined)
    @scala.inline
    def setOnImageClick(value: (/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[ImageFile]]) => Unit): Self = this.set("onImageClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnImageClick: Self = this.set("onImageClick", js.undefined)
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

