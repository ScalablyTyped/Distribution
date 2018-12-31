package typings
package awsDashSdkLib.libHttpUnderscoreRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/http_request", "HttpRequest")
@js.native
class HttpRequest protected () extends js.Object {
  /**
    * Constructs HttpRequest object with provided endpoint and region
    */
  def this(endpoint: awsDashSdkLib.libEndpointMod.Endpoint, region: java.lang.String) = this()
  /**
    * The request body payload.
    */
  var body: java.lang.String = js.native
  /**
    * The endpoint for the request.
    */
  var endpoint: awsDashSdkLib.libEndpointMod.Endpoint = js.native
  /**
    * A map of header keys and their respective values.
    */
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  /**
    * The HTTP method of the request.
    */
  var method: java.lang.String = js.native
  /**
    * The path portion of the URI, e.g., "/list/?start=5&num=10".
    */
  var path: java.lang.String = js.native
  /**
    * The query string portion of the path.
    */
  var search: java.lang.String = js.native
  /**
    * The part of the path excluding the query string.
    */
  def pathname(): java.lang.String = js.native
}

