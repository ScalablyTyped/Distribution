package typings.awsSdk

import typings.awsSdk.acmpcaMod.Arn
import typings.awsSdk.acmpcaMod.AuditReportId
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/acmpca.DescribeCertificateAuthorityAuditReportRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeCertificateAuthor extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The report ID returned by calling the CreateCertificateAuthorityAuditReport action.
    */
  var AuditReportId: typings.awsSdk.acmpcaMod.AuditReportId = js.native
  /**
    * The Amazon Resource Name (ARN) of the private CA. This must be of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
    */
  var CertificateAuthorityArn: Arn = js.native
}

object DescribeCertificateAuthor {
  @scala.inline
  def apply(AuditReportId: AuditReportId, CertificateAuthorityArn: Arn, $waiter: WaiterConfiguration = null): DescribeCertificateAuthor = {
    val __obj = js.Dynamic.literal(AuditReportId = AuditReportId.asInstanceOf[js.Any], CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any])
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCertificateAuthor]
  }
}

