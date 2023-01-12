package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadLayerPartResponse extends StObject {
  
  /**
    * The integer value of the last byte received in the request.
    */
  var lastByteReceived: js.UndefOr[PartSize] = js.undefined
  
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  
  /**
    * The upload ID associated with the request.
    */
  var uploadId: js.UndefOr[UploadId] = js.undefined
}
object UploadLayerPartResponse {
  
  inline def apply(): UploadLayerPartResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadLayerPartResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadLayerPartResponse] (val x: Self) extends AnyVal {
    
    inline def setLastByteReceived(value: PartSize): Self = StObject.set(x, "lastByteReceived", value.asInstanceOf[js.Any])
    
    inline def setLastByteReceivedUndefined: Self = StObject.set(x, "lastByteReceived", js.undefined)
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
    
    inline def setUploadId(value: UploadId): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
    
    inline def setUploadIdUndefined: Self = StObject.set(x, "uploadId", js.undefined)
  }
}
