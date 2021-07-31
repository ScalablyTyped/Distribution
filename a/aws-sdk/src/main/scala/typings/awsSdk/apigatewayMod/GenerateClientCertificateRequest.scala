package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateClientCertificateRequest extends StObject {
  
  /**
    * The description of the ClientCertificate.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with aws:. The tag value can be up to 256 characters.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.undefined
}
object GenerateClientCertificateRequest {
  
  @scala.inline
  def apply(): GenerateClientCertificateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateClientCertificateRequest]
  }
  
  @scala.inline
  implicit class GenerateClientCertificateRequestMutableBuilder[Self <: GenerateClientCertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setTags(value: MapOfStringToString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
