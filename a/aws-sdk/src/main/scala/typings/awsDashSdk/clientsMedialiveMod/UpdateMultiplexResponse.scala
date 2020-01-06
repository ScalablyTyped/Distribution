package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMultiplexResponse extends js.Object {
  /**
    * The updated multiplex.
    */
  var Multiplex: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.Multiplex] = js.native
}

object UpdateMultiplexResponse {
  @scala.inline
  def apply(Multiplex: Multiplex = null): UpdateMultiplexResponse = {
    val __obj = js.Dynamic.literal()
    if (Multiplex != null) __obj.updateDynamic("Multiplex")(Multiplex.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMultiplexResponse]
  }
}

