package typings
package awsDashSdkLib.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePlatformApplicationResponse extends js.Object {
  /**
    * PlatformApplicationArn is returned.
    */
  var PlatformApplicationArn: js.UndefOr[String] = js.undefined
}

object CreatePlatformApplicationResponse {
  @scala.inline
  def apply(PlatformApplicationArn: String = null): CreatePlatformApplicationResponse = {
    val __obj = js.Dynamic.literal()
    if (PlatformApplicationArn != null) __obj.updateDynamic("PlatformApplicationArn")(PlatformApplicationArn)
    __obj.asInstanceOf[CreatePlatformApplicationResponse]
  }
}

