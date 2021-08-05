package typings.adobeNodeFetchRetry

import typings.nodeFetch.mod.Request
import typings.nodeFetch.mod.RequestInit
import typings.nodeFetch.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(url: String, options: Options): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  inline def apply(url: Request, options: Options): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  
  @JSImport("@adobe/node-fetch-retry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * options for fetch-retry
    */
  trait Options
    extends StObject
       with RequestInit {
    
    /**
      * options for retry or false if want to disable retry
      * ... other options for fetch call (method, headers, etc...)
      */
    var retryOptions: js.UndefOr[RetryOptions] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setRetryOptions(value: RetryOptions): Self = StObject.set(x, "retryOptions", value.asInstanceOf[js.Any])
      
      inline def setRetryOptionsUndefined: Self = StObject.set(x, "retryOptions", js.undefined)
    }
  }
  
  /**
    * options for retry or false if want to disable retry
    */
  trait RetryOptions extends StObject {
    
    /**
      * If true, socket timeout will be forced to use `socketTimeout` property declared (defaults to false)
      */
    var forceSocketTimeout: js.UndefOr[Boolean] = js.undefined
    
    /**
      * backoff factor for wait time between retries (defaults to 2.0)
      */
    var retryBackoff: js.UndefOr[Double] = js.undefined
    
    /**
      * time to wait between retries in milliseconds
      */
    var retryInitialDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * time (in milliseconds) to retry until throwing an error
      */
    var retryMaxDuration: js.UndefOr[Double] = js.undefined
    
    /**
      * a function determining whether to retry on a specific HTTP code
      */
    var retryOnHttpResponse: js.UndefOr[js.Function1[/* response */ Response, Boolean]] = js.undefined
    
    /**
      * Optional socket timeout in milliseconds (defaults to 60000ms)
      */
    var socketTimeout: js.UndefOr[Double] = js.undefined
  }
  object RetryOptions {
    
    inline def apply(): RetryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RetryOptions]
    }
    
    extension [Self <: RetryOptions](x: Self) {
      
      inline def setForceSocketTimeout(value: Boolean): Self = StObject.set(x, "forceSocketTimeout", value.asInstanceOf[js.Any])
      
      inline def setForceSocketTimeoutUndefined: Self = StObject.set(x, "forceSocketTimeout", js.undefined)
      
      inline def setRetryBackoff(value: Double): Self = StObject.set(x, "retryBackoff", value.asInstanceOf[js.Any])
      
      inline def setRetryBackoffUndefined: Self = StObject.set(x, "retryBackoff", js.undefined)
      
      inline def setRetryInitialDelay(value: Double): Self = StObject.set(x, "retryInitialDelay", value.asInstanceOf[js.Any])
      
      inline def setRetryInitialDelayUndefined: Self = StObject.set(x, "retryInitialDelay", js.undefined)
      
      inline def setRetryMaxDuration(value: Double): Self = StObject.set(x, "retryMaxDuration", value.asInstanceOf[js.Any])
      
      inline def setRetryMaxDurationUndefined: Self = StObject.set(x, "retryMaxDuration", js.undefined)
      
      inline def setRetryOnHttpResponse(value: /* response */ Response => Boolean): Self = StObject.set(x, "retryOnHttpResponse", js.Any.fromFunction1(value))
      
      inline def setRetryOnHttpResponseUndefined: Self = StObject.set(x, "retryOnHttpResponse", js.undefined)
      
      inline def setSocketTimeout(value: Double): Self = StObject.set(x, "socketTimeout", value.asInstanceOf[js.Any])
      
      inline def setSocketTimeoutUndefined: Self = StObject.set(x, "socketTimeout", js.undefined)
    }
  }
}
