package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTapesInput extends js.Object {
  /**
    * An optional number limit for the tapes in the list returned by this call.
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.undefined
  /**
    * A string that indicates the position at which to begin the returned list of tapes.
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.Marker] = js.undefined
  var TapeARNs: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.TapeARNs] = js.undefined
}

object ListTapesInput {
  @scala.inline
  def apply(Limit: Int | Double = null, Marker: Marker = null, TapeARNs: TapeARNs = null): ListTapesInput = {
    val __obj = js.Dynamic.literal()
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (TapeARNs != null) __obj.updateDynamic("TapeARNs")(TapeARNs)
    __obj.asInstanceOf[ListTapesInput]
  }
}

