package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Root extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the root. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the AWS Organizations User Guide.
    */
  var Arn: js.UndefOr[RootArn] = js.undefined
  /**
    * The unique identifier (ID) for the root. The regex pattern for a root ID string requires "r-" followed by from 4 to 32 lower-case letters or digits.
    */
  var Id: js.UndefOr[RootId] = js.undefined
  /**
    * The friendly name of the root. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
    */
  var Name: js.UndefOr[RootName] = js.undefined
  /**
    * The types of policies that are currently enabled for the root and therefore can be attached to the root or to its OUs or accounts.  Even if a policy type is shown as available in the organization, you can separately enable and disable them at the root level by using EnablePolicyType and DisablePolicyType. Use DescribeOrganization to see the availability of the policy types in that organization. 
    */
  var PolicyTypes: js.UndefOr[PolicyTypes] = js.undefined
}

object Root {
  @scala.inline
  def apply(Arn: RootArn = null, Id: RootId = null, Name: RootName = null, PolicyTypes: PolicyTypes = null): Root = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (PolicyTypes != null) __obj.updateDynamic("PolicyTypes")(PolicyTypes)
    __obj.asInstanceOf[Root]
  }
}

