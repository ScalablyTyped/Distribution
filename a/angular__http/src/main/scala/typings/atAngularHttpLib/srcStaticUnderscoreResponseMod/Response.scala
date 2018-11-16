package typings
package atAngularHttpLib.srcStaticUnderscoreResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/src/static_response", "Response")
@js.native
class Response protected ()
  extends atAngularHttpLib.srcBodyMod.Body {
  def this(responseOptions: atAngularHttpLib.srcBaseUnderscoreResponseUnderscoreOptionsMod.ResponseOptions) = this()
  /**
       * Non-standard property
       *
       * Denotes how many of the response body's bytes have been loaded, for example if the response is
       * the result of a progress event.
       */
  var bytesLoaded: scala.Double = js.native
  /**
       * Headers object based on the `Headers` class in the [Fetch
       * Spec](https://fetch.spec.whatwg.org/#headers-class).
       */
  var headers: atAngularHttpLib.srcHeadersMod.Headers | scala.Null = js.native
  /**
       * True if the response's status is within 200-299
       */
  var ok: scala.Boolean = js.native
  /**
       * Status code returned by server.
       *
       * Defaults to 200.
       */
  var status: scala.Double = js.native
  /**
       * Text representing the corresponding reason phrase to the `status`, as defined in [ietf rfc 2616
       * section 6.1.1](https://tools.ietf.org/html/rfc2616#section-6.1.1)
       *
       * Defaults to "OK"
       */
  var statusText: java.lang.String | scala.Null = js.native
  /**
       * Non-standard property
       *
       * Denotes how many bytes are expected in the final response body.
       */
  var totalBytes: scala.Double = js.native
  /**
       * One of "basic", "cors", "default", "error", or "opaque".
       *
       * Defaults to "default".
       */
  var `type`: atAngularHttpLib.srcEnumsMod.ResponseType = js.native
  /**
       * URL of response.
       *
       * Defaults to empty string.
       */
  var url: java.lang.String = js.native
}

