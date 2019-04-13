package typings
package awsDashSdkLib.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateConfigurationItemsToApplicationRequest extends js.Object {
  /**
    * The configuration ID of an application with which items are to be associated.
    */
  var applicationConfigurationId: ApplicationId
  /**
    * The ID of each configuration item to be associated with an application.
    */
  var configurationIds: ConfigurationIdList
}

object AssociateConfigurationItemsToApplicationRequest {
  @scala.inline
  def apply(applicationConfigurationId: ApplicationId, configurationIds: ConfigurationIdList): AssociateConfigurationItemsToApplicationRequest = {
    val __obj = js.Dynamic.literal(applicationConfigurationId = applicationConfigurationId, configurationIds = configurationIds)
  
    __obj.asInstanceOf[AssociateConfigurationItemsToApplicationRequest]
  }
}

