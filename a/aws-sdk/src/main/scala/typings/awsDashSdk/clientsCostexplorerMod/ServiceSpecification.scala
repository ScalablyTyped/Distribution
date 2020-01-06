package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceSpecification extends js.Object {
  /**
    * The Amazon EC2 hardware specifications that you want AWS to provide recommendations for.
    */
  var EC2Specification: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.EC2Specification] = js.native
}

object ServiceSpecification {
  @scala.inline
  def apply(EC2Specification: EC2Specification = null): ServiceSpecification = {
    val __obj = js.Dynamic.literal()
    if (EC2Specification != null) __obj.updateDynamic("EC2Specification")(EC2Specification.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceSpecification]
  }
}

