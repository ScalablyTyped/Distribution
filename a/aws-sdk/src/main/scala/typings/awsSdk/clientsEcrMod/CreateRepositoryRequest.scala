package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRepositoryRequest extends StObject {
  
  /**
    * The encryption configuration for the repository. This determines how the contents of your repository are encrypted at rest.
    */
  var encryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
  
  /**
    * The image scanning configuration for the repository. This determines whether images are scanned for known vulnerabilities after being pushed to the repository.
    */
  var imageScanningConfiguration: js.UndefOr[ImageScanningConfiguration] = js.undefined
  
  /**
    * The tag mutability setting for the repository. If this parameter is omitted, the default setting of MUTABLE will be used which will allow image tags to be overwritten. If IMMUTABLE is specified, all image tags within the repository will be immutable which will prevent them from being overwritten.
    */
  var imageTagMutability: js.UndefOr[ImageTagMutability] = js.undefined
  
  /**
    * The Amazon Web Services account ID associated with the registry to create the repository. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The name to use for the repository. The repository name may be specified on its own (such as nginx-web-app) or it can be prepended with a namespace to group the repository into a category (such as project-a/nginx-web-app).
    */
  var repositoryName: RepositoryName
  
  /**
    * The metadata that you apply to the repository to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateRepositoryRequest {
  
  inline def apply(repositoryName: RepositoryName): CreateRepositoryRequest = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRepositoryRequest]
  }
  
  extension [Self <: CreateRepositoryRequest](x: Self) {
    
    inline def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "encryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigurationUndefined: Self = StObject.set(x, "encryptionConfiguration", js.undefined)
    
    inline def setImageScanningConfiguration(value: ImageScanningConfiguration): Self = StObject.set(x, "imageScanningConfiguration", value.asInstanceOf[js.Any])
    
    inline def setImageScanningConfigurationUndefined: Self = StObject.set(x, "imageScanningConfiguration", js.undefined)
    
    inline def setImageTagMutability(value: ImageTagMutability): Self = StObject.set(x, "imageTagMutability", value.asInstanceOf[js.Any])
    
    inline def setImageTagMutabilityUndefined: Self = StObject.set(x, "imageTagMutability", js.undefined)
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
