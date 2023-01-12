package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientCertificate extends StObject {
  
  /**
    * The identifier of the client certificate.
    */
  var clientCertificateId: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp when the client certificate was created.
    */
  var createdDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the client certificate.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp when the client certificate will expire.
    */
  var expirationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The PEM-encoded public key of the client certificate, which can be used to configure certificate authentication in the integration endpoint .
    */
  var pemEncodedCertificate: js.UndefOr[String] = js.undefined
  
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.undefined
}
object ClientCertificate {
  
  inline def apply(): ClientCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientCertificate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientCertificate] (val x: Self) extends AnyVal {
    
    inline def setClientCertificateId(value: String): Self = StObject.set(x, "clientCertificateId", value.asInstanceOf[js.Any])
    
    inline def setClientCertificateIdUndefined: Self = StObject.set(x, "clientCertificateId", js.undefined)
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExpirationDate(value: js.Date): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    inline def setPemEncodedCertificate(value: String): Self = StObject.set(x, "pemEncodedCertificate", value.asInstanceOf[js.Any])
    
    inline def setPemEncodedCertificateUndefined: Self = StObject.set(x, "pemEncodedCertificate", js.undefined)
    
    inline def setTags(value: MapOfStringToString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
