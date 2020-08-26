package typings.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCertificateAuthorityAuditReportRequest extends js.Object {
  /**
    * The report ID returned by calling the CreateCertificateAuthorityAuditReport action.
    */
  var AuditReportId: typings.awsSdk.acmpcaMod.AuditReportId = js.native
  /**
    * The Amazon Resource Name (ARN) of the private CA. This must be of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
    */
  var CertificateAuthorityArn: Arn = js.native
}

object DescribeCertificateAuthorityAuditReportRequest {
  @scala.inline
  def apply(AuditReportId: AuditReportId, CertificateAuthorityArn: Arn): DescribeCertificateAuthorityAuditReportRequest = {
    val __obj = js.Dynamic.literal(AuditReportId = AuditReportId.asInstanceOf[js.Any], CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCertificateAuthorityAuditReportRequest]
  }
  @scala.inline
  implicit class DescribeCertificateAuthorityAuditReportRequestOps[Self <: DescribeCertificateAuthorityAuditReportRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuditReportId(value: AuditReportId): Self = this.set("AuditReportId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificateAuthorityArn(value: Arn): Self = this.set("CertificateAuthorityArn", value.asInstanceOf[js.Any])
  }
  
}

