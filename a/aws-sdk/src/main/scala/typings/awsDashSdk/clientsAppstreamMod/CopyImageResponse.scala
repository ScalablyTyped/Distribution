package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyImageResponse extends js.Object {
  /**
    * The name of the destination image.
    */
  var DestinationImageName: js.UndefOr[Name] = js.undefined
}

object CopyImageResponse {
  @scala.inline
  def apply(DestinationImageName: Name = null): CopyImageResponse = {
    val __obj = js.Dynamic.literal()
    if (DestinationImageName != null) __obj.updateDynamic("DestinationImageName")(DestinationImageName)
    __obj.asInstanceOf[CopyImageResponse]
  }
}

