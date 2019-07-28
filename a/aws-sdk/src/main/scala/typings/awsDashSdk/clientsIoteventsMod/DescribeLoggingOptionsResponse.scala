package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLoggingOptionsResponse extends js.Object {
  /**
    * The current settings of the AWS IoT Events logging options.
    */
  var loggingOptions: js.UndefOr[LoggingOptions] = js.undefined
}

object DescribeLoggingOptionsResponse {
  @scala.inline
  def apply(loggingOptions: LoggingOptions = null): DescribeLoggingOptionsResponse = {
    val __obj = js.Dynamic.literal()
    if (loggingOptions != null) __obj.updateDynamic("loggingOptions")(loggingOptions)
    __obj.asInstanceOf[DescribeLoggingOptionsResponse]
  }
}

