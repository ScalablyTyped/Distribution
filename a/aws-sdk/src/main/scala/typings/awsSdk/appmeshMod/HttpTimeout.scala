package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpTimeout extends js.Object {
  var idle: js.UndefOr[Duration] = js.native
  var perRequest: js.UndefOr[Duration] = js.native
}

object HttpTimeout {
  @scala.inline
  def apply(idle: Duration = null, perRequest: Duration = null): HttpTimeout = {
    val __obj = js.Dynamic.literal()
    if (idle != null) __obj.updateDynamic("idle")(idle.asInstanceOf[js.Any])
    if (perRequest != null) __obj.updateDynamic("perRequest")(perRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpTimeout]
  }
}

