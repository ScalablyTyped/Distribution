package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPremiseConfiguration extends StObject {
  
  /**
    * The GitHub host URL or API endpoint URL. For example, https://on-prem-host-url/api/v3/ 
    */
  var HostUrl: Url
  
  /**
    * The name of the organization of the GitHub Enterprise Server (in-premise) account you want to connect to. You can find your organization name by logging into GitHub desktop and selecting Your organizations under your profile picture dropdown.
    */
  var OrganizationName: typings.awsSdk.clientsKendraMod.OrganizationName
  
  /**
    * The path to the SSL certificate stored in an Amazon S3 bucket. You use this to connect to GitHub if you require a secure SSL connection. You can simply generate a self-signed X509 certificate on any computer using OpenSSL. For an example of using OpenSSL to create an X509 certificate, see Create and sign an X509 certificate.
    */
  var SslCertificateS3Path: S3Path
}
object OnPremiseConfiguration {
  
  inline def apply(HostUrl: Url, OrganizationName: OrganizationName, SslCertificateS3Path: S3Path): OnPremiseConfiguration = {
    val __obj = js.Dynamic.literal(HostUrl = HostUrl.asInstanceOf[js.Any], OrganizationName = OrganizationName.asInstanceOf[js.Any], SslCertificateS3Path = SslCertificateS3Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnPremiseConfiguration]
  }
  
  extension [Self <: OnPremiseConfiguration](x: Self) {
    
    inline def setHostUrl(value: Url): Self = StObject.set(x, "HostUrl", value.asInstanceOf[js.Any])
    
    inline def setOrganizationName(value: OrganizationName): Self = StObject.set(x, "OrganizationName", value.asInstanceOf[js.Any])
    
    inline def setSslCertificateS3Path(value: S3Path): Self = StObject.set(x, "SslCertificateS3Path", value.asInstanceOf[js.Any])
  }
}
