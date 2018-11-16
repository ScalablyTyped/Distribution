package typings
package atAngularHttpLib.srcStaticUnderscoreRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/src/static_request", "Request")
@js.native
class Request protected ()
  extends atAngularHttpLib.srcBodyMod.Body {
  def this(requestOptions: atAngularHttpLib.srcInterfacesMod.RequestArgs) = this()
  /** Type of the request body **/
  var contentType: js.Any = js.native
  /**
       * {@link Headers} instance
       */
  var headers: atAngularHttpLib.srcHeadersMod.Headers = js.native
  /**
       * Http method with which to perform the request.
       */
  var method: atAngularHttpLib.srcEnumsMod.RequestMethod = js.native
  /** Buffer to store the response */
  var responseType: atAngularHttpLib.srcEnumsMod.ResponseContentType = js.native
  /** Url of the remote resource */
  var url: java.lang.String = js.native
  /** Enable use credentials */
  var withCredentials: scala.Boolean = js.native
  /**
       * Returns the content type enum based on header options.
       */
  def detectContentType(): atAngularHttpLib.srcEnumsMod.ContentType = js.native
  /**
       * Returns the content type of request's body based on its type.
       */
  def detectContentTypeFromBody(): atAngularHttpLib.srcEnumsMod.ContentType = js.native
  /**
       * Returns the request's body according to its type. If body is undefined, return
       * null.
       */
  def getBody(): js.Any = js.native
}

