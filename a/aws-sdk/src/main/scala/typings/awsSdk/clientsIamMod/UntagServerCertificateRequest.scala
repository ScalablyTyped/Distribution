package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagServerCertificateRequest extends StObject {
  
  /**
    * The name of the IAM server certificate from which you want to remove tags. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var ServerCertificateName: serverCertificateNameType
  
  /**
    * A list of key names as a simple array of strings. The tags with matching keys are removed from the specified IAM server certificate.
    */
  var TagKeys: tagKeyListType
}
object UntagServerCertificateRequest {
  
  inline def apply(ServerCertificateName: serverCertificateNameType, TagKeys: tagKeyListType): UntagServerCertificateRequest = {
    val __obj = js.Dynamic.literal(ServerCertificateName = ServerCertificateName.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagServerCertificateRequest]
  }
  
  extension [Self <: UntagServerCertificateRequest](x: Self) {
    
    inline def setServerCertificateName(value: serverCertificateNameType): Self = StObject.set(x, "ServerCertificateName", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: tagKeyListType): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: tagKeyType*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
