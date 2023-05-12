package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteLayerUploadRequest extends StObject {
  
  /**
    * The sha256 digest of the image layer.
    */
  var layerDigests: LayerDigestList
  
  /**
    * The Amazon Web Services account ID, or registry alias, associated with the registry where layers are uploaded. If you do not specify a registry, the default public registry is assumed.
    */
  var registryId: js.UndefOr[RegistryIdOrAlias] = js.undefined
  
  /**
    * The name of the repository in a public registry to associate with the image layer.
    */
  var repositoryName: RepositoryName
  
  /**
    * The upload ID from a previous InitiateLayerUpload operation to associate with the image layer.
    */
  var uploadId: UploadId
}
object CompleteLayerUploadRequest {
  
  inline def apply(layerDigests: LayerDigestList, repositoryName: RepositoryName, uploadId: UploadId): CompleteLayerUploadRequest = {
    val __obj = js.Dynamic.literal(layerDigests = layerDigests.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteLayerUploadRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompleteLayerUploadRequest] (val x: Self) extends AnyVal {
    
    inline def setLayerDigests(value: LayerDigestList): Self = StObject.set(x, "layerDigests", value.asInstanceOf[js.Any])
    
    inline def setLayerDigestsVarargs(value: LayerDigest*): Self = StObject.set(x, "layerDigests", js.Array(value*))
    
    inline def setRegistryId(value: RegistryIdOrAlias): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setUploadId(value: UploadId): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
  }
}
