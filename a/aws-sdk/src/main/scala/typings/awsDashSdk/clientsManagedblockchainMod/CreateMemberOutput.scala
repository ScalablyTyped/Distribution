package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMemberOutput extends js.Object {
  /**
    * The unique identifier of the member.
    */
  var MemberId: js.UndefOr[ResourceIdString] = js.undefined
}

object CreateMemberOutput {
  @scala.inline
  def apply(MemberId: ResourceIdString = null): CreateMemberOutput = {
    val __obj = js.Dynamic.literal()
    if (MemberId != null) __obj.updateDynamic("MemberId")(MemberId)
    __obj.asInstanceOf[CreateMemberOutput]
  }
}

