package typings.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCertificateAuthorityAuditReportResponse extends StObject {
  
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
  implicit class CreateCertificateAuthorityAuditReportResponseMutableBuilder[Self <: CreateCertificateAuthorityAuditReportResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuditReportId(value: AuditReportId): Self = StObject.set(x, "AuditReportId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuditReportIdUndefined: Self = StObject.set(x, "AuditReportId", js.undefined)
    
    @scala.inline
    def setS3Key(value: S3Key): Self = StObject.set(x, "S3Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyUndefined: Self = StObject.set(x, "S3Key", js.undefined)
  }
}
