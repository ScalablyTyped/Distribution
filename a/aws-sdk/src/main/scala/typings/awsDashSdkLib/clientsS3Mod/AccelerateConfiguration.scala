package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccelerateConfiguration extends js.Object {
  /**
    * Specifies the transfer acceleration status of the bucket.
    */
  var Status: js.UndefOr[BucketAccelerateStatus] = js.undefined
}

object AccelerateConfiguration {
  @scala.inline
  def apply(Status: BucketAccelerateStatus = null): AccelerateConfiguration = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerateConfiguration]
  }
}

