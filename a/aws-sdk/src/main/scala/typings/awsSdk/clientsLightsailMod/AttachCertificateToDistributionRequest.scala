package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachCertificateToDistributionRequest extends StObject {
  
  /**
    * The name of the certificate to attach to a distribution. Only certificates with a status of ISSUED can be attached to a distribution. Use the GetCertificates action to get a list of certificate names that you can specify.  This is the name of the certificate resource type and is used only to reference the certificate in other API actions. It can be different than the domain name of the certificate. For example, your certificate name might be WordPress-Blog-Certificate and the domain name of the certificate might be example.com. 
    */
  var certificateName: ResourceName
  
  /**
    * The name of the distribution that the certificate will be attached to. Use the GetDistributions action to get a list of distribution names that you can specify.
    */
  var distributionName: ResourceName
}
object AttachCertificateToDistributionRequest {
  
  inline def apply(certificateName: ResourceName, distributionName: ResourceName): AttachCertificateToDistributionRequest = {
    val __obj = js.Dynamic.literal(certificateName = certificateName.asInstanceOf[js.Any], distributionName = distributionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachCertificateToDistributionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachCertificateToDistributionRequest] (val x: Self) extends AnyVal {
    
    inline def setCertificateName(value: ResourceName): Self = StObject.set(x, "certificateName", value.asInstanceOf[js.Any])
    
    inline def setDistributionName(value: ResourceName): Self = StObject.set(x, "distributionName", value.asInstanceOf[js.Any])
  }
}
