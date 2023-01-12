package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadServerCertificateResponse extends StObject {
  
  /**
    * The meta information of the uploaded server certificate without its certificate body, certificate chain, and private key.
    */
  var ServerCertificateMetadata: js.UndefOr[typings.awsSdk.clientsIamMod.ServerCertificateMetadata] = js.undefined
  
  /**
    * A list of tags that are attached to the new IAM server certificate. The returned list of tags is sorted by tag key. For more information about tagging, see Tagging IAM resources in the IAM User Guide.
    */
  var Tags: js.UndefOr[tagListType] = js.undefined
}
object UploadServerCertificateResponse {
  
  inline def apply(): UploadServerCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadServerCertificateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadServerCertificateResponse] (val x: Self) extends AnyVal {
    
    inline def setServerCertificateMetadata(value: ServerCertificateMetadata): Self = StObject.set(x, "ServerCertificateMetadata", value.asInstanceOf[js.Any])
    
    inline def setServerCertificateMetadataUndefined: Self = StObject.set(x, "ServerCertificateMetadata", js.undefined)
    
    inline def setTags(value: tagListType): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
