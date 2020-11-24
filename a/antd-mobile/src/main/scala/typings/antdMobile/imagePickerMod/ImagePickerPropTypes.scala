package typings.antdMobile.imagePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagePickerPropTypes
  extends typings.antdMobile.imagePickerPropsTypeMod.ImagePickerPropTypes {
  
  var className: js.UndefOr[String] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
  }
}
