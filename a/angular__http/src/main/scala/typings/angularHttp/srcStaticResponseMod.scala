package typings.angularHttp

import typings.angularHttp.srcBaseResponseOptionsMod.ResponseOptions
import typings.angularHttp.srcBodyMod.Body
import typings.angularHttp.srcEnumsMod.ResponseType
import typings.angularHttp.srcHeadersMod.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcStaticResponseMod {
  
  @JSImport("@angular/http/src/static_response", "Response")
  @js.native
  open class Response protected () extends Body {
    def this(responseOptions: ResponseOptions) = this()
    
    /**
      * Non-standard property
      *
      * Denotes how many of the response body's bytes have been loaded, for example if the response is
      * the result of a progress event.
      */
    var bytesLoaded: Double = js.native
    
    /**
      * Headers object based on the `Headers` class in the [Fetch
      * Spec](https://fetch.spec.whatwg.org/#headers-class).
      */
    var headers: Headers | Null = js.native
    
    /**
      * True if the response's status is within 200-299
      */
    var ok: Boolean = js.native
    
    /**
      * Status code returned by server.
      *
      * Defaults to 200.
      */
    var status: Double = js.native
    
    /**
      * Text representing the corresponding reason phrase to the `status`, as defined in [ietf rfc 2616
      * section 6.1.1](https://tools.ietf.org/html/rfc2616#section-6.1.1)
      *
      * Defaults to "OK"
      */
    var statusText: String | Null = js.native
    
    /**
      * Non-standard property
      *
      * Denotes how many bytes are expected in the final response body.
      */
    var totalBytes: Double = js.native
    
    /**
      * One of "basic", "cors", "default", "error", or "opaque".
      *
      * Defaults to "default".
      */
    var `type`: ResponseType = js.native
    
    /**
      * URL of response.
      *
      * Defaults to empty string.
      */
    var url: String = js.native
  }
}
