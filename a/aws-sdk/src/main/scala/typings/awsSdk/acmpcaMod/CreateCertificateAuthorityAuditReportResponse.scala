package typings.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCertificateAuthorityAuditReportResponse extends js.Object {
  
  /**
    * An alphanumeric string that contains a report identifier.
    */
  var AuditReportId: js.UndefOr[typings.awsSdk.acmpcaMod.AuditReportId] = js.native
  
  /**
    * The key that uniquely identifies the report file in your S3 bucket.
    */
  var S3Key: js.UndefOr[typings.awsSdk.acmpcaMod.S3Key] = js.native
}
object CreateCertificateAuthorityAuditReportResponse {
  
  @scala.inline
  def apply(): CreateCertificateAuthorityAuditReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCertificateAuthorityAuditReportResponse]
  }
  
  @scala.inline
  implicit class CreateCertificateAuthorityAuditReportResponseOps[Self <: CreateCertificateAuthorityAuditReportResponse] (val x: Self) extends AnyVal {
    
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
    def deleteAuditReportId: Self = this.set("AuditReportId", js.undefined)
    
    @scala.inline
    def setS3Key(value: S3Key): Self = this.set("S3Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Key: Self = this.set("S3Key", js.undefined)
  }
}
