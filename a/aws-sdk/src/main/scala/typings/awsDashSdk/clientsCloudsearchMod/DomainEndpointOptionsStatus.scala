package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainEndpointOptionsStatus extends js.Object {
  /**
    * The domain endpoint options configured for the domain.
    */
  var Options: DomainEndpointOptions = js.native
  /**
    * The status of the configured domain endpoint options.
    */
  var Status: OptionStatus = js.native
}

object DomainEndpointOptionsStatus {
  @scala.inline
  def apply(Options: DomainEndpointOptions, Status: OptionStatus): DomainEndpointOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DomainEndpointOptionsStatus]
  }
}

