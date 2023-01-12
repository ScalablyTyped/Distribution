package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceNowConfiguration extends StObject {
  
  /**
    * The type of authentication used to connect to the ServiceNow instance. If you choose HTTP_BASIC, Amazon Kendra is authenticated using the user name and password provided in the Secrets Manager secret in the SecretArn field. If you choose OAUTH2, Amazon Kendra is authenticated using the credentials of client ID, client secret, user name and password. When you use OAUTH2 authentication, you must generate a token and a client secret using the ServiceNow console. For more information, see Using a ServiceNow data source.
    */
  var AuthenticationType: js.UndefOr[ServiceNowAuthenticationType] = js.undefined
  
  /**
    * The ServiceNow instance that the data source connects to. The host endpoint should look like the following: {instance}.service-now.com. 
    */
  var HostUrl: ServiceNowHostUrl
  
  /**
    * Configuration information for crawling knowledge articles in the ServiceNow site.
    */
  var KnowledgeArticleConfiguration: js.UndefOr[ServiceNowKnowledgeArticleConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Secrets Manager secret that contains the user name and password required to connect to the ServiceNow instance. You can also provide OAuth authentication credentials of user name, password, client ID, and client secret. For more information, see Authentication for a ServiceNow data source.
    */
  var SecretArn: typings.awsSdk.clientsKendraMod.SecretArn
  
  /**
    * Configuration information for crawling service catalogs in the ServiceNow site.
    */
  var ServiceCatalogConfiguration: js.UndefOr[ServiceNowServiceCatalogConfiguration] = js.undefined
  
  /**
    * The identifier of the release that the ServiceNow host is running. If the host is not running the LONDON release, use OTHERS.
    */
  var ServiceNowBuildVersion: ServiceNowBuildVersionType
}
object ServiceNowConfiguration {
  
  inline def apply(
    HostUrl: ServiceNowHostUrl,
    SecretArn: SecretArn,
    ServiceNowBuildVersion: ServiceNowBuildVersionType
  ): ServiceNowConfiguration = {
    val __obj = js.Dynamic.literal(HostUrl = HostUrl.asInstanceOf[js.Any], SecretArn = SecretArn.asInstanceOf[js.Any], ServiceNowBuildVersion = ServiceNowBuildVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceNowConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceNowConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationType(value: ServiceNowAuthenticationType): Self = StObject.set(x, "AuthenticationType", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTypeUndefined: Self = StObject.set(x, "AuthenticationType", js.undefined)
    
    inline def setHostUrl(value: ServiceNowHostUrl): Self = StObject.set(x, "HostUrl", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeArticleConfiguration(value: ServiceNowKnowledgeArticleConfiguration): Self = StObject.set(x, "KnowledgeArticleConfiguration", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeArticleConfigurationUndefined: Self = StObject.set(x, "KnowledgeArticleConfiguration", js.undefined)
    
    inline def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    inline def setServiceCatalogConfiguration(value: ServiceNowServiceCatalogConfiguration): Self = StObject.set(x, "ServiceCatalogConfiguration", value.asInstanceOf[js.Any])
    
    inline def setServiceCatalogConfigurationUndefined: Self = StObject.set(x, "ServiceCatalogConfiguration", js.undefined)
    
    inline def setServiceNowBuildVersion(value: ServiceNowBuildVersionType): Self = StObject.set(x, "ServiceNowBuildVersion", value.asInstanceOf[js.Any])
  }
}
