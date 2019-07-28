package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyImageRequest extends js.Object {
  /**
    * The description that the image will have when it is copied to the destination.
    */
  var DestinationImageDescription: js.UndefOr[Description] = js.undefined
  /**
    * The name that the image will have when it is copied to the destination.
    */
  var DestinationImageName: Name
  /**
    * The destination region to which the image will be copied. This parameter is required, even if you are copying an image within the same region.
    */
  var DestinationRegion: RegionName
  /**
    * The name of the image to copy.
    */
  var SourceImageName: Name
}

object CopyImageRequest {
  @scala.inline
  def apply(
    DestinationImageName: Name,
    DestinationRegion: RegionName,
    SourceImageName: Name,
    DestinationImageDescription: Description = null
  ): CopyImageRequest = {
    val __obj = js.Dynamic.literal(DestinationImageName = DestinationImageName, DestinationRegion = DestinationRegion, SourceImageName = SourceImageName)
    if (DestinationImageDescription != null) __obj.updateDynamic("DestinationImageDescription")(DestinationImageDescription)
    __obj.asInstanceOf[CopyImageRequest]
  }
}

