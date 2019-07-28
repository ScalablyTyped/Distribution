package typings.awsDashSdk.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCertificateAuthorityAuditReportResponse extends js.Object {
  /**
    * Specifies whether report creation is in progress, has succeeded, or has failed.
    */
  var AuditReportStatus: js.UndefOr[typings.awsDashSdk.clientsAcmpcaMod.AuditReportStatus] = js.undefined
  /**
    * The date and time at which the report was created.
    */
  var CreatedAt: js.UndefOr[TStamp] = js.undefined
  /**
    * Name of the S3 bucket that contains the report.
    */
  var S3BucketName: js.UndefOr[String] = js.undefined
  /**
    * S3 key that uniquely identifies the report file in your S3 bucket.
    */
  var S3Key: js.UndefOr[String] = js.undefined
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
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (S3BucketName != null) __obj.updateDynamic("S3BucketName")(S3BucketName)
    if (S3Key != null) __obj.updateDynamic("S3Key")(S3Key)
    __obj.asInstanceOf[DescribeCertificateAuthorityAuditReportResponse]
  }
}

