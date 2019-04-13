package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputDestinationRequest extends js.Object {
  /**
    * A unique name for the location the RTMP stream is being pushed
  to.
    */
  var StreamName: js.UndefOr[__string] = js.undefined
}

object InputDestinationRequest {
  @scala.inline
  def apply(StreamName: __string = null): InputDestinationRequest = {
    val __obj = js.Dynamic.literal()
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName)
    __obj.asInstanceOf[InputDestinationRequest]
  }
}

