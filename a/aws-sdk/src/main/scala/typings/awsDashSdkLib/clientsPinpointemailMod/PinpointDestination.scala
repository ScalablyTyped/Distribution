package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinpointDestination extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon Pinpoint project that you want to send email events to.
    */
  var ApplicationArn: js.UndefOr[AmazonResourceName] = js.undefined
}

object PinpointDestination {
  @scala.inline
  def apply(ApplicationArn: AmazonResourceName = null): PinpointDestination = {
    val __obj = js.Dynamic.literal()
    if (ApplicationArn != null) __obj.updateDynamic("ApplicationArn")(ApplicationArn)
    __obj.asInstanceOf[PinpointDestination]
  }
}

