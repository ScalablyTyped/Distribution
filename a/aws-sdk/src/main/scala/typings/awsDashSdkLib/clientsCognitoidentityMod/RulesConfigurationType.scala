package typings
package awsDashSdkLib.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RulesConfigurationType extends js.Object {
  /**
    * An array of rules. You can specify up to 25 rules per identity provider. Rules are evaluated in order. The first one to match specifies the role.
    */
  var Rules: MappingRulesList
}

object RulesConfigurationType {
  @scala.inline
  def apply(Rules: MappingRulesList): RulesConfigurationType = {
    val __obj = js.Dynamic.literal(Rules = Rules)
  
    __obj.asInstanceOf[RulesConfigurationType]
  }
}

