package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteApplicationsRequest extends js.Object {
  /**
    * Configuration ID of an application to be deleted.
    */
  var configurationIds: ApplicationIdsList
}

object DeleteApplicationsRequest {
  @scala.inline
  def apply(configurationIds: ApplicationIdsList): DeleteApplicationsRequest = {
    val __obj = js.Dynamic.literal(configurationIds = configurationIds)
  
    __obj.asInstanceOf[DeleteApplicationsRequest]
  }
}

