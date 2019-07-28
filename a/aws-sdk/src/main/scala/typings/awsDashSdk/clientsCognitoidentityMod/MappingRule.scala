package typings.awsDashSdk.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappingRule extends js.Object {
  /**
    * The claim name that must be present in the token, for example, "isAdmin" or "paid".
    */
  var Claim: ClaimName
  /**
    * The match condition that specifies how closely the claim value in the IdP token must match Value.
    */
  var MatchType: MappingRuleMatchType
  /**
    * The role ARN.
    */
  var RoleARN: ARNString
  /**
    * A brief string that the claim must match, for example, "paid" or "yes".
    */
  var Value: ClaimValue
}

object MappingRule {
  @scala.inline
  def apply(Claim: ClaimName, MatchType: MappingRuleMatchType, RoleARN: ARNString, Value: ClaimValue): MappingRule = {
    val __obj = js.Dynamic.literal(Claim = Claim, MatchType = MatchType.asInstanceOf[js.Any], RoleARN = RoleARN, Value = Value)
  
    __obj.asInstanceOf[MappingRule]
  }
}

