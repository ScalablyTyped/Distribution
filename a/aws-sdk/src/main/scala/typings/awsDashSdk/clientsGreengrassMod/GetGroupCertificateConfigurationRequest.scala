package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupCertificateConfigurationRequest extends js.Object {
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: __string
}

object GetGroupCertificateConfigurationRequest {
  @scala.inline
  def apply(GroupId: __string): GetGroupCertificateConfigurationRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId)
  
    __obj.asInstanceOf[GetGroupCertificateConfigurationRequest]
  }
}

