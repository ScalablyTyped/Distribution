package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainNameConfig extends StObject {
  
  /**
    * The domain name that AppSync provides.
    */
  var appsyncDomainName: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the certificate. This can be an Certificate Manager (ACM) certificate or an Identity and Access Management (IAM) server certificate.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.undefined
  
  /**
    * A description of the DomainName configuration.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The domain name.
    */
  var domainName: js.UndefOr[DomainName] = js.undefined
  
  /**
    * The ID of your Amazon Route 53 hosted zone.
    */
  var hostedZoneId: js.UndefOr[String] = js.undefined
}
object DomainNameConfig {
  
  inline def apply(): DomainNameConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainNameConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DomainNameConfig] (val x: Self) extends AnyVal {
    
    inline def setAppsyncDomainName(value: String): Self = StObject.set(x, "appsyncDomainName", value.asInstanceOf[js.Any])
    
    inline def setAppsyncDomainNameUndefined: Self = StObject.set(x, "appsyncDomainName", js.undefined)
    
    inline def setCertificateArn(value: CertificateArn): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setHostedZoneId(value: String): Self = StObject.set(x, "hostedZoneId", value.asInstanceOf[js.Any])
    
    inline def setHostedZoneIdUndefined: Self = StObject.set(x, "hostedZoneId", js.undefined)
  }
}
