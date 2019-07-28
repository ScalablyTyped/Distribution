package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transition extends js.Object {
  /**
    * Indicates when objects are transitioned to the specified storage class. The date value must be in ISO 8601 format. The time is always midnight UTC.
    */
  var Date: js.UndefOr[_Date] = js.undefined
  /**
    * Indicates the number of days after creation when objects are transitioned to the specified storage class. The value must be a positive integer.
    */
  var Days: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Days] = js.undefined
  /**
    * The storage class to which you want the object to transition.
    */
  var StorageClass: js.UndefOr[TransitionStorageClass] = js.undefined
}

object Transition {
  @scala.inline
  def apply(
    Date: _Date = null,
    Days: js.UndefOr[Days] = js.undefined,
    StorageClass: TransitionStorageClass = null
  ): Transition = {
    val __obj = js.Dynamic.literal()
    if (Date != null) __obj.updateDynamic("Date")(Date)
    if (!js.isUndefined(Days)) __obj.updateDynamic("Days")(Days)
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transition]
  }
}

