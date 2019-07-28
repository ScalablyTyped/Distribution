package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateServiceSpecificCredentialResponse extends js.Object {
  /**
    * A structure that contains information about the newly created service-specific credential.  This is the only time that the password for this credential set is available. It cannot be recovered later. Instead, you must reset the password with ResetServiceSpecificCredential. 
    */
  var ServiceSpecificCredential: js.UndefOr[typings.awsDashSdk.clientsIamMod.ServiceSpecificCredential] = js.undefined
}

object CreateServiceSpecificCredentialResponse {
  @scala.inline
  def apply(ServiceSpecificCredential: ServiceSpecificCredential = null): CreateServiceSpecificCredentialResponse = {
    val __obj = js.Dynamic.literal()
    if (ServiceSpecificCredential != null) __obj.updateDynamic("ServiceSpecificCredential")(ServiceSpecificCredential)
    __obj.asInstanceOf[CreateServiceSpecificCredentialResponse]
  }
}

