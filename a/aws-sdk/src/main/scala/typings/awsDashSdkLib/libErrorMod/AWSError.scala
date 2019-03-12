package typings
package awsDashSdkLib.libErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/error", "AWSError")
@js.native
class AWSError ()
  extends stdLib.Error {
  /**
    * CloudFront request ID associated with the response.
    */
  var cfId: java.lang.String = js.native
  /**
    * A unique short code representing the error that was emitted.
    */
  var code: java.lang.String = js.native
  /**
    * Second request ID associated with the response from S3.
    */
  var extendedRequestId: java.lang.String = js.native
  /**
    * Set when a networking error occurs to easily identify the endpoint of the request.
    */
  var hostname: java.lang.String = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /**
    * Set when a networking error occurs to easily identify the region of the request.
    */
  var region: java.lang.String = js.native
  /**
    * The unique request ID associated with the response.
    */
  var requestId: java.lang.String = js.native
  /**
    * Amount of time (in seconds) that the request waited before being resent.
    */
  var retryDelay: scala.Double = js.native
  /**
    * Whether the error message is retryable.
    */
  var retryable: scala.Boolean = js.native
  /**
    * In the case of a request that reached the service, this value contains the response status code.
    */
  var statusCode: scala.Double = js.native
  /**
    * The date time object when the error occurred.
    */
  var time: stdLib.Date = js.native
}

