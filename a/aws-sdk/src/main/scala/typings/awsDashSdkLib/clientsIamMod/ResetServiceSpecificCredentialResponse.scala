package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetServiceSpecificCredentialResponse extends js.Object {
  /**
    * A structure with details about the updated service-specific credential, including the new password.  This is the only time that you can access the password. You cannot recover the password later, but you can reset it again. 
    */
  var ServiceSpecificCredential: js.UndefOr[ServiceSpecificCredential] = js.undefined
}

object ResetServiceSpecificCredentialResponse {
  @scala.inline
  def apply(ServiceSpecificCredential: ServiceSpecificCredential = null): ResetServiceSpecificCredentialResponse = {
    val __obj = js.Dynamic.literal()
    if (ServiceSpecificCredential != null) __obj.updateDynamic("ServiceSpecificCredential")(ServiceSpecificCredential)
    __obj.asInstanceOf[ResetServiceSpecificCredentialResponse]
  }
}

