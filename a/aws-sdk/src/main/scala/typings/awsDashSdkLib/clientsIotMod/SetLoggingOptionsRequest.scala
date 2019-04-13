package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetLoggingOptionsRequest extends js.Object {
  /**
    * The logging options payload.
    */
  var loggingOptionsPayload: LoggingOptionsPayload
}

object SetLoggingOptionsRequest {
  @scala.inline
  def apply(loggingOptionsPayload: LoggingOptionsPayload): SetLoggingOptionsRequest = {
    val __obj = js.Dynamic.literal(loggingOptionsPayload = loggingOptionsPayload)
  
    __obj.asInstanceOf[SetLoggingOptionsRequest]
  }
}

