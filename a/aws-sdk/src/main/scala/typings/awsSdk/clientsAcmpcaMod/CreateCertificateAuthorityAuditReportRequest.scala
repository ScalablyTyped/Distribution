package typings.awsSdk.clientsAcmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCertificateAuthorityAuditReportRequest extends StObject {
  
  /**
    * The format in which to create the report. This can be either JSON or CSV.
    */
  var AuditReportResponseFormat: typings.awsSdk.clientsAcmpcaMod.AuditReportResponseFormat
  
  /**
    * The Amazon Resource Name (ARN) of the CA to be audited. This is of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 .
    */
  var CertificateAuthorityArn: Arn
  
  /**
    * The name of the S3 bucket that will contain the audit report.
    */
  var S3BucketName: typings.awsSdk.clientsAcmpcaMod.S3BucketName
}
object CreateCertificateAuthorityAuditReportRequest {
  
  inline def apply(
    AuditReportResponseFormat: AuditReportResponseFormat,
    CertificateAuthorityArn: Arn,
    S3BucketName: S3BucketName
  ): CreateCertificateAuthorityAuditReportRequest = {
    val __obj = js.Dynamic.literal(AuditReportResponseFormat = AuditReportResponseFormat.asInstanceOf[js.Any], CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any], S3BucketName = S3BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCertificateAuthorityAuditReportRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCertificateAuthorityAuditReportRequest] (val x: Self) extends AnyVal {
    
    inline def setAuditReportResponseFormat(value: AuditReportResponseFormat): Self = StObject.set(x, "AuditReportResponseFormat", value.asInstanceOf[js.Any])
    
    inline def setCertificateAuthorityArn(value: Arn): Self = StObject.set(x, "CertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    inline def setS3BucketName(value: S3BucketName): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
  }
}
