package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMemberInput extends js.Object {
  /**
    * The unique identifier of the member.
    */
  var MemberId: ResourceIdString = js.native
  /**
    * The unique identifier of the network to which the member belongs.
    */
  var NetworkId: ResourceIdString = js.native
}

object GetMemberInput {
  @scala.inline
  def apply(MemberId: ResourceIdString, NetworkId: ResourceIdString): GetMemberInput = {
    val __obj = js.Dynamic.literal(MemberId = MemberId.asInstanceOf[js.Any], NetworkId = NetworkId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetMemberInput]
  }
}

