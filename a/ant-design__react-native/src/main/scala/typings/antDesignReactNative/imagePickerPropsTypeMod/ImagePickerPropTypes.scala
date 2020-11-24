package typings.antDesignReactNative.imagePickerPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagePickerPropTypes extends js.Object {
  
  var files: js.UndefOr[js.Array[js.Object]] = js.native
  
  var onAddImageClick: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onChange: js.UndefOr[
    js.Function3[
      /* files */ js.Array[js.Object], 
      /* operationType */ String, 
      /* index */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  
  var onFail: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
  
  var onImageClick: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[js.Object]], Unit]
  ] = js.native
  
  var selectable: js.UndefOr[Boolean] = js.native
  
  var styles: js.UndefOr[js.Object] = js.native
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
    def setFilesVarargs(value: js.Object*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[js.Object]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setOnAddImageClick(value: () => Unit): Self = this.set("onAddImageClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnAddImageClick: Self = this.set("onAddImageClick", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: (/* files */ js.Array[js.Object], /* operationType */ String, /* index */ js.UndefOr[Double]) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnFail(value: /* msg */ String => Unit): Self = this.set("onFail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFail: Self = this.set("onFail", js.undefined)
    
    @scala.inline
    def setOnImageClick(value: (/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[js.Object]]) => Unit): Self = this.set("onImageClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnImageClick: Self = this.set("onImageClick", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    
    @scala.inline
    def setStyles(value: js.Object): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
