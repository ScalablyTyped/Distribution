package typings.angularHttp

import org.scalablytyped.runtime.TopLevel
import typings.angularHttp.bodyMod.Body
import typings.angularHttp.enumsMod.ContentType
import typings.angularHttp.enumsMod.RequestMethod
import typings.angularHttp.enumsMod.ResponseContentType
import typings.angularHttp.headersMod.Headers
import typings.angularHttp.interfacesMod.RequestArgs
import typings.std.ArrayBufferConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/http/src/static_request", JSImport.Namespace)
@js.native
object staticRequestMod extends js.Object {
  
  @js.native
  class ArrayBuffer protected ()
    extends typings.std.ArrayBuffer {
    def this(byteLength: Double) = this()
  }
  @js.native
  object ArrayBuffer extends TopLevel[ArrayBufferConstructor]
  
  @js.native
  class Request protected () extends Body {
    def this(requestOptions: RequestArgs) = this()
    
    /** Type of the request body **/
    var contentType: js.Any = js.native
    
    /**
      * Returns the content type enum based on header options.
      */
    def detectContentType(): ContentType = js.native
    
    /**
      * Returns the content type of request's body based on its type.
      */
    def detectContentTypeFromBody(): ContentType = js.native
    
    /**
      * Returns the request's body according to its type. If body is undefined, return
      * null.
      */
    def getBody(): js.Any = js.native
    
    /**
      * {@link Headers} instance
      */
    var headers: Headers = js.native
    
    /**
      * Http method with which to perform the request.
      */
    var method: RequestMethod = js.native
    
    /** Buffer to store the response */
    var responseType: ResponseContentType = js.native
    
    /** Url of the remote resource */
    var url: String = js.native
    
    /** Enable use credentials */
    var withCredentials: Boolean = js.native
  }
}
