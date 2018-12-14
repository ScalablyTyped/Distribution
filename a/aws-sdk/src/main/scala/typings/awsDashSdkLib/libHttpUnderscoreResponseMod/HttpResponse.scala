package typings
package awsDashSdkLib.libHttpUnderscoreResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/http_response", "HttpResponse")
@js.native
class HttpResponse () extends js.Object {
  /**
       * The response body payload.
       */
  var body: java.lang.String | nodeLib.Buffer | stdLib.Uint8Array = js.native
  /**
       * A map of response header keys and their respective values.
       */
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  /**
       * The HTTP status code of the response (e.g., 200, 404).
       */
  var statusCode: scala.Double = js.native
  /**
       * The HTTP status message of the response (e.g., 'Bad Request', 'Not Found')
       */
  var statusMessage: java.lang.String = js.native
  /**
       * Whether this response is being streamed at a low-level.
       */
  var streaming: scala.Boolean = js.native
  /**
       * Disables buffering on the HTTP response and returns the stream for reading.
       */
  def createUnbufferedStream(): nodeLib.streamMod.Readable | XMLHttpRequest = js.native
}

