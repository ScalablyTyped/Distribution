package typings
package awsDashSdkLib.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMemberInput extends js.Object {
  /**
    * The unique identifier of the member.
    */
  var MemberId: ResourceIdString
  /**
    * The unique identifier of the network to which the member belongs.
    */
  var NetworkId: ResourceIdString
}

object GetMemberInput {
  @scala.inline
  def apply(MemberId: ResourceIdString, NetworkId: ResourceIdString): GetMemberInput = {
    val __obj = js.Dynamic.literal(MemberId = MemberId, NetworkId = NetworkId)
  
    __obj.asInstanceOf[GetMemberInput]
  }
}

