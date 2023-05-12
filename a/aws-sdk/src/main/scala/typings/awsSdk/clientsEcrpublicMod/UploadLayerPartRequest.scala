package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadLayerPartRequest extends StObject {
  
  /**
    * The base64-encoded layer part payload.
    */
  var layerPartBlob: LayerPartBlob
  
  /**
    * The position of the first byte of the layer part witin the overall image layer.
    */
  var partFirstByte: PartSize
  
  /**
    * The position of the last byte of the layer part within the overall image layer.
    */
  var partLastByte: PartSize
  
  /**
    * The Amazon Web Services account ID, or registry alias, that's associated with the registry that you're uploading layer parts to. If you do not specify a registry, the default public registry is assumed.
    */
  var registryId: js.UndefOr[RegistryIdOrAlias] = js.undefined
  
  /**
    * The name of the repository that you're uploading layer parts to.
    */
  var repositoryName: RepositoryName
  
  /**
    * The upload ID from a previous InitiateLayerUpload operation to associate with the layer part upload.
    */
  var uploadId: UploadId
}
object UploadLayerPartRequest {
  
  inline def apply(
    layerPartBlob: LayerPartBlob,
    partFirstByte: PartSize,
    partLastByte: PartSize,
    repositoryName: RepositoryName,
    uploadId: UploadId
  ): UploadLayerPartRequest = {
    val __obj = js.Dynamic.literal(layerPartBlob = layerPartBlob.asInstanceOf[js.Any], partFirstByte = partFirstByte.asInstanceOf[js.Any], partLastByte = partLastByte.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadLayerPartRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadLayerPartRequest] (val x: Self) extends AnyVal {
    
    inline def setLayerPartBlob(value: LayerPartBlob): Self = StObject.set(x, "layerPartBlob", value.asInstanceOf[js.Any])
    
    inline def setPartFirstByte(value: PartSize): Self = StObject.set(x, "partFirstByte", value.asInstanceOf[js.Any])
    
    inline def setPartLastByte(value: PartSize): Self = StObject.set(x, "partLastByte", value.asInstanceOf[js.Any])
    
    inline def setRegistryId(value: RegistryIdOrAlias): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setUploadId(value: UploadId): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
  }
}
