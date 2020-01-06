package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAvailabilityOptionsRequest extends js.Object {
  var DomainName: typings.awsDashSdk.clientsCloudsearchMod.DomainName = js.native
  /**
    * You expand an existing search domain to a second Availability Zone by setting the Multi-AZ option to true. Similarly, you can turn off the Multi-AZ option to downgrade the domain to a single Availability Zone by setting the Multi-AZ option to false. 
    */
  var MultiAZ: Boolean = js.native
}

object UpdateAvailabilityOptionsRequest {
  @scala.inline
  def apply(DomainName: DomainName, MultiAZ: Boolean): UpdateAvailabilityOptionsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], MultiAZ = MultiAZ.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateAvailabilityOptionsRequest]
  }
}

