package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDetectorRequest extends js.Object {
  /**
    * The idempotency token for the create request.
    */
  var ClientToken: js.UndefOr[ClientToken] = js.undefined
  /**
    * A boolean value that specifies whether the detector is to be enabled.
    */
  var Enable: Boolean
  /**
    * A enum value that specifies how frequently customer got Finding updates published.
    */
  var FindingPublishingFrequency: js.UndefOr[FindingPublishingFrequency] = js.undefined
  /**
    * The tags to be added to a new detector resource.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}

object CreateDetectorRequest {
  @scala.inline
  def apply(
    Enable: Boolean,
    ClientToken: ClientToken = null,
    FindingPublishingFrequency: FindingPublishingFrequency = null,
    Tags: TagMap = null
  ): CreateDetectorRequest = {
    val __obj = js.Dynamic.literal(Enable = Enable)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (FindingPublishingFrequency != null) __obj.updateDynamic("FindingPublishingFrequency")(FindingPublishingFrequency.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateDetectorRequest]
  }
}

