package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterImageResult extends js.Object {
  /**
    * The ID of the newly registered AMI.
    */
  var ImageId: js.UndefOr[String] = js.native
}

object RegisterImageResult {
  @scala.inline
  def apply(ImageId: String = null): RegisterImageResult = {
    val __obj = js.Dynamic.literal()
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterImageResult]
  }
}

