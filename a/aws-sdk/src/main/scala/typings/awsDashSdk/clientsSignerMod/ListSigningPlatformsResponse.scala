package typings.awsDashSdk.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSigningPlatformsResponse extends js.Object {
  /**
    * Value for specifying the next set of paginated results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * A list of all platforms that match the request parameters.
    */
  var platforms: js.UndefOr[SigningPlatforms] = js.undefined
}

object ListSigningPlatformsResponse {
  @scala.inline
  def apply(nextToken: String = null, platforms: SigningPlatforms = null): ListSigningPlatformsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (platforms != null) __obj.updateDynamic("platforms")(platforms)
    __obj.asInstanceOf[ListSigningPlatformsResponse]
  }
}

