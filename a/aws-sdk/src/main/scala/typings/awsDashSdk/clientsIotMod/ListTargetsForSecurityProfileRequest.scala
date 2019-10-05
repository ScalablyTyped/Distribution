package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTargetsForSecurityProfileRequest extends js.Object {
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The security profile.
    */
  var securityProfileName: SecurityProfileName
}

object ListTargetsForSecurityProfileRequest {
  @scala.inline
  def apply(
    securityProfileName: SecurityProfileName,
    maxResults: Int | Double = null,
    nextToken: NextToken = null
  ): ListTargetsForSecurityProfileRequest = {
    val __obj = js.Dynamic.literal(securityProfileName = securityProfileName)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListTargetsForSecurityProfileRequest]
  }
}

