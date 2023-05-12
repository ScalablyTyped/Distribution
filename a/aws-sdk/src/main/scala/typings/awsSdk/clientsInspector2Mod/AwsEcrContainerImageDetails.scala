package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcrContainerImageDetails extends StObject {
  
  /**
    * The architecture of the Amazon ECR container image.
    */
  var architecture: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The image author of the Amazon ECR container image.
    */
  var author: js.UndefOr[String] = js.undefined
  
  /**
    * The image hash of the Amazon ECR container image.
    */
  var imageHash: ImageHash
  
  /**
    * The image tags attached to the Amazon ECR container image.
    */
  var imageTags: js.UndefOr[ImageTagList] = js.undefined
  
  /**
    * The platform of the Amazon ECR container image.
    */
  var platform: js.UndefOr[Platform] = js.undefined
  
  /**
    * The date and time the Amazon ECR container image was pushed.
    */
  var pushedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The registry for the Amazon ECR container image.
    */
  var registry: NonEmptyString
  
  /**
    * The name of the repository the Amazon ECR container image resides in.
    */
  var repositoryName: NonEmptyString
}
object AwsEcrContainerImageDetails {
  
  inline def apply(imageHash: ImageHash, registry: NonEmptyString, repositoryName: NonEmptyString): AwsEcrContainerImageDetails = {
    val __obj = js.Dynamic.literal(imageHash = imageHash.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsEcrContainerImageDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEcrContainerImageDetails] (val x: Self) extends AnyVal {
    
    inline def setArchitecture(value: NonEmptyString): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setImageHash(value: ImageHash): Self = StObject.set(x, "imageHash", value.asInstanceOf[js.Any])
    
    inline def setImageTags(value: ImageTagList): Self = StObject.set(x, "imageTags", value.asInstanceOf[js.Any])
    
    inline def setImageTagsUndefined: Self = StObject.set(x, "imageTags", js.undefined)
    
    inline def setImageTagsVarargs(value: NonEmptyString*): Self = StObject.set(x, "imageTags", js.Array(value*))
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setPushedAt(value: js.Date): Self = StObject.set(x, "pushedAt", value.asInstanceOf[js.Any])
    
    inline def setPushedAtUndefined: Self = StObject.set(x, "pushedAt", js.undefined)
    
    inline def setRegistry(value: NonEmptyString): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setRepositoryName(value: NonEmptyString): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
