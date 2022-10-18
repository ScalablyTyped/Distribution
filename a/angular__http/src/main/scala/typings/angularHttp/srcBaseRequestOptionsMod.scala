package typings.angularHttp

import typings.angularHttp.srcEnumsMod.RequestMethod
import typings.angularHttp.srcEnumsMod.ResponseContentType
import typings.angularHttp.srcHeadersMod.Headers
import typings.angularHttp.srcInterfacesMod.RequestOptionsArgs
import typings.angularHttp.srcUrlSearchParamsMod.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBaseRequestOptionsMod {
  
  @JSImport("@angular/http/src/base_request_options", "BaseRequestOptions")
  @js.native
  open class BaseRequestOptions () extends RequestOptions
  
  @JSImport("@angular/http/src/base_request_options", "RequestOptions")
  @js.native
  open class RequestOptions () extends StObject {
    def this(opts: RequestOptionsArgs) = this()
    
    /* private */ var _appendParam: Any = js.native
    
    /* private */ var _mergeSearchParams: Any = js.native
    
    /* private */ var _parseParams: Any = js.native
    
    /**
      * Body to be used when creating a {@link Request}.
      */
    var body: Any = js.native
    
    /**
      * {@link Headers} to be attached to a {@link Request}.
      */
    var headers: Headers | Null = js.native
    
    /**
      * Creates a copy of the `RequestOptions` instance, using the optional input as values to override
      * existing values. This method will not change the values of the instance on which it is being
      * called.
      *
      * Note that `headers` and `search` will override existing values completely if present in
      * the `options` object. If these values should be merged, it should be done prior to calling
      * `merge` on the `RequestOptions` instance.
      *
      * ```typescript
      * import {RequestOptions, Request, RequestMethod} from '@angular/http';
      *
      * const options = new RequestOptions({
      *   method: RequestMethod.Post
      * });
      * const req = new Request(options.merge({
      *   url: 'https://google.com'
      * }));
      * console.log('req.method:', RequestMethod[req.method]); // Post
      * console.log('options.url:', options.url); // null
      * console.log('req.url:', req.url); // https://google.com
      * ```
      */
    def merge(): RequestOptions = js.native
    def merge(options: RequestOptionsArgs): RequestOptions = js.native
    
    /**
      * Http method with which to execute a {@link Request}.
      * Acceptable methods are defined in the {@link RequestMethod} enum.
      */
    var method: RequestMethod | String | Null = js.native
    
    /**
      * Search parameters to be included in a {@link Request}.
      */
    var params: URLSearchParams = js.native
    
    var responseType: ResponseContentType | Null = js.native
    
    /**
      * @deprecated from 4.0.0. Use params instead.
      */
    /**
      * @deprecated from 4.0.0. Use params instead.
      */
    var search: URLSearchParams = js.native
    
    /**
      * Url with which to perform a {@link Request}.
      */
    var url: String | Null = js.native
    
    /**
      * Enable use credentials for a {@link Request}.
      */
    var withCredentials: Boolean | Null = js.native
  }
}
