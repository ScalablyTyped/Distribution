package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainEndpointOptionsStatus extends js.Object {
  /**
    * Options to configure endpoint for the Elasticsearch domain.
    */
  var Options: DomainEndpointOptions
  /**
    * The status of the endpoint options for the Elasticsearch domain. See OptionStatus for the status information that's included. 
    */
  var Status: OptionStatus
}

object DomainEndpointOptionsStatus {
  @scala.inline
  def apply(Options: DomainEndpointOptions, Status: OptionStatus): DomainEndpointOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options, Status = Status)
  
    __obj.asInstanceOf[DomainEndpointOptionsStatus]
  }
}

