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
  def apply(DestinationImageName: Name, DestinationRegion: RegionName, SourceImageName: Name): CopyImageRequest = {
    val __obj = js.Dynamic.literal(DestinationImageName = DestinationImageName.asInstanceOf[js.Any], DestinationRegion = DestinationRegion.asInstanceOf[js.Any], SourceImageName = SourceImageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyImageRequest]
  }
  @scala.inline
  implicit class CopyImageRequestOps[Self <: CopyImageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestinationImageName(value: Name): Self = this.set("DestinationImageName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationRegion(value: RegionName): Self = this.set("DestinationRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceImageName(value: Name): Self = this.set("SourceImageName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationImageDescription(value: Description): Self = this.set("DestinationImageDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationImageDescription: Self = this.set("DestinationImageDescription", js.undefined)
  }
  
}

