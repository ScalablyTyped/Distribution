package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Repository extends StObject {
  
  /**
    * The date and time, in JavaScript date format, when the repository was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The encryption configuration for the repository. This determines how the contents of your repository are encrypted at rest.
    */
  var encryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
  
  var imageScanningConfiguration: js.UndefOr[ImageScanningConfiguration] = js.undefined
  
  /**
    * The tag mutability setting for the repository.
    */
  var imageTagMutability: js.UndefOr[ImageTagMutability] = js.undefined
  
  /**
    * The Amazon Web Services account ID associated with the registry that contains the repository.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that identifies the repository. The ARN contains the arn:aws:ecr namespace, followed by the region of the repository, Amazon Web Services account ID of the repository owner, repository namespace, and repository name. For example, arn:aws:ecr:region:012345678910:repository/test.
    */
  var repositoryArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the repository.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
  
  /**
    * The URI for the repository. You can use this URI for container image push and pull operations.
    */
  var repositoryUri: js.UndefOr[Url] = js.undefined
}
object Repository {
  
  inline def apply(): Repository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Repository]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Repository] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "encryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigurationUndefined: Self = StObject.set(x, "encryptionConfiguration", js.undefined)
    
    inline def setImageScanningConfiguration(value: ImageScanningConfiguration): Self = StObject.set(x, "imageScanningConfiguration", value.asInstanceOf[js.Any])
    
    inline def setImageScanningConfigurationUndefined: Self = StObject.set(x, "imageScanningConfiguration", js.undefined)
    
    inline def setImageTagMutability(value: ImageTagMutability): Self = StObject.set(x, "imageTagMutability", value.asInstanceOf[js.Any])
    
    inline def setImageTagMutabilityUndefined: Self = StObject.set(x, "imageTagMutability", js.undefined)
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryArn(value: Arn): Self = StObject.set(x, "repositoryArn", value.asInstanceOf[js.Any])
    
    inline def setRepositoryArnUndefined: Self = StObject.set(x, "repositoryArn", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
    
    inline def setRepositoryUri(value: Url): Self = StObject.set(x, "repositoryUri", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUriUndefined: Self = StObject.set(x, "repositoryUri", js.undefined)
  }
}
