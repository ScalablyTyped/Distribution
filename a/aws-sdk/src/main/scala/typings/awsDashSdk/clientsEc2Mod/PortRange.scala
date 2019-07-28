package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortRange extends js.Object {
  /**
    * The first port in the range.
    */
  var From: js.UndefOr[Integer] = js.undefined
  /**
    * The last port in the range.
    */
  var To: js.UndefOr[Integer] = js.undefined
}

object PortRange {
  @scala.inline
  def apply(From: js.UndefOr[Integer] = js.undefined, To: js.UndefOr[Integer] = js.undefined): PortRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(From)) __obj.updateDynamic("From")(From)
    if (!js.isUndefined(To)) __obj.updateDynamic("To")(To)
    __obj.asInstanceOf[PortRange]
  }
}

