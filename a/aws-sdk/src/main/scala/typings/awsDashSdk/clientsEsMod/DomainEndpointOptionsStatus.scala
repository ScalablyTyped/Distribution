package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainEndpointOptionsStatus extends js.Object {
  /**
    * Options to configure endpoint for the Elasticsearch domain.
    */
  var Options: DomainEndpointOptions = js.native
  /**
    * The status of the endpoint options for the Elasticsearch domain. See OptionStatus for the status information that's included. 
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

