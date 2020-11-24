package typings.angularAgility.aa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExternalFormValidationConfig extends js.Object {
  
  var globals: js.UndefOr[js.Any] = js.native
  
  var ignore: js.UndefOr[js.Any] = js.native
  
  var resolve: js.UndefOr[js.Any] = js.native
  
  var resolveFn: js.UndefOr[js.Function1[/* modelValue */ String, String]] = js.native
  
  var validations: js.Any = js.native
}
object IExternalFormValidationConfig {
  
  @scala.inline
  def apply(validations: js.Any): IExternalFormValidationConfig = {
    val __obj = js.Dynamic.literal(validations = validations.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExternalFormValidationConfig]
  }
  
  @scala.inline
  implicit class IExternalFormValidationConfigOps[Self <: IExternalFormValidationConfig] (val x: Self) extends AnyVal {
    
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
    def setValidations(value: js.Any): Self = this.set("validations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobals(value: js.Any): Self = this.set("globals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobals: Self = this.set("globals", js.undefined)
    
    @scala.inline
    def setIgnore(value: js.Any): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setResolve(value: js.Any): Self = this.set("resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
    
    @scala.inline
    def setResolveFn(value: /* modelValue */ String => String): Self = this.set("resolveFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResolveFn: Self = this.set("resolveFn", js.undefined)
  }
}
