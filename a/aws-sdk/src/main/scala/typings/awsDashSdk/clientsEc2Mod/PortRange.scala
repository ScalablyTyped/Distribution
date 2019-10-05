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
  def apply(From: Int | scala.Double = null, To: Int | scala.Double = null): PortRange = {
    val __obj = js.Dynamic.literal()
    if (From != null) __obj.updateDynamic("From")(From.asInstanceOf[js.Any])
    if (To != null) __obj.updateDynamic("To")(To.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortRange]
  }
}

