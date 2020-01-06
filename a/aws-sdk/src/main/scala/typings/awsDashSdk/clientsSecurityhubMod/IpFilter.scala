package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpFilter extends js.Object {
  /**
    * A finding's CIDR value.
    */
  var Cidr: js.UndefOr[NonEmptyString] = js.native
}

object IpFilter {
  @scala.inline
  def apply(Cidr: NonEmptyString = null): IpFilter = {
    val __obj = js.Dynamic.literal()
    if (Cidr != null) __obj.updateDynamic("Cidr")(Cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpFilter]
  }
}

