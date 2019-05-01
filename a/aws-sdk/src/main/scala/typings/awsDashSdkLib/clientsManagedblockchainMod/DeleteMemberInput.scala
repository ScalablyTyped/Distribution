package typings
package awsDashSdkLib.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMemberInput extends js.Object {
  /**
    * The unique identifier of the member to remove.
    */
  var MemberId: ResourceIdString
  /**
    * The unique identifier of the network from which the member is removed.
    */
  var NetworkId: ResourceIdString
}

object DeleteMemberInput {
  @scala.inline
  def apply(MemberId: ResourceIdString, NetworkId: ResourceIdString): DeleteMemberInput = {
    val __obj = js.Dynamic.literal(MemberId = MemberId, NetworkId = NetworkId)
  
    __obj.asInstanceOf[DeleteMemberInput]
  }
}

