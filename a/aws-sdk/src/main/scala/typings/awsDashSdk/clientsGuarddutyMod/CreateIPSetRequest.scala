package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIPSetRequest extends js.Object {
  /**
    * A boolean value that indicates whether GuardDuty is to start using the uploaded IPSet.
    */
  var Activate: Boolean = js.native
  /**
    * The idempotency token for the create request.
    */
  var ClientToken: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.ClientToken] = js.native
  /**
    * The unique ID of the detector of the GuardDuty account for which you want to create an IPSet.
    */
  var DetectorId: typings.awsDashSdk.clientsGuarddutyMod.DetectorId = js.native
  /**
    * The format of the file that contains the IPSet.
    */
  var Format: IpSetFormat = js.native
  /**
    * The URI of the file that contains the IPSet. For example (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
    */
  var Location: typings.awsDashSdk.clientsGuarddutyMod.Location = js.native
  /**
    * The user friendly name to identify the IPSet. This name is displayed in all findings that are triggered by activity that involves IP addresses included in this IPSet.
    */
  var Name: typings.awsDashSdk.clientsGuarddutyMod.Name = js.native
  /**
    * The tags to be added to a new IP set resource.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}

object CreateIPSetRequest {
  @scala.inline
  def apply(
    Activate: Boolean,
    DetectorId: DetectorId,
    Format: IpSetFormat,
    Location: Location,
    Name: Name,
    ClientToken: ClientToken = null,
    Tags: TagMap = null
  ): CreateIPSetRequest = {
    val __obj = js.Dynamic.literal(Activate = Activate.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIPSetRequest]
  }
}

