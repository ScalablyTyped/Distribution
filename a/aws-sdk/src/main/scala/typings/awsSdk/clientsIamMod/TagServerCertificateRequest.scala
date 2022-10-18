package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagServerCertificateRequest extends StObject {
  
  /**
    * The name of the IAM server certificate to which you want to add tags. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var ServerCertificateName: serverCertificateNameType
  
  /**
    * The list of tags that you want to attach to the IAM server certificate. Each tag consists of a key name and an associated value.
    */
  var Tags: tagListType
}
object TagServerCertificateRequest {
  
  inline def apply(ServerCertificateName: serverCertificateNameType, Tags: tagListType): TagServerCertificateRequest = {
    val __obj = js.Dynamic.literal(ServerCertificateName = ServerCertificateName.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagServerCertificateRequest]
  }
  
  extension [Self <: TagServerCertificateRequest](x: Self) {
    
    inline def setServerCertificateName(value: serverCertificateNameType): Self = StObject.set(x, "ServerCertificateName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: tagListType): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
