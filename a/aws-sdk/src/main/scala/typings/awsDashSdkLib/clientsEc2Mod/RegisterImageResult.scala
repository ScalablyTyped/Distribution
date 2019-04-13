package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterImageResult extends js.Object {
  /**
    * The ID of the newly registered AMI.
    */
  var ImageId: js.UndefOr[String] = js.undefined
}

object RegisterImageResult {
  @scala.inline
  def apply(ImageId: String = null): RegisterImageResult = {
    val __obj = js.Dynamic.literal()
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId)
    __obj.asInstanceOf[RegisterImageResult]
  }
}

