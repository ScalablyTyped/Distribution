package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2Specification extends js.Object {
  /**
    * Whether you want a recommendation for standard or convertible reservations.
    */
  var OfferingClass: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.OfferingClass] = js.native
}

object EC2Specification {
  @scala.inline
  def apply(OfferingClass: OfferingClass = null): EC2Specification = {
    val __obj = js.Dynamic.literal()
    if (OfferingClass != null) __obj.updateDynamic("OfferingClass")(OfferingClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[EC2Specification]
  }
}

