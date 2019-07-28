package typings.awsDashSdk.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCertificateAuthorityAuditReportResponse extends js.Object {
  /**
    * An alphanumeric string that contains a report identifier.
    */
  var AuditReportId: js.UndefOr[typings.awsDashSdk.clientsAcmpcaMod.AuditReportId] = js.undefined
  /**
    * The key that uniquely identifies the report file in your S3 bucket.
    */
  var S3Key: js.UndefOr[String] = js.undefined
}

object CreateCertificateAuthorityAuditReportResponse {
  @scala.inline
  def apply(AuditReportId: AuditReportId = null, S3Key: String = null): CreateCertificateAuthorityAuditReportResponse = {
    val __obj = js.Dynamic.literal()
    if (AuditReportId != null) __obj.updateDynamic("AuditReportId")(AuditReportId)
    if (S3Key != null) __obj.updateDynamic("S3Key")(S3Key)
    __obj.asInstanceOf[CreateCertificateAuthorityAuditReportResponse]
  }
}

