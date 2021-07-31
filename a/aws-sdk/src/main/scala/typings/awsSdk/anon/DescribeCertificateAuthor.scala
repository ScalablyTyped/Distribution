package typings.awsSdk.anon

import typings.awsSdk.acmpcaMod.Arn
import typings.awsSdk.acmpcaMod.AuditReportId
import typings.awsSdk.serviceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/acmpca.DescribeCertificateAuthorityAuditReportRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeCertificateAuthor extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The report ID returned by calling the CreateCertificateAuthorityAuditReport action.
    */
  var AuditReportId: typings.awsSdk.acmpcaMod.AuditReportId
  
  /**
    * The Amazon Resource Name (ARN) of the private CA. This must be of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
    */
  var CertificateAuthorityArn: Arn
}
object DescribeCertificateAuthor {
  
  @scala.inline
  def apply(AuditReportId: AuditReportId, CertificateAuthorityArn: Arn): DescribeCertificateAuthor = {
    val __obj = js.Dynamic.literal(AuditReportId = AuditReportId.asInstanceOf[js.Any], CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCertificateAuthor]
  }
  
  @scala.inline
  implicit class DescribeCertificateAuthorMutableBuilder[Self <: DescribeCertificateAuthor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    @scala.inline
    def setAuditReportId(value: AuditReportId): Self = StObject.set(x, "AuditReportId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateAuthorityArn(value: Arn): Self = StObject.set(x, "CertificateAuthorityArn", value.asInstanceOf[js.Any])
  }
}
