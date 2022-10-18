package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the certificate.
    */
  var certificateArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * An object that describes a certificate in detail.
    */
  var certificateDetail: js.UndefOr[Certificate] = js.undefined
  
  /**
    * The name of the certificate.
    */
  var certificateName: js.UndefOr[CertificateName] = js.undefined
  
  /**
    * The domain name of the certificate.
    */
  var domainName: js.UndefOr[DomainName] = js.undefined
  
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Amazon Lightsail Developer Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CertificateSummary {
  
  inline def apply(): CertificateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateSummary]
  }
  
  extension [Self <: CertificateSummary](x: Self) {
    
    inline def setCertificateArn(value: NonEmptyString): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
    
    inline def setCertificateDetail(value: Certificate): Self = StObject.set(x, "certificateDetail", value.asInstanceOf[js.Any])
    
    inline def setCertificateDetailUndefined: Self = StObject.set(x, "certificateDetail", js.undefined)
    
    inline def setCertificateName(value: CertificateName): Self = StObject.set(x, "certificateName", value.asInstanceOf[js.Any])
    
    inline def setCertificateNameUndefined: Self = StObject.set(x, "certificateName", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
