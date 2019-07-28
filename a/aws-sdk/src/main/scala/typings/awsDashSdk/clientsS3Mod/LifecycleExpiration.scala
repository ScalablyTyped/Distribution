package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleExpiration extends js.Object {
  /**
    * Indicates at what date the object is to be moved or deleted. Should be in GMT ISO 8601 Format.
    */
  var Date: js.UndefOr[_Date] = js.undefined
  /**
    * Indicates the lifetime, in days, of the objects that are subject to the rule. The value must be a non-zero positive integer.
    */
  var Days: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Days] = js.undefined
  /**
    * Indicates whether Amazon S3 will remove a delete marker with no noncurrent versions. If set to true, the delete marker will be expired; if set to false the policy takes no action. This cannot be specified with Days or Date in a Lifecycle Expiration Policy.
    */
  var ExpiredObjectDeleteMarker: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ExpiredObjectDeleteMarker] = js.undefined
}

object LifecycleExpiration {
  @scala.inline
  def apply(
    Date: _Date = null,
    Days: js.UndefOr[Days] = js.undefined,
    ExpiredObjectDeleteMarker: js.UndefOr[ExpiredObjectDeleteMarker] = js.undefined
  ): LifecycleExpiration = {
    val __obj = js.Dynamic.literal()
    if (Date != null) __obj.updateDynamic("Date")(Date)
    if (!js.isUndefined(Days)) __obj.updateDynamic("Days")(Days)
    if (!js.isUndefined(ExpiredObjectDeleteMarker)) __obj.updateDynamic("ExpiredObjectDeleteMarker")(ExpiredObjectDeleteMarker)
    __obj.asInstanceOf[LifecycleExpiration]
  }
}

