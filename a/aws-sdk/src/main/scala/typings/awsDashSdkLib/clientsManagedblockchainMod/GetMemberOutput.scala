package typings
package awsDashSdkLib.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMemberOutput extends js.Object {
  /**
    * The properties of a member.
    */
  var Member: js.UndefOr[Member] = js.undefined
}

object GetMemberOutput {
  @scala.inline
  def apply(Member: Member = null): GetMemberOutput = {
    val __obj = js.Dynamic.literal()
    if (Member != null) __obj.updateDynamic("Member")(Member)
    __obj.asInstanceOf[GetMemberOutput]
  }
}

