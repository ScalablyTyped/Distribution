package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeImagesResult extends js.Object {
  /**
    * Information about the images.
    */
  var Images: js.UndefOr[ImageList] = js.native
}

object DescribeImagesResult {
  @scala.inline
  def apply(Images: ImageList = null): DescribeImagesResult = {
    val __obj = js.Dynamic.literal()
    if (Images != null) __obj.updateDynamic("Images")(Images.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImagesResult]
  }
}

