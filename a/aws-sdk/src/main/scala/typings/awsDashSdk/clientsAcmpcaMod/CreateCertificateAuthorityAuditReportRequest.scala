package typings.awsDashSdk.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCertificateAuthorityAuditReportRequest extends js.Object {
  /**
    * The format in which to create the report. This can be either JSON or CSV.
    */
  var AuditReportResponseFormat: typings.awsDashSdk.clientsAcmpcaMod.AuditReportResponseFormat
  /**
    * The Amazon Resource Name (ARN) of the CA to be audited. This is of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 .
    */
  var CertificateAuthorityArn: Arn
  /**
    * The name of the S3 bucket that will contain the audit report.
    */
  var S3BucketName: String
}

object CreateCertificateAuthorityAuditReportRequest {
  @scala.inline
  def apply(
    AuditReportResponseFormat: AuditReportResponseFormat,
    CertificateAuthorityArn: Arn,
    S3BucketName: String
  ): CreateCertificateAuthorityAuditReportRequest = {
    val __obj = js.Dynamic.literal(AuditReportResponseFormat = AuditReportResponseFormat.asInstanceOf[js.Any], CertificateAuthorityArn = CertificateAuthorityArn, S3BucketName = S3BucketName)
  
    __obj.asInstanceOf[CreateCertificateAuthorityAuditReportRequest]
  }
}

