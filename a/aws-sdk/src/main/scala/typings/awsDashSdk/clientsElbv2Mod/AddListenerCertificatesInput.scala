package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddListenerCertificatesInput extends js.Object {
  /**
    * The certificate to add. You can specify one certificate per call. Set CertificateArn to the certificate ARN but do not set IsDefault.
    */
  var Certificates: CertificateList
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: typings.awsDashSdk.clientsElbv2Mod.ListenerArn
}

object AddListenerCertificatesInput {
  @scala.inline
  def apply(Certificates: CertificateList, ListenerArn: ListenerArn): AddListenerCertificatesInput = {
    val __obj = js.Dynamic.literal(Certificates = Certificates, ListenerArn = ListenerArn)
  
    __obj.asInstanceOf[AddListenerCertificatesInput]
  }
}

