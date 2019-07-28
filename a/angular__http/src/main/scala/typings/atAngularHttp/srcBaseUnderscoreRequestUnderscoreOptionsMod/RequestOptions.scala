package typings.atAngularHttp.srcBaseUnderscoreRequestUnderscoreOptionsMod

import typings.atAngularHttp.srcEnumsMod.RequestMethod
import typings.atAngularHttp.srcEnumsMod.ResponseContentType
import typings.atAngularHttp.srcHeadersMod.Headers
import typings.atAngularHttp.srcInterfacesMod.RequestOptionsArgs
import typings.atAngularHttp.srcUrlUnderscoreSearchUnderscoreParamsMod.URLSearchParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/src/base_request_options", "RequestOptions")
@js.native
class RequestOptions () extends js.Object {
  def this(opts: RequestOptionsArgs) = this()
  var _appendParam: js.Any = js.native
  var _mergeSearchParams: js.Any = js.native
  var _parseParams: js.Any = js.native
  /**
    * Body to be used when creating a {@link Request}.
    */
  var body: js.Any = js.native
  /**
    * {@link Headers} to be attached to a {@link Request}.
    */
  var headers: Headers | Null = js.native
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
}

