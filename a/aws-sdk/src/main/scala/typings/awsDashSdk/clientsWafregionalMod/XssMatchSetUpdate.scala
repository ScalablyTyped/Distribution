package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XssMatchSetUpdate extends js.Object {
  /**
    * Specify INSERT to add an XssMatchSetUpdate to an XssMatchSet. Use DELETE to remove an XssMatchSetUpdate from an XssMatchSet.
    */
  var Action: ChangeAction = js.native
  /**
    * Specifies the part of a web request that you want AWS WAF to inspect for cross-site scripting attacks and, if you want AWS WAF to inspect a header, the name of the header.
    */
  var XssMatchTuple: typings.awsDashSdk.clientsWafregionalMod.XssMatchTuple = js.native
}

object XssMatchSetUpdate {
  @scala.inline
  def apply(Action: ChangeAction, XssMatchTuple: XssMatchTuple): XssMatchSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], XssMatchTuple = XssMatchTuple.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[XssMatchSetUpdate]
  }
}

