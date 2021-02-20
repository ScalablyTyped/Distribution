package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHttpInterceptor extends StObject {
  
  var request: js.UndefOr[
    js.Function1[/* config */ IRequestConfig, IRequestConfig | IPromise[IRequestConfig]]
  ] = js.native
  
  var requestError: js.UndefOr[js.Function1[/* rejection */ js.Any, IRequestConfig | IPromise[IRequestConfig]]] = js.native
  
  var response: js.UndefOr[
    js.Function1[/* response */ IHttpResponse[_], IPromise[IHttpResponse[_]] | IHttpResponse[_]]
  ] = js.native
  
  var responseError: js.UndefOr[
    js.Function1[/* rejection */ js.Any, IPromise[IHttpResponse[_]] | IHttpResponse[_]]
  ] = js.native
}
object IHttpInterceptor {
  
  @scala.inline
  def apply(): IHttpInterceptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHttpInterceptor]
  }
  
  @scala.inline
  implicit class IHttpInterceptorMutableBuilder[Self <: IHttpInterceptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest(value: /* config */ IRequestConfig => IRequestConfig | IPromise[IRequestConfig]): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestError(value: /* rejection */ js.Any => IRequestConfig | IPromise[IRequestConfig]): Self = StObject.set(x, "requestError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestErrorUndefined: Self = StObject.set(x, "requestError", js.undefined)
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setResponse(value: /* response */ IHttpResponse[_] => IPromise[IHttpResponse[_]] | IHttpResponse[_]): Self = StObject.set(x, "response", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResponseError(value: /* rejection */ js.Any => IPromise[IHttpResponse[_]] | IHttpResponse[_]): Self = StObject.set(x, "responseError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResponseErrorUndefined: Self = StObject.set(x, "responseError", js.undefined)
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
