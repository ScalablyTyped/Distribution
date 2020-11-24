package typings.angularFormly.AngularFormly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModelOptions extends js.Object {
  
  var allowInvalid: js.UndefOr[Boolean] = js.native
  
  var debounce: js.UndefOr[Double] = js.native
  
  var getterSetter: js.UndefOr[String] = js.native
  
  var timezone: js.UndefOr[String] = js.native
  
  var updateOn: js.UndefOr[String] = js.native
}
object IModelOptions {
  
  @scala.inline
  def apply(): IModelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModelOptions]
  }
  
  @scala.inline
  implicit class IModelOptionsOps[Self <: IModelOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowInvalid(value: Boolean): Self = this.set("allowInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowInvalid: Self = this.set("allowInvalid", js.undefined)
    
    @scala.inline
    def setDebounce(value: Double): Self = this.set("debounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebounce: Self = this.set("debounce", js.undefined)
    
    @scala.inline
    def setGetterSetter(value: String): Self = this.set("getterSetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetterSetter: Self = this.set("getterSetter", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
    
    @scala.inline
    def setUpdateOn(value: String): Self = this.set("updateOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateOn: Self = this.set("updateOn", js.undefined)
  }
}
