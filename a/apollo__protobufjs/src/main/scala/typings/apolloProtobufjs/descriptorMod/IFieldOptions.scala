package typings.apolloProtobufjs.descriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFieldOptions extends js.Object {
  
  var jstype: js.UndefOr[IFieldOptionsJSType] = js.native
  
  var packed: js.UndefOr[Boolean] = js.native
}
object IFieldOptions {
  
  @scala.inline
  def apply(): IFieldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldOptions]
  }
  
  @scala.inline
  implicit class IFieldOptionsOps[Self <: IFieldOptions] (val x: Self) extends AnyVal {
    
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
    def setJstype(value: IFieldOptionsJSType): Self = this.set("jstype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJstype: Self = this.set("jstype", js.undefined)
    
    @scala.inline
    def setPacked(value: Boolean): Self = this.set("packed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePacked: Self = this.set("packed", js.undefined)
  }
}
