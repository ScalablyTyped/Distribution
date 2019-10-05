package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateIPSetRequest extends js.Object {
  /**
    * The updated boolean value that specifies whether the IPSet is active or not.
    */
  var Activate: js.UndefOr[Boolean] = js.undefined
  /**
    * The detectorID that specifies the GuardDuty service whose IPSet you want to update.
    */
  var DetectorId: typings.awsDashSdk.clientsGuarddutyMod.DetectorId
  /**
    * The unique ID that specifies the IPSet that you want to update.
    */
  var IpSetId: String
  /**
    * The updated URI of the file that contains the IPSet. For example (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key).
    */
  var Location: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.Location] = js.undefined
  /**
    * The unique ID that specifies the IPSet that you want to update.
    */
  var Name: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.Name] = js.undefined
}

object UpdateIPSetRequest {
  @scala.inline
  def apply(
    DetectorId: DetectorId,
    IpSetId: String,
    Activate: js.UndefOr[scala.Boolean] = js.undefined,
    Location: Location = null,
    Name: Name = null
  ): UpdateIPSetRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId, IpSetId = IpSetId)
    if (!js.isUndefined(Activate)) __obj.updateDynamic("Activate")(Activate)
    if (Location != null) __obj.updateDynamic("Location")(Location)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[UpdateIPSetRequest]
  }
}

