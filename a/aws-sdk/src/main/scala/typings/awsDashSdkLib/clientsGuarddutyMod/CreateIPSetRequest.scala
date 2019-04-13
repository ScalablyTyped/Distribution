package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIPSetRequest extends js.Object {
  /**
    * A boolean value that indicates whether GuardDuty is to start using the uploaded IPSet.
    */
  var Activate: awsDashSdkLib.clientsGuarddutyMod.Activate
  /**
    * The idempotency token for the create request.
    */
  var ClientToken: js.UndefOr[__stringMin0Max64] = js.undefined
  /**
    * The unique ID of the detector that you want to update.
    */
  var DetectorId: __string
  /**
    * The format of the file that contains the IPSet.
    */
  var Format: IpSetFormat
  /**
    * The URI of the file that contains the IPSet. For example (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
    */
  var Location: awsDashSdkLib.clientsGuarddutyMod.Location
  /**
    * The user friendly name to identify the IPSet. This name is displayed in all findings that are triggered by activity that involves IP addresses included in this IPSet.
    */
  var Name: awsDashSdkLib.clientsGuarddutyMod.Name
}

object CreateIPSetRequest {
  @scala.inline
  def apply(
    Activate: Activate,
    DetectorId: __string,
    Format: IpSetFormat,
    Location: Location,
    Name: Name,
    ClientToken: __stringMin0Max64 = null
  ): CreateIPSetRequest = {
    val __obj = js.Dynamic.literal(Activate = Activate, DetectorId = DetectorId, Format = Format.asInstanceOf[js.Any], Location = Location, Name = Name)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    __obj.asInstanceOf[CreateIPSetRequest]
  }
}

