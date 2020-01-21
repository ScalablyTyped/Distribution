package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyImageRequest extends js.Object {
  /**
    * The description that the image will have when it is copied to the destination.
    */
  var DestinationImageDescription: js.UndefOr[Description] = js.native
  /**
    * The name that the image will have when it is copied to the destination.
    */
  var DestinationImageName: Name = js.native
  /**
    * The destination region to which the image will be copied. This parameter is required, even if you are copying an image within the same region.
    */
  var DestinationRegion: RegionName = js.native
  /**
    * The name of the image to copy.
    */
  var SourceImageName: Name = js.native
}

object CopyImageRequest {
  @scala.inline
  def apply(
    DestinationImageName: Name,
    DestinationRegion: RegionName,
    SourceImageName: Name,
    DestinationImageDescription: Description = null
  ): CopyImageRequest = {
    val __obj = js.Dynamic.literal(DestinationImageName = DestinationImageName.asInstanceOf[js.Any], DestinationRegion = DestinationRegion.asInstanceOf[js.Any], SourceImageName = SourceImageName.asInstanceOf[js.Any])
    if (DestinationImageDescription != null) __obj.updateDynamic("DestinationImageDescription")(DestinationImageDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyImageRequest]
  }
}

