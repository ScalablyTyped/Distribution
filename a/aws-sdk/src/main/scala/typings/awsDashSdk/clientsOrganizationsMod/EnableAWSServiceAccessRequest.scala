package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableAWSServiceAccessRequest extends js.Object {
  /**
    * The service principal name of the AWS service for which you want to enable integration with your organization. This is typically in the form of a URL, such as  service-abbreviation.amazonaws.com.
    */
  var ServicePrincipal: typings.awsDashSdk.clientsOrganizationsMod.ServicePrincipal
}

object EnableAWSServiceAccessRequest {
  @scala.inline
  def apply(ServicePrincipal: ServicePrincipal): EnableAWSServiceAccessRequest = {
    val __obj = js.Dynamic.literal(ServicePrincipal = ServicePrincipal)
  
    __obj.asInstanceOf[EnableAWSServiceAccessRequest]
  }
}

