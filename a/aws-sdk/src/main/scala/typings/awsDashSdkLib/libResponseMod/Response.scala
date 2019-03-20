package typings
package awsDashSdkLib.libResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/response", "Response")
@js.native
class Response[D, E] () extends js.Object {
  /**
  		 * The de-serialized response data from the service.
  		 * Can be null if an error occurred.
  		 */
  var data: D | scala.Unit = js.native
  /**
  		 * A structure containing information about a service or networking error.
  		 */
  var error: E | scala.Unit = js.native
  /**
  		 * The raw HTTP response object containing the response headers and body information from the server.
  		 */
  var httpResponse: awsDashSdkLib.libHttpUnderscoreResponseMod.HttpResponse = js.native
  /**
  		 * The number of redirects that were followed before the request was completed.
  		 */
  var redirectCount: scala.Double = js.native
  /**
  		 * Returns the unique request ID associated with the response.
  		 * Log this value when debugging requests for AWS support.
  		 */
  var requestId: java.lang.String = js.native
  /**
  		 * The number of retries that were attempted before the request was completed.
  		 */
  var retryCount: scala.Double = js.native
  /**
  		 * Whether more pages of data can be returned by further requests.
  		 */
  def hasNextPage(): scala.Boolean = js.native
  /**
  		 * Creates a new request for the next page of response data, calling the callback with the page data if a callback is provided.
  		 */
  def nextPage(): (awsDashSdkLib.libRequestMod.Request[D, E]) | scala.Unit = js.native
  def nextPage(callback: js.Function2[/* err */ E, /* data */ D, scala.Unit]): (awsDashSdkLib.libRequestMod.Request[D, E]) | scala.Unit = js.native
}

