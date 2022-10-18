package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteLayerUploadResponse extends StObject {
  
  /**
    * The sha256 digest of the image layer.
    */
  var layerDigest: js.UndefOr[LayerDigest] = js.undefined
  
  /**
    * The public registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  
  /**
    * The upload ID associated with the layer.
    */
  var uploadId: js.UndefOr[UploadId] = js.undefined
}
object CompleteLayerUploadResponse {
  
  inline def apply(): CompleteLayerUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompleteLayerUploadResponse]
  }
  
  extension [Self <: CompleteLayerUploadResponse](x: Self) {
    
    inline def setLayerDigest(value: LayerDigest): Self = StObject.set(x, "layerDigest", value.asInstanceOf[js.Any])
    
    inline def setLayerDigestUndefined: Self = StObject.set(x, "layerDigest", js.undefined)
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
    
    inline def setUploadId(value: UploadId): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
    
    inline def setUploadIdUndefined: Self = StObject.set(x, "uploadId", js.undefined)
  }
}
