package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceDefaultPolicyVersionParams extends js.Object {
  /**
    * The name of the template to be applied. The only supported value is BLANK_POLICY.
    */
  var templateName: PolicyTemplateName
}

object ReplaceDefaultPolicyVersionParams {
  @scala.inline
  def apply(templateName: PolicyTemplateName): ReplaceDefaultPolicyVersionParams = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReplaceDefaultPolicyVersionParams]
  }
}

