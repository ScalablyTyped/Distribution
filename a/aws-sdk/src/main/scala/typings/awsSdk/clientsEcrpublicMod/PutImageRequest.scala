package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutImageRequest extends StObject {
  
  /**
    * The image digest of the image manifest corresponding to the image.
    */
  var imageDigest: js.UndefOr[ImageDigest] = js.undefined
  
  /**
    * The image manifest corresponding to the image to be uploaded.
    */
  var imageManifest: ImageManifest
  
  /**
    * The media type of the image manifest. If you push an image manifest that does not contain the mediaType field, you must specify the imageManifestMediaType in the request.
    */
  var imageManifestMediaType: js.UndefOr[MediaType] = js.undefined
  
  /**
    * The tag to associate with the image. This parameter is required for images that use the Docker Image Manifest V2 Schema 2 or Open Container Initiative (OCI) formats.
    */
  var imageTag: js.UndefOr[ImageTag] = js.undefined
  
  /**
    * The AWS account ID associated with the public registry that contains the repository in which to put the image. If you do not specify a registry, the default public registry is assumed.
    */
  var registryId: js.UndefOr[RegistryIdOrAlias] = js.undefined
  
  /**
    * The name of the repository in which to put the image.
    */
  var repositoryName: RepositoryName
}
object PutImageRequest {
  
  inline def apply(imageManifest: ImageManifest, repositoryName: RepositoryName): PutImageRequest = {
    val __obj = js.Dynamic.literal(imageManifest = imageManifest.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutImageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutImageRequest] (val x: Self) extends AnyVal {
    
    inline def setImageDigest(value: ImageDigest): Self = StObject.set(x, "imageDigest", value.asInstanceOf[js.Any])
    
    inline def setImageDigestUndefined: Self = StObject.set(x, "imageDigest", js.undefined)
    
    inline def setImageManifest(value: ImageManifest): Self = StObject.set(x, "imageManifest", value.asInstanceOf[js.Any])
    
    inline def setImageManifestMediaType(value: MediaType): Self = StObject.set(x, "imageManifestMediaType", value.asInstanceOf[js.Any])
    
    inline def setImageManifestMediaTypeUndefined: Self = StObject.set(x, "imageManifestMediaType", js.undefined)
    
    inline def setImageTag(value: ImageTag): Self = StObject.set(x, "imageTag", value.asInstanceOf[js.Any])
    
    inline def setImageTagUndefined: Self = StObject.set(x, "imageTag", js.undefined)
    
    inline def setRegistryId(value: RegistryIdOrAlias): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
