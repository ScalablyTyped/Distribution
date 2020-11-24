package typings.angularHttp

import typings.angularHttp.headersMod.Headers
import typings.angularHttp.interfacesMod.ResponseOptionsArgs
import typings.std.ArrayBuffer
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/http/src/base_response_options", JSImport.Namespace)
@js.native
object baseResponseOptionsMod extends js.Object {
  
  @js.native
  class BaseResponseOptions () extends ResponseOptions
  
  @js.native
  class ResponseOptions () extends js.Object {
    def this(opts: ResponseOptionsArgs) = this()
    
    /**
      * String, Object, ArrayBuffer or Blob representing the body of the {@link Response}.
      */
    var body: String | js.Object | ArrayBuffer | Blob | Null = js.native
    
    /**
      * Response {@link Headers headers}
      */
    var headers: Headers | Null = js.native
    
    /**
      * Creates a copy of the `ResponseOptions` instance, using the optional input as values to
      * override
      * existing values. This method will not change the values of the instance on which it is being
      * called.
      *
      * This may be useful when sharing a base `ResponseOptions` object inside tests,
      * where certain properties may change from test to test.
      *
      * @usageNotes
      * ### Example
      *
      * ```typescript
      * import {ResponseOptions, Response} from '@angular/http';
      *
      * var options = new ResponseOptions({
      *   body: {name: 'Jeff'}
      * });
      * var res = new Response(options.merge({
      *   url: 'https://google.com'
      * }));
      * console.log('options.url:', options.url); // null
      * console.log('res.json():', res.json()); // Object {name: "Jeff"}
      * console.log('res.url:', res.url); // https://google.com
      * ```
      */
    def merge(): ResponseOptions = js.native
    def merge(options: ResponseOptionsArgs): ResponseOptions = js.native
    
    /**
      * Http {@link http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html status code}
      * associated with the response.
      */
    var status: Double | Null = js.native
    
    var url: String | Null = js.native
  }
}
