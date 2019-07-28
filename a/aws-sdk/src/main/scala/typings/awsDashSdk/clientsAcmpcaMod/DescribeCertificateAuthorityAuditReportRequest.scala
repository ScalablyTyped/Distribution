package typings.awsDashSdk.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCertificateAuthorityAuditReportRequest extends js.Object {
  /**
    * The report ID returned by calling the CreateCertificateAuthorityAuditReport action.
    */
  var AuditReportId: typings.awsDashSdk.clientsAcmpcaMod.AuditReportId
  /**
    * The Amazon Resource Name (ARN) of the private CA. This must be of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
    */
  var CertificateAuthorityArn: Arn
}

object DescribeCertificateAuthorityAuditReportRequest {
  @scala.inline
  def apply(AuditReportId: AuditReportId, CertificateAuthorityArn: Arn): DescribeCertificateAuthorityAuditReportRequest = {
    val __obj = js.Dynamic.literal(AuditReportId = AuditReportId, CertificateAuthorityArn = CertificateAuthorityArn)
  
    __obj.asInstanceOf[DescribeCertificateAuthorityAuditReportRequest]
  }
}

