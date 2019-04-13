package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoncurrentVersionTransition extends js.Object {
  /**
    * Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action. For information about the noncurrent days calculations, see How Amazon S3 Calculates When an Object Became Noncurrent in the Amazon Simple Storage Service Developer Guide.
    */
  var NoncurrentDays: js.UndefOr[Days] = js.undefined
  /**
    * The class of storage used to store the object.
    */
  var StorageClass: js.UndefOr[TransitionStorageClass] = js.undefined
}

object NoncurrentVersionTransition {
  @scala.inline
  def apply(NoncurrentDays: js.UndefOr[Days] = js.undefined, StorageClass: TransitionStorageClass = null): NoncurrentVersionTransition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(NoncurrentDays)) __obj.updateDynamic("NoncurrentDays")(NoncurrentDays)
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoncurrentVersionTransition]
  }
}

