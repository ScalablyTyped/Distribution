package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePlatformApplicationResponse extends js.Object {
  /**
    * PlatformApplicationArn is returned.
    */
  var PlatformApplicationArn: js.UndefOr[String] = js.native
}

object CreatePlatformApplicationResponse {
  @scala.inline
  def apply(PlatformApplicationArn: String = null): CreatePlatformApplicationResponse = {
    val __obj = js.Dynamic.literal()
    if (PlatformApplicationArn != null) __obj.updateDynamic("PlatformApplicationArn")(PlatformApplicationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlatformApplicationResponse]
  }
}

