package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoncurrentVersionExpiration extends js.Object {
  /**
    * Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action. For information about the noncurrent days calculations, see How Amazon S3 Calculates When an Object Became Noncurrent in the Amazon Simple Storage Service Developer Guide.
    */
  var NoncurrentDays: js.UndefOr[Days] = js.undefined
}

object NoncurrentVersionExpiration {
  @scala.inline
  def apply(NoncurrentDays: Int | Double = null): NoncurrentVersionExpiration = {
    val __obj = js.Dynamic.literal()
    if (NoncurrentDays != null) __obj.updateDynamic("NoncurrentDays")(NoncurrentDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoncurrentVersionExpiration]
  }
}

