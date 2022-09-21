package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SAPODataConnectorProfileProperties extends StObject {
  
  /**
    *  The location of the SAPOData resource. 
    */
  var applicationHostUrl: ApplicationHostUrl
  
  /**
    *  The application path to catalog service. 
    */
  var applicationServicePath: ApplicationServicePath
  
  /**
    *  The client number for the client creating the connection. 
    */
  var clientNumber: ClientNumber
  
  /**
    *  The logon language of SAPOData instance. 
    */
  var logonLanguage: js.UndefOr[LogonLanguage] = js.undefined
  
  /**
    *  The SAPOData OAuth properties required for OAuth type authentication. 
    */
  var oAuthProperties: js.UndefOr[OAuthProperties] = js.undefined
  
  /**
    *  The port number of the SAPOData instance. 
    */
  var portNumber: PortNumber
  
  /**
    *  The SAPOData Private Link service name to be used for private data transfers. 
    */
  var privateLinkServiceName: js.UndefOr[PrivateLinkServiceName] = js.undefined
}
object SAPODataConnectorProfileProperties {
  
  inline def apply(
    applicationHostUrl: ApplicationHostUrl,
    applicationServicePath: ApplicationServicePath,
    clientNumber: ClientNumber,
    portNumber: PortNumber
  ): SAPODataConnectorProfileProperties = {
    val __obj = js.Dynamic.literal(applicationHostUrl = applicationHostUrl.asInstanceOf[js.Any], applicationServicePath = applicationServicePath.asInstanceOf[js.Any], clientNumber = clientNumber.asInstanceOf[js.Any], portNumber = portNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAPODataConnectorProfileProperties]
  }
  
  extension [Self <: SAPODataConnectorProfileProperties](x: Self) {
    
    inline def setApplicationHostUrl(value: ApplicationHostUrl): Self = StObject.set(x, "applicationHostUrl", value.asInstanceOf[js.Any])
    
    inline def setApplicationServicePath(value: ApplicationServicePath): Self = StObject.set(x, "applicationServicePath", value.asInstanceOf[js.Any])
    
    inline def setClientNumber(value: ClientNumber): Self = StObject.set(x, "clientNumber", value.asInstanceOf[js.Any])
    
    inline def setLogonLanguage(value: LogonLanguage): Self = StObject.set(x, "logonLanguage", value.asInstanceOf[js.Any])
    
    inline def setLogonLanguageUndefined: Self = StObject.set(x, "logonLanguage", js.undefined)
    
    inline def setOAuthProperties(value: OAuthProperties): Self = StObject.set(x, "oAuthProperties", value.asInstanceOf[js.Any])
    
    inline def setOAuthPropertiesUndefined: Self = StObject.set(x, "oAuthProperties", js.undefined)
    
    inline def setPortNumber(value: PortNumber): Self = StObject.set(x, "portNumber", value.asInstanceOf[js.Any])
    
    inline def setPrivateLinkServiceName(value: PrivateLinkServiceName): Self = StObject.set(x, "privateLinkServiceName", value.asInstanceOf[js.Any])
    
    inline def setPrivateLinkServiceNameUndefined: Self = StObject.set(x, "privateLinkServiceName", js.undefined)
  }
}
