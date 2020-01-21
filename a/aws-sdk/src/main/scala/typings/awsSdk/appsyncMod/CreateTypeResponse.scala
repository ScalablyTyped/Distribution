package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTypeResponse extends js.Object {
  /**
    * The Type object.
    */
  var `type`: js.UndefOr[Type] = js.native
}

object CreateTypeResponse {
  @scala.inline
  def apply(`type`: Type = null): CreateTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTypeResponse]
  }
}

