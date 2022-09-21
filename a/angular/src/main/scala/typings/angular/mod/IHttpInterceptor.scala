package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHttpInterceptor extends StObject {
  
  var request: js.UndefOr[
    js.Function1[/* config */ IRequestConfig, IRequestConfig | IPromise[IRequestConfig]]
  ] = js.undefined
  
  var requestError: js.UndefOr[js.Function1[/* rejection */ Any, IRequestConfig | IPromise[IRequestConfig]]] = js.undefined
  
  var response: js.UndefOr[
    js.Function1[
      /* response */ IHttpResponse[Any], 
      IPromise[IHttpResponse[Any]] | IHttpResponse[Any]
    ]
  ] = js.undefined
  
  var responseError: js.UndefOr[
    js.Function1[/* rejection */ Any, IPromise[IHttpResponse[Any]] | IHttpResponse[Any]]
  ] = js.undefined
}
object IHttpInterceptor {
  
  inline def apply(): IHttpInterceptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHttpInterceptor]
  }
  
  extension [Self <: IHttpInterceptor](x: Self) {
    
    inline def setRequest(value: /* config */ IRequestConfig => IRequestConfig | IPromise[IRequestConfig]): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
    
    inline def setRequestError(value: /* rejection */ Any => IRequestConfig | IPromise[IRequestConfig]): Self = StObject.set(x, "requestError", js.Any.fromFunction1(value))
    
    inline def setRequestErrorUndefined: Self = StObject.set(x, "requestError", js.undefined)
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResponse(value: /* response */ IHttpResponse[Any] => IPromise[IHttpResponse[Any]] | IHttpResponse[Any]): Self = StObject.set(x, "response", js.Any.fromFunction1(value))
    
    inline def setResponseError(value: /* rejection */ Any => IPromise[IHttpResponse[Any]] | IHttpResponse[Any]): Self = StObject.set(x, "responseError", js.Any.fromFunction1(value))
    
    inline def setResponseErrorUndefined: Self = StObject.set(x, "responseError", js.undefined)
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
