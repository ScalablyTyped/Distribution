package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyImageResponse extends js.Object {
  /**
    * The name of the destination image.
    */
  var DestinationImageName: js.UndefOr[Name] = js.native
}

object CopyImageResponse {
  @scala.inline
  def apply(DestinationImageName: Name = null): CopyImageResponse = {
    val __obj = js.Dynamic.literal()
    if (DestinationImageName != null) __obj.updateDynamic("DestinationImageName")(DestinationImageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyImageResponse]
  }
}

