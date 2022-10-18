package typings.awsSdk.clientsFinspaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FederationParameters extends StObject {
  
  /**
    * The redirect or sign-in URL that should be entered into the SAML 2.0 compliant identity provider configuration (IdP).
    */
  var applicationCallBackURL: js.UndefOr[url] = js.undefined
  
  /**
    * SAML attribute name and value. The name must always be Email and the value should be set to the attribute definition in which user email is set. For example, name would be Email and value http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress. Please check your SAML 2.0 compliant identity provider (IdP) documentation for details.
    */
  var attributeMap: js.UndefOr[AttributeMap] = js.undefined
  
  /**
    * Name of the identity provider (IdP).
    */
  var federationProviderName: js.UndefOr[FederationProviderName] = js.undefined
  
  /**
    * The Uniform Resource Name (URN). Also referred as Service Provider URN or Audience URI or Service Provider Entity ID.
    */
  var federationURN: js.UndefOr[urn] = js.undefined
  
  /**
    * SAML 2.0 Metadata document from identity provider (IdP).
    */
  var samlMetadataDocument: js.UndefOr[SamlMetadataDocument] = js.undefined
  
  /**
    * Provide the metadata URL from your SAML 2.0 compliant identity provider (IdP).
    */
  var samlMetadataURL: js.UndefOr[url] = js.undefined
}
object FederationParameters {
  
  inline def apply(): FederationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FederationParameters]
  }
  
  extension [Self <: FederationParameters](x: Self) {
    
    inline def setApplicationCallBackURL(value: url): Self = StObject.set(x, "applicationCallBackURL", value.asInstanceOf[js.Any])
    
    inline def setApplicationCallBackURLUndefined: Self = StObject.set(x, "applicationCallBackURL", js.undefined)
    
    inline def setAttributeMap(value: AttributeMap): Self = StObject.set(x, "attributeMap", value.asInstanceOf[js.Any])
    
    inline def setAttributeMapUndefined: Self = StObject.set(x, "attributeMap", js.undefined)
    
    inline def setFederationProviderName(value: FederationProviderName): Self = StObject.set(x, "federationProviderName", value.asInstanceOf[js.Any])
    
    inline def setFederationProviderNameUndefined: Self = StObject.set(x, "federationProviderName", js.undefined)
    
    inline def setFederationURN(value: urn): Self = StObject.set(x, "federationURN", value.asInstanceOf[js.Any])
    
    inline def setFederationURNUndefined: Self = StObject.set(x, "federationURN", js.undefined)
    
    inline def setSamlMetadataDocument(value: SamlMetadataDocument): Self = StObject.set(x, "samlMetadataDocument", value.asInstanceOf[js.Any])
    
    inline def setSamlMetadataDocumentUndefined: Self = StObject.set(x, "samlMetadataDocument", js.undefined)
    
    inline def setSamlMetadataURL(value: url): Self = StObject.set(x, "samlMetadataURL", value.asInstanceOf[js.Any])
    
    inline def setSamlMetadataURLUndefined: Self = StObject.set(x, "samlMetadataURL", js.undefined)
  }
}
