package typings
package awsDashSdkLib.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ByteMatchSetUpdate extends js.Object {
  /**
    * Specifies whether to insert or delete a ByteMatchTuple.
    */
  var Action: ChangeAction
  /**
    * Information about the part of a web request that you want AWS WAF to inspect and the value that you want AWS WAF to search for. If you specify DELETE for the value of Action, the ByteMatchTuple values must exactly match the values in the ByteMatchTuple that you want to delete from the ByteMatchSet.
    */
  var ByteMatchTuple: awsDashSdkLib.clientsWafMod.ByteMatchTuple
}

object ByteMatchSetUpdate {
  @scala.inline
  def apply(Action: ChangeAction, ByteMatchTuple: ByteMatchTuple): ByteMatchSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], ByteMatchTuple = ByteMatchTuple)
  
    __obj.asInstanceOf[ByteMatchSetUpdate]
  }
}

