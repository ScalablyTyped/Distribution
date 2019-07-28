package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyImageResult extends js.Object {
  /**
    * The ID of the new AMI.
    */
  var ImageId: js.UndefOr[String] = js.undefined
}

object CopyImageResult {
  @scala.inline
  def apply(ImageId: String = null): CopyImageResult = {
    val __obj = js.Dynamic.literal()
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId)
    __obj.asInstanceOf[CopyImageResult]
  }
}

