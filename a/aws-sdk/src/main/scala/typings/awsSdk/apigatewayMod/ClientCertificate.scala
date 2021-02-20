package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientCertificate extends StObject {
  
  /**
    * The identifier of the client certificate.
    */
  var clientCertificateId: js.UndefOr[String] = js.native
  
  /**
    * The timestamp when the client certificate was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The description of the client certificate.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The timestamp when the client certificate will expire.
    */
  var expirationDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The PEM-encoded public key of the client certificate, which can be used to configure certificate authentication in the integration endpoint .
    */
  var pemEncodedCertificate: js.UndefOr[String] = js.native
  
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.native
}
object ClientCertificate {
  
  @scala.inline
  def apply(): ClientCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientCertificate]
  }
  
  @scala.inline
  implicit class ClientCertificateMutableBuilder[Self <: ClientCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientCertificateId(value: String): Self = StObject.set(x, "clientCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCertificateIdUndefined: Self = StObject.set(x, "clientCertificateId", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: Timestamp): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExpirationDate(value: Timestamp): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    @scala.inline
    def setPemEncodedCertificate(value: String): Self = StObject.set(x, "pemEncodedCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPemEncodedCertificateUndefined: Self = StObject.set(x, "pemEncodedCertificate", js.undefined)
    
    @scala.inline
    def setTags(value: MapOfStringToString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
