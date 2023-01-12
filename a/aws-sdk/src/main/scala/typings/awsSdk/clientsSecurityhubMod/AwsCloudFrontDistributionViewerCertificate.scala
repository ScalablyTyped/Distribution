package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCloudFrontDistributionViewerCertificate extends StObject {
  
  /**
    * The ARN of the ACM certificate. Used if the certificate is stored in ACM. If you provide an ACM certificate ARN, you must also provide MinimumCertificateVersion and SslSupportMethod.
    */
  var AcmCertificateArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the certificate. Note that in CloudFront, this attribute is deprecated.
    */
  var Certificate: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The source of the certificate identified by Certificate. Note that in CloudFront, this attribute is deprecated.
    */
  var CertificateSource: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether the distribution uses the CloudFront domain name. If set to false, then you provide either AcmCertificateArn or IamCertificateId.
    */
  var CloudFrontDefaultCertificate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The identifier of the IAM certificate. Used if the certificate is stored in IAM. If you provide IamCertificateId, then you also must provide MinimumProtocolVersion and SslSupportMethod.
    */
  var IamCertificateId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The security policy that CloudFront uses for HTTPS connections with viewers. If SslSupportMethod is sni-only, then MinimumProtocolVersion must be TLSv1 or higher.
    */
  var MinimumProtocolVersion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The viewers that the distribution accepts HTTPS connections from.
    */
  var SslSupportMethod: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsCloudFrontDistributionViewerCertificate {
  
  inline def apply(): AwsCloudFrontDistributionViewerCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionViewerCertificate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsCloudFrontDistributionViewerCertificate] (val x: Self) extends AnyVal {
    
    inline def setAcmCertificateArn(value: NonEmptyString): Self = StObject.set(x, "AcmCertificateArn", value.asInstanceOf[js.Any])
    
    inline def setAcmCertificateArnUndefined: Self = StObject.set(x, "AcmCertificateArn", js.undefined)
    
    inline def setCertificate(value: NonEmptyString): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateSource(value: NonEmptyString): Self = StObject.set(x, "CertificateSource", value.asInstanceOf[js.Any])
    
    inline def setCertificateSourceUndefined: Self = StObject.set(x, "CertificateSource", js.undefined)
    
    inline def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
    
    inline def setCloudFrontDefaultCertificate(value: Boolean): Self = StObject.set(x, "CloudFrontDefaultCertificate", value.asInstanceOf[js.Any])
    
    inline def setCloudFrontDefaultCertificateUndefined: Self = StObject.set(x, "CloudFrontDefaultCertificate", js.undefined)
    
    inline def setIamCertificateId(value: NonEmptyString): Self = StObject.set(x, "IamCertificateId", value.asInstanceOf[js.Any])
    
    inline def setIamCertificateIdUndefined: Self = StObject.set(x, "IamCertificateId", js.undefined)
    
    inline def setMinimumProtocolVersion(value: NonEmptyString): Self = StObject.set(x, "MinimumProtocolVersion", value.asInstanceOf[js.Any])
    
    inline def setMinimumProtocolVersionUndefined: Self = StObject.set(x, "MinimumProtocolVersion", js.undefined)
    
    inline def setSslSupportMethod(value: NonEmptyString): Self = StObject.set(x, "SslSupportMethod", value.asInstanceOf[js.Any])
    
    inline def setSslSupportMethodUndefined: Self = StObject.set(x, "SslSupportMethod", js.undefined)
  }
}
