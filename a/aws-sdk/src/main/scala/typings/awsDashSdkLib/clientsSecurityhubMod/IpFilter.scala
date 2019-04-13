package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpFilter extends js.Object {
  /**
    * Finding's CIDR value.
    */
  var Cidr: js.UndefOr[NonEmptyString] = js.undefined
}

object IpFilter {
  @scala.inline
  def apply(Cidr: NonEmptyString = null): IpFilter = {
    val __obj = js.Dynamic.literal()
    if (Cidr != null) __obj.updateDynamic("Cidr")(Cidr)
    __obj.asInstanceOf[IpFilter]
  }
}

