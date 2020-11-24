package typings.antDesignReactNative.nativePickerAndroidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPickerProp extends js.Object {
  
  var doScrollingComplete: js.Function = js.native
  
  var select: js.Function = js.native
}
object IPickerProp {
  
  @scala.inline
  def apply(doScrollingComplete: js.Function, select: js.Function): IPickerProp = {
    val __obj = js.Dynamic.literal(doScrollingComplete = doScrollingComplete.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPickerProp]
  }
  
  @scala.inline
  implicit class IPickerPropOps[Self <: IPickerProp] (val x: Self) extends AnyVal {
    
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
    def setDoScrollingComplete(value: js.Function): Self = this.set("doScrollingComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: js.Function): Self = this.set("select", value.asInstanceOf[js.Any])
  }
}
