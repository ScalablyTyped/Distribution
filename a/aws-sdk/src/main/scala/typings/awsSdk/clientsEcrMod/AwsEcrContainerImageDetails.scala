package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcrContainerImageDetails extends StObject {
  
  /**
    * The architecture of the Amazon ECR container image.
    */
  var architecture: js.UndefOr[Arch] = js.undefined
  
  /**
    * The image author of the Amazon ECR container image.
    */
  var author: js.UndefOr[Author] = js.undefined
  
  /**
    * The image hash of the Amazon ECR container image.
    */
  var imageHash: js.UndefOr[ImageDigest] = js.undefined
  
  /**
    * The image tags attached to the Amazon ECR container image.
    */
  var imageTags: js.UndefOr[ImageTagsList] = js.undefined
  
  /**
    * The platform of the Amazon ECR container image.
    */
  var platform: js.UndefOr[Platform] = js.undefined
  
  /**
    * The date and time the Amazon ECR container image was pushed.
    */
  var pushedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The registry the Amazon ECR container image belongs to.
    */
  var registry: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The name of the repository the Amazon ECR container image resides in.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}
object AwsEcrContainerImageDetails {
  
  inline def apply(): AwsEcrContainerImageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcrContainerImageDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEcrContainerImageDetails] (val x: Self) extends AnyVal {
    
    inline def setArchitecture(value: Arch): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    inline def setAuthor(value: Author): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setImageHash(value: ImageDigest): Self = StObject.set(x, "imageHash", value.asInstanceOf[js.Any])
    
    inline def setImageHashUndefined: Self = StObject.set(x, "imageHash", js.undefined)
    
    inline def setImageTags(value: ImageTagsList): Self = StObject.set(x, "imageTags", value.asInstanceOf[js.Any])
    
    inline def setImageTagsUndefined: Self = StObject.set(x, "imageTags", js.undefined)
    
    inline def setImageTagsVarargs(value: ImageTag*): Self = StObject.set(x, "imageTags", js.Array(value*))
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setPushedAt(value: js.Date): Self = StObject.set(x, "pushedAt", value.asInstanceOf[js.Any])
    
    inline def setPushedAtUndefined: Self = StObject.set(x, "pushedAt", js.undefined)
    
    inline def setRegistry(value: RegistryId): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
