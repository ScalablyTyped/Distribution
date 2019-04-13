package typings
package awsDashSdkLib.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessPoliciesStatus extends js.Object {
  var Options: PolicyDocument
  var Status: OptionStatus
}

object AccessPoliciesStatus {
  @scala.inline
  def apply(Options: PolicyDocument, Status: OptionStatus): AccessPoliciesStatus = {
    val __obj = js.Dynamic.literal(Options = Options, Status = Status)
  
    __obj.asInstanceOf[AccessPoliciesStatus]
  }
}

