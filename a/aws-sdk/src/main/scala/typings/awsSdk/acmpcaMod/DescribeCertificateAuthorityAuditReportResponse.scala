package typings.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCertificateAuthorityAuditReportResponse extends StObject {
  
  /**
    * Specifies whether report creation is in progress, has succeeded, or has failed.
    */
  var AuditReportStatus: js.UndefOr[typings.awsSdk.acmpcaMod.AuditReportStatus] = js.undefined
  
  /**
    * The date and time at which the report was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Name of the S3 bucket that contains the report.
    */
  var S3BucketName: js.UndefOr[typings.awsSdk.acmpcaMod.S3BucketName] = js.undefined
  
  /**
    * S3 key that uniquely identifies the report file in your S3 bucket.
    */
  var S3Key: js.UndefOr[typings.awsSdk.acmpcaMod.S3Key] = js.undefined
}
object DescribeCertificateAuthorityAuditReportResponse {
  
  inline def apply(): DescribeCertificateAuthorityAuditReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCertificateAuthorityAuditReportResponse]
  }
  
  extension [Self <: DescribeCertificateAuthorityAuditReportResponse](x: Self) {
    
    inline def setAuditReportStatus(value: AuditReportStatus): Self = StObject.set(x, "AuditReportStatus", value.asInstanceOf[js.Any])
    
    inline def setAuditReportStatusUndefined: Self = StObject.set(x, "AuditReportStatus", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setS3BucketName(value: S3BucketName): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    inline def setS3BucketNameUndefined: Self = StObject.set(x, "S3BucketName", js.undefined)
    
    inline def setS3Key(value: S3Key): Self = StObject.set(x, "S3Key", value.asInstanceOf[js.Any])
    
    inline def setS3KeyUndefined: Self = StObject.set(x, "S3Key", js.undefined)
  }
}
