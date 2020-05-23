package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlexaForBusinessMetadata extends js.Object {
  /**
    * The ARN of the room resource.
    */
  var AlexaForBusinessRoomArn: js.UndefOr[SensitiveString] = js.native
  /**
    * Starts or stops Alexa for Business.
    */
  var IsAlexaForBusinessEnabled: js.UndefOr[Boolean] = js.native
}

object AlexaForBusinessMetadata {
  @scala.inline
  def apply(
    AlexaForBusinessRoomArn: SensitiveString = null,
    IsAlexaForBusinessEnabled: js.UndefOr[Boolean] = js.undefined
  ): AlexaForBusinessMetadata = {
    val __obj = js.Dynamic.literal()
    if (AlexaForBusinessRoomArn != null) __obj.updateDynamic("AlexaForBusinessRoomArn")(AlexaForBusinessRoomArn.asInstanceOf[js.Any])
    if (!js.isUndefined(IsAlexaForBusinessEnabled)) __obj.updateDynamic("IsAlexaForBusinessEnabled")(IsAlexaForBusinessEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlexaForBusinessMetadata]
  }
}

