package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainDetails extends js.Object {
  /**
    * Domain information for the AWS API call.
    */
  var Domain: js.UndefOr[String] = js.native
}

object DomainDetails {
  @scala.inline
  def apply(Domain: String = null): DomainDetails = {
    val __obj = js.Dynamic.literal()
    if (Domain != null) __obj.updateDynamic("Domain")(Domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainDetails]
  }
}

