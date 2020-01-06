package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListServiceSpecificCredentialsResponse extends js.Object {
  /**
    * A list of structures that each contain details about a service-specific credential.
    */
  var ServiceSpecificCredentials: js.UndefOr[ServiceSpecificCredentialsListType] = js.native
}

object ListServiceSpecificCredentialsResponse {
  @scala.inline
  def apply(ServiceSpecificCredentials: ServiceSpecificCredentialsListType = null): ListServiceSpecificCredentialsResponse = {
    val __obj = js.Dynamic.literal()
    if (ServiceSpecificCredentials != null) __obj.updateDynamic("ServiceSpecificCredentials")(ServiceSpecificCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServiceSpecificCredentialsResponse]
  }
}

