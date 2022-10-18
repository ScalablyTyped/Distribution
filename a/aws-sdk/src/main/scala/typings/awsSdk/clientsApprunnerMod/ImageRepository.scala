package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageRepository extends StObject {
  
  /**
    * Configuration for running the identified image.
    */
  var ImageConfiguration: js.UndefOr[typings.awsSdk.clientsApprunnerMod.ImageConfiguration] = js.undefined
  
  /**
    * The identifier of an image. For an image in Amazon Elastic Container Registry (Amazon ECR), this is an image name. For the image name format, see Pulling an image in the Amazon ECR User Guide.
    */
  var ImageIdentifier: typings.awsSdk.clientsApprunnerMod.ImageIdentifier
  
  /**
    * The type of the image repository. This reflects the repository provider and whether the repository is private or public.
    */
  var ImageRepositoryType: typings.awsSdk.clientsApprunnerMod.ImageRepositoryType
}
object ImageRepository {
  
  inline def apply(ImageIdentifier: ImageIdentifier, ImageRepositoryType: ImageRepositoryType): ImageRepository = {
    val __obj = js.Dynamic.literal(ImageIdentifier = ImageIdentifier.asInstanceOf[js.Any], ImageRepositoryType = ImageRepositoryType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageRepository]
  }
  
  extension [Self <: ImageRepository](x: Self) {
    
    inline def setImageConfiguration(value: ImageConfiguration): Self = StObject.set(x, "ImageConfiguration", value.asInstanceOf[js.Any])
    
    inline def setImageConfigurationUndefined: Self = StObject.set(x, "ImageConfiguration", js.undefined)
    
    inline def setImageIdentifier(value: ImageIdentifier): Self = StObject.set(x, "ImageIdentifier", value.asInstanceOf[js.Any])
    
    inline def setImageRepositoryType(value: ImageRepositoryType): Self = StObject.set(x, "ImageRepositoryType", value.asInstanceOf[js.Any])
  }
}
