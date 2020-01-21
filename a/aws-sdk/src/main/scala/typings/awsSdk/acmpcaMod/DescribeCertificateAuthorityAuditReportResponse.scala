package typings.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCertificateAuthorityAuditReportResponse extends js.Object {
  /**
    * Specifies whether report creation is in progress, has succeeded, or has failed.
    */
  var AuditReportStatus: js.UndefOr[typings.awsSdk.acmpcaMod.AuditReportStatus] = js.native
  /**
    * The date and time at which the report was created.
    */
  var CreatedAt: js.UndefOr[TStamp] = js.native
  /**
    * Name of the S3 bucket that contains the report.
    */
  var S3BucketName: js.UndefOr[String] = js.native
  /**
    * S3 key that uniquely identifies the report file in your S3 bucket.
    */
  var S3Key: js.UndefOr[String] = js.native
}

object DescribeCertificateAuthorityAuditReportResponse {
  @scala.inline
  def apply(
    AuditReportStatus: AuditReportStatus = null,
    CreatedAt: TStamp = null,
    S3BucketName: String = null,
    S3Key: String = null
  ): DescribeCertificateAuthorityAuditReportResponse = {
    val __obj = js.Dynamic.literal()
    if (AuditReportStatus != null) __obj.updateDynamic("AuditReportStatus")(AuditReportStatus.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (S3BucketName != null) __obj.updateDynamic("S3BucketName")(S3BucketName.asInstanceOf[js.Any])
    if (S3Key != null) __obj.updateDynamic("S3Key")(S3Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCertificateAuthorityAuditReportResponse]
  }
}

