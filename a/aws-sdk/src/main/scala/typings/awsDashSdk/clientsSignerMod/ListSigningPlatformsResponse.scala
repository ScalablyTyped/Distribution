package typings.awsDashSdk.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSigningPlatformsResponse extends js.Object {
  /**
    * Value for specifying the next set of paginated results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * A list of all platforms that match the request parameters.
    */
  var platforms: js.UndefOr[SigningPlatforms] = js.native
}

object ListSigningPlatformsResponse {
  @scala.inline
  def apply(nextToken: String = null, platforms: SigningPlatforms = null): ListSigningPlatformsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (platforms != null) __obj.updateDynamic("platforms")(platforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSigningPlatformsResponse]
  }
}

