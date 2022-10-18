package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  /**
    * An object containing the image tag and image digest associated with an image.
    */
  var imageId: js.UndefOr[ImageIdentifier] = js.undefined
  
  /**
    * The image manifest associated with the image.
    */
  var imageManifest: js.UndefOr[ImageManifest] = js.undefined
  
  /**
    * The manifest media type of the image.
    */
  var imageManifestMediaType: js.UndefOr[MediaType] = js.undefined
  
  /**
    * The AWS account ID associated with the registry containing the image.
    */
  var registryId: js.UndefOr[RegistryIdOrAlias] = js.undefined
  
  /**
    * The name of the repository associated with the image.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}
object Image {
  
  inline def apply(): Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Image]
  }
  
  extension [Self <: Image](x: Self) {
    
    inline def setImageId(value: ImageIdentifier): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "imageId", js.undefined)
    
    inline def setImageManifest(value: ImageManifest): Self = StObject.set(x, "imageManifest", value.asInstanceOf[js.Any])
    
    inline def setImageManifestMediaType(value: MediaType): Self = StObject.set(x, "imageManifestMediaType", value.asInstanceOf[js.Any])
    
    inline def setImageManifestMediaTypeUndefined: Self = StObject.set(x, "imageManifestMediaType", js.undefined)
    
    inline def setImageManifestUndefined: Self = StObject.set(x, "imageManifest", js.undefined)
    
    inline def setRegistryId(value: RegistryIdOrAlias): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
