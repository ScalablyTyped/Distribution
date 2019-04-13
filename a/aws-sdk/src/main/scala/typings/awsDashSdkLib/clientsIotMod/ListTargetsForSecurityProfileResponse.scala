package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTargetsForSecurityProfileResponse extends js.Object {
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The thing groups to which the security profile is attached.
    */
  var securityProfileTargets: js.UndefOr[SecurityProfileTargets] = js.undefined
}

object ListTargetsForSecurityProfileResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, securityProfileTargets: SecurityProfileTargets = null): ListTargetsForSecurityProfileResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (securityProfileTargets != null) __obj.updateDynamic("securityProfileTargets")(securityProfileTargets)
    __obj.asInstanceOf[ListTargetsForSecurityProfileResponse]
  }
}

