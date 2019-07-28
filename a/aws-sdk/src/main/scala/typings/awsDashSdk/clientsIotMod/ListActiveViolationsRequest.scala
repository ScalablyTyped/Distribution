package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListActiveViolationsRequest extends js.Object {
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The name of the Device Defender security profile for which violations are listed.
    */
  var securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined
  /**
    * The name of the thing whose active violations are listed.
    */
  var thingName: js.UndefOr[ThingName] = js.undefined
}

object ListActiveViolationsRequest {
  @scala.inline
  def apply(
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null,
    securityProfileName: SecurityProfileName = null,
    thingName: ThingName = null
  ): ListActiveViolationsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (securityProfileName != null) __obj.updateDynamic("securityProfileName")(securityProfileName)
    if (thingName != null) __obj.updateDynamic("thingName")(thingName)
    __obj.asInstanceOf[ListActiveViolationsRequest]
  }
}

