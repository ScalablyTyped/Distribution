package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMemberInput extends js.Object {
  /**
    * The unique identifier of the member to remove.
    */
  var MemberId: ResourceIdString = js.native
  /**
    * The unique identifier of the network from which the member is removed.
    */
  var NetworkId: ResourceIdString = js.native
}

object DeleteMemberInput {
  @scala.inline
  def apply(MemberId: ResourceIdString, NetworkId: ResourceIdString): DeleteMemberInput = {
    val __obj = js.Dynamic.literal(MemberId = MemberId.asInstanceOf[js.Any], NetworkId = NetworkId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteMemberInput]
  }
}

