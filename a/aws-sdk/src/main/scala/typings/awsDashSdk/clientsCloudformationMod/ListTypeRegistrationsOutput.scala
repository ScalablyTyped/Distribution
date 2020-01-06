package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTypeRegistrationsOutput extends js.Object {
  /**
    * If the request doesn't return all of the remaining results, NextToken is set to a token. To retrieve the next set of results, call this action again and assign that token to the request object's NextToken parameter. If the request returns all results, NextToken is set to null.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.NextToken] = js.native
  /**
    *  A list of type registration tokens. Use  DescribeTypeRegistration  to return detailed information about a type registration request.
    */
  var RegistrationTokenList: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.RegistrationTokenList] = js.native
}

object ListTypeRegistrationsOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, RegistrationTokenList: RegistrationTokenList = null): ListTypeRegistrationsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RegistrationTokenList != null) __obj.updateDynamic("RegistrationTokenList")(RegistrationTokenList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTypeRegistrationsOutput]
  }
}

