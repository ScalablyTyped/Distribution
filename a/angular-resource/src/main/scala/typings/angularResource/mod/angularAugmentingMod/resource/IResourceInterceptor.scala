package typings.angularResource.mod.angularAugmentingMod.resource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResourceInterceptor extends js.Object {
  
  var response: js.UndefOr[js.Function1[/* response */ IResourceResponse, _]] = js.native
  
  var responseError: js.UndefOr[js.Function1[/* rejection */ js.Any, _]] = js.native
}
object IResourceInterceptor {
  
  @scala.inline
  def apply(): IResourceInterceptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResourceInterceptor]
  }
  
  @scala.inline
  implicit class IResourceInterceptorOps[Self <: IResourceInterceptor] (val x: Self) extends AnyVal {
    
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
    def setResponse(value: /* response */ IResourceResponse => _): Self = this.set("response", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    
    @scala.inline
    def setResponseError(value: /* rejection */ js.Any => _): Self = this.set("responseError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResponseError: Self = this.set("responseError", js.undefined)
  }
}
