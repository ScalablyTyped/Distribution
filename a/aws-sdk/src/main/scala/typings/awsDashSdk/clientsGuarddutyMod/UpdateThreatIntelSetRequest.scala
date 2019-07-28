package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateThreatIntelSetRequest extends js.Object {
  /**
    * The updated boolean value that specifies whether the ThreateIntelSet is active or not.
    */
  var Activate: js.UndefOr[Boolean] = js.undefined
  /**
    * The detectorID that specifies the GuardDuty service whose ThreatIntelSet you want to update.
    */
  var DetectorId: typings.awsDashSdk.clientsGuarddutyMod.DetectorId
  /**
    * The updated URI of the file that contains the ThreateIntelSet. For example (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
    */
  var Location: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.Location] = js.undefined
  /**
    * The unique ID that specifies the ThreatIntelSet that you want to update.
    */
  var Name: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.Name] = js.undefined
  /**
    * The unique ID that specifies the ThreatIntelSet that you want to update.
    */
  var ThreatIntelSetId: String
}

object UpdateThreatIntelSetRequest {
  @scala.inline
  def apply(
    DetectorId: DetectorId,
    ThreatIntelSetId: String,
    Activate: js.UndefOr[Boolean] = js.undefined,
    Location: Location = null,
    Name: Name = null
  ): UpdateThreatIntelSetRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId, ThreatIntelSetId = ThreatIntelSetId)
    if (!js.isUndefined(Activate)) __obj.updateDynamic("Activate")(Activate)
    if (Location != null) __obj.updateDynamic("Location")(Location)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[UpdateThreatIntelSetRequest]
  }
}

