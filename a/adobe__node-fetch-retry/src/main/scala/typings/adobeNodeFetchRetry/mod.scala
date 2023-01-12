package typings.adobeNodeFetchRetry

import typings.adobeNodeFetchRetry.adobeNodeFetchRetryBooleans.`false`
import typings.nodeFetch.mod.RequestInfo
import typings.nodeFetch.mod.RequestInit
import typings.nodeFetch.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@adobe/node-fetch-retry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(url: RequestInfo): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  inline def default(url: RequestInfo, init: RequestInitWithRetry): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  
  trait RequestInitWithRetry
    extends StObject
       with RequestInit {
    
    var retryOptions: js.UndefOr[RetryOptions | `false`] = js.undefined
  }
  object RequestInitWithRetry {
    
    inline def apply(): RequestInitWithRetry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestInitWithRetry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestInitWithRetry] (val x: Self) extends AnyVal {
      
      inline def setRetryOptions(value: RetryOptions | `false`): Self = StObject.set(x, "retryOptions", value.asInstanceOf[js.Any])
      
      inline def setRetryOptionsUndefined: Self = StObject.set(x, "retryOptions", js.undefined)
    }
  }
  
  trait RetryOptions extends StObject {
    
    var forceSocketTimeout: js.UndefOr[Boolean] = js.undefined
    
    var retryBackoff: js.UndefOr[Double] = js.undefined
    
    var retryInitialDelay: js.UndefOr[Double] = js.undefined
    
    var retryMaxDuration: js.UndefOr[Double] = js.undefined
    
    var retryOnHttpError: js.UndefOr[js.Function1[/* error */ js.Error, Boolean]] = js.undefined
    
    var retryOnHttpResponse: js.UndefOr[js.Function1[/* response */ Response, Boolean]] = js.undefined
    
    var socketTimeout: js.UndefOr[Double] = js.undefined
  }
  object RetryOptions {
    
    inline def apply(): RetryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RetryOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RetryOptions] (val x: Self) extends AnyVal {
      
      inline def setForceSocketTimeout(value: Boolean): Self = StObject.set(x, "forceSocketTimeout", value.asInstanceOf[js.Any])
      
      inline def setForceSocketTimeoutUndefined: Self = StObject.set(x, "forceSocketTimeout", js.undefined)
      
      inline def setRetryBackoff(value: Double): Self = StObject.set(x, "retryBackoff", value.asInstanceOf[js.Any])
      
      inline def setRetryBackoffUndefined: Self = StObject.set(x, "retryBackoff", js.undefined)
      
      inline def setRetryInitialDelay(value: Double): Self = StObject.set(x, "retryInitialDelay", value.asInstanceOf[js.Any])
      
      inline def setRetryInitialDelayUndefined: Self = StObject.set(x, "retryInitialDelay", js.undefined)
      
      inline def setRetryMaxDuration(value: Double): Self = StObject.set(x, "retryMaxDuration", value.asInstanceOf[js.Any])
      
      inline def setRetryMaxDurationUndefined: Self = StObject.set(x, "retryMaxDuration", js.undefined)
      
      inline def setRetryOnHttpError(value: /* error */ js.Error => Boolean): Self = StObject.set(x, "retryOnHttpError", js.Any.fromFunction1(value))
      
      inline def setRetryOnHttpErrorUndefined: Self = StObject.set(x, "retryOnHttpError", js.undefined)
      
      inline def setRetryOnHttpResponse(value: /* response */ Response => Boolean): Self = StObject.set(x, "retryOnHttpResponse", js.Any.fromFunction1(value))
      
      inline def setRetryOnHttpResponseUndefined: Self = StObject.set(x, "retryOnHttpResponse", js.undefined)
      
      inline def setSocketTimeout(value: Double): Self = StObject.set(x, "socketTimeout", value.asInstanceOf[js.Any])
      
      inline def setSocketTimeoutUndefined: Self = StObject.set(x, "socketTimeout", js.undefined)
    }
  }
}
