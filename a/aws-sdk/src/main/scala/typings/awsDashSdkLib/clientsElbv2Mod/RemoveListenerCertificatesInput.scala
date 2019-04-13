package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveListenerCertificatesInput extends js.Object {
  /**
    * The certificate to remove. You can specify one certificate per call. Set CertificateArn to the certificate ARN but do not set IsDefault.
    */
  var Certificates: CertificateList
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: awsDashSdkLib.clientsElbv2Mod.ListenerArn
}

object RemoveListenerCertificatesInput {
  @scala.inline
  def apply(Certificates: CertificateList, ListenerArn: ListenerArn): RemoveListenerCertificatesInput = {
    val __obj = js.Dynamic.literal(Certificates = Certificates, ListenerArn = ListenerArn)
  
    __obj.asInstanceOf[RemoveListenerCertificatesInput]
  }
}

