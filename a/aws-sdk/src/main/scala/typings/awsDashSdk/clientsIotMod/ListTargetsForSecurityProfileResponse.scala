package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTargetsForSecurityProfileResponse extends js.Object {
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The thing groups to which the security profile is attached.
    */
  var securityProfileTargets: js.UndefOr[SecurityProfileTargets] = js.native
}

object ListTargetsForSecurityProfileResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, securityProfileTargets: SecurityProfileTargets = null): ListTargetsForSecurityProfileResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (securityProfileTargets != null) __obj.updateDynamic("securityProfileTargets")(securityProfileTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTargetsForSecurityProfileResponse]
  }
}

