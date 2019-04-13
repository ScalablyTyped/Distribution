package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomAmi extends js.Object {
  /**
    * THe ID of the image used to create the custom AMI.
    */
  var ImageId: js.UndefOr[ImageId] = js.undefined
  /**
    * The type of virtualization used to create the custom AMI.
    */
  var VirtualizationType: js.UndefOr[VirtualizationType] = js.undefined
}

object CustomAmi {
  @scala.inline
  def apply(ImageId: ImageId = null, VirtualizationType: VirtualizationType = null): CustomAmi = {
    val __obj = js.Dynamic.literal()
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId)
    if (VirtualizationType != null) __obj.updateDynamic("VirtualizationType")(VirtualizationType)
    __obj.asInstanceOf[CustomAmi]
  }
}

