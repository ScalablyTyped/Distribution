package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSecurityProfilesForTargetRequest extends js.Object {
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * If true, return child groups too.
    */
  var recursive: js.UndefOr[Recursive] = js.undefined
  /**
    * The ARN of the target (thing group) whose attached security profiles you want to get.
    */
  var securityProfileTargetArn: SecurityProfileTargetArn
}

object ListSecurityProfilesForTargetRequest {
  @scala.inline
  def apply(
    securityProfileTargetArn: SecurityProfileTargetArn,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null,
    recursive: js.UndefOr[Recursive] = js.undefined
  ): ListSecurityProfilesForTargetRequest = {
    val __obj = js.Dynamic.literal(securityProfileTargetArn = securityProfileTargetArn)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    __obj.asInstanceOf[ListSecurityProfilesForTargetRequest]
  }
}

