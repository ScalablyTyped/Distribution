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
  def apply(): DescribeCertificateAuthorityAuditReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCertificateAuthorityAuditReportResponse]
  }
  @scala.inline
  implicit class DescribeCertificateAuthorityAuditReportResponseOps[Self <: DescribeCertificateAuthorityAuditReportResponse] (val x: Self) extends AnyVal {
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
    def setAuditReportStatus(value: AuditReportStatus): Self = this.set("AuditReportStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuditReportStatus: Self = this.set("AuditReportStatus", js.undefined)
    @scala.inline
    def setCreatedAt(value: TStamp): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    @scala.inline
    def setS3BucketName(value: String): Self = this.set("S3BucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3BucketName: Self = this.set("S3BucketName", js.undefined)
    @scala.inline
    def setS3Key(value: String): Self = this.set("S3Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Key: Self = this.set("S3Key", js.undefined)
  }
  
}

