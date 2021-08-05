package typings.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCertificateAuthorityAuditReportRequest extends StObject {
  
  /**
    * The report ID returned by calling the CreateCertificateAuthorityAuditReport action.
    */
  var AuditReportId: typings.awsSdk.acmpcaMod.AuditReportId
  
  /**
    * The Amazon Resource Name (ARN) of the private CA. This must be of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
    */
  var CertificateAuthorityArn: Arn
}
object DescribeCertificateAuthorityAuditReportRequest {
  
  inline def apply(AuditReportId: AuditReportId, CertificateAuthorityArn: Arn): DescribeCertificateAuthorityAuditReportRequest = {
    val __obj = js.Dynamic.literal(AuditReportId = AuditReportId.asInstanceOf[js.Any], CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCertificateAuthorityAuditReportRequest]
  }
  
  extension [Self <: DescribeCertificateAuthorityAuditReportRequest](x: Self) {
    
    inline def setAuditReportId(value: AuditReportId): Self = StObject.set(x, "AuditReportId", value.asInstanceOf[js.Any])
    
    inline def setCertificateAuthorityArn(value: Arn): Self = StObject.set(x, "CertificateAuthorityArn", value.asInstanceOf[js.Any])
  }
}
