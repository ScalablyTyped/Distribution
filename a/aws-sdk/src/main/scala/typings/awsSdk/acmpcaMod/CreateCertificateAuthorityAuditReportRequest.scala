package typings.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCertificateAuthorityAuditReportRequest extends js.Object {
  /**
    * The format in which to create the report. This can be either JSON or CSV.
    */
  var AuditReportResponseFormat: typings.awsSdk.acmpcaMod.AuditReportResponseFormat = js.native
  /**
    * The Amazon Resource Name (ARN) of the CA to be audited. This is of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 .
    */
  var CertificateAuthorityArn: Arn = js.native
  /**
    * The name of the S3 bucket that will contain the audit report.
    */
  var S3BucketName: String = js.native
}

object CreateCertificateAuthorityAuditReportRequest {
  @scala.inline
  def apply(
    AuditReportResponseFormat: AuditReportResponseFormat,
    CertificateAuthorityArn: Arn,
    S3BucketName: String
  ): CreateCertificateAuthorityAuditReportRequest = {
    val __obj = js.Dynamic.literal(AuditReportResponseFormat = AuditReportResponseFormat.asInstanceOf[js.Any], CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any], S3BucketName = S3BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCertificateAuthorityAuditReportRequest]
  }
  @scala.inline
  implicit class CreateCertificateAuthorityAuditReportRequestOps[Self <: CreateCertificateAuthorityAuditReportRequest] (val x: Self) extends AnyVal {
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
    def setAuditReportResponseFormat(value: AuditReportResponseFormat): Self = this.set("AuditReportResponseFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificateAuthorityArn(value: Arn): Self = this.set("CertificateAuthorityArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setS3BucketName(value: String): Self = this.set("S3BucketName", value.asInstanceOf[js.Any])
  }
  
}

