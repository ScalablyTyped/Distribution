package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServerCertificateRequest extends js.Object {
  /**
    * The name of the server certificate you want to retrieve information about. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var ServerCertificateName: serverCertificateNameType
}

object GetServerCertificateRequest {
  @scala.inline
  def apply(ServerCertificateName: serverCertificateNameType): GetServerCertificateRequest = {
    val __obj = js.Dynamic.literal(ServerCertificateName = ServerCertificateName)
  
    __obj.asInstanceOf[GetServerCertificateRequest]
  }
}

