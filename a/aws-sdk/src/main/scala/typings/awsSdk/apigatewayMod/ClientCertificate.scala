package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientCertificate extends js.Object {
  
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
  implicit class ClientCertificateOps[Self <: ClientCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientCertificateId(value: String): Self = this.set("clientCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCertificateId: Self = this.set("clientCertificateId", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: Timestamp): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setExpirationDate(value: Timestamp): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationDate: Self = this.set("expirationDate", js.undefined)
    
    @scala.inline
    def setPemEncodedCertificate(value: String): Self = this.set("pemEncodedCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePemEncodedCertificate: Self = this.set("pemEncodedCertificate", js.undefined)
    
    @scala.inline
    def setTags(value: MapOfStringToString): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
