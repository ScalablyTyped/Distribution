package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDetectorRequest extends js.Object {
  /**
    * The idempotency token for the create request.
    */
  var ClientToken: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.ClientToken] = js.native
  /**
    * A boolean value that specifies whether the detector is to be enabled.
    */
  var Enable: Boolean = js.native
  /**
    * A enum value that specifies how frequently customer got Finding updates published.
    */
  var FindingPublishingFrequency: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.FindingPublishingFrequency] = js.native
  /**
    * The tags to be added to a new detector resource.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}

object CreateDetectorRequest {
  @scala.inline
  def apply(
    Enable: Boolean,
    ClientToken: ClientToken = null,
    FindingPublishingFrequency: FindingPublishingFrequency = null,
    Tags: TagMap = null
  ): CreateDetectorRequest = {
    val __obj = js.Dynamic.literal(Enable = Enable.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (FindingPublishingFrequency != null) __obj.updateDynamic("FindingPublishingFrequency")(FindingPublishingFrequency.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDetectorRequest]
  }
}

