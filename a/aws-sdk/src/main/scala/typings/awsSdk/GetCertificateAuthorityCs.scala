package typings.awsSdk

import typings.awsSdk.acmpcaMod.Arn
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/acmpca.GetCertificateAuthorityCsrRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait GetCertificateAuthorityCs extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The Amazon Resource Name (ARN) that was returned when you called the CreateCertificateAuthority action. This must be of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
    */
  var CertificateAuthorityArn: Arn = js.native
}

object GetCertificateAuthorityCs {
  @scala.inline
  def apply(CertificateAuthorityArn: Arn, $waiter: WaiterConfiguration = null): GetCertificateAuthorityCs = {
    val __obj = js.Dynamic.literal(CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any])
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCertificateAuthorityCs]
  }
}

