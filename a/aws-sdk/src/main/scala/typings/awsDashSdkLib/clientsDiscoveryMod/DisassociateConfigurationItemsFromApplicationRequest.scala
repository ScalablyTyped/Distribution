package typings
package awsDashSdkLib.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateConfigurationItemsFromApplicationRequest extends js.Object {
  /**
    * Configuration ID of an application from which each item is disassociated.
    */
  var applicationConfigurationId: ApplicationId
  /**
    * Configuration ID of each item to be disassociated from an application.
    */
  var configurationIds: ConfigurationIdList
}

object DisassociateConfigurationItemsFromApplicationRequest {
  @scala.inline
  def apply(applicationConfigurationId: ApplicationId, configurationIds: ConfigurationIdList): DisassociateConfigurationItemsFromApplicationRequest = {
    val __obj = js.Dynamic.literal(applicationConfigurationId = applicationConfigurationId, configurationIds = configurationIds)
  
    __obj.asInstanceOf[DisassociateConfigurationItemsFromApplicationRequest]
  }
}

