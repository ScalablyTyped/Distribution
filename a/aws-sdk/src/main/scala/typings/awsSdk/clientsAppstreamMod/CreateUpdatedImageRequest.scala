package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUpdatedImageRequest extends StObject {
  
  /**
    * Indicates whether to display the status of image update availability before AppStream 2.0 initiates the process of creating a new updated image. If this value is set to true, AppStream 2.0 displays whether image updates are available. If this value is set to false, AppStream 2.0 initiates the process of creating a new updated image without displaying whether image updates are available.
    */
  var dryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the image to update.
    */
  var existingImageName: Name
  
  /**
    * The description to display for the new image.
    */
  var newImageDescription: js.UndefOr[Description] = js.undefined
  
  /**
    * The name to display for the new image.
    */
  var newImageDisplayName: js.UndefOr[DisplayName] = js.undefined
  
  /**
    * The name of the new image. The name must be unique within the AWS account and Region.
    */
  var newImageName: Name
  
  /**
    * The tags to associate with the new image. A tag is a key-value pair, and the value is optional. For example, Environment=Test. If you do not specify a value, Environment=.  Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following special characters:  _ . : / = + \ - @ If you do not specify a value, the value is set to an empty string. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Administration Guide.
    */
  var newImageTags: js.UndefOr[Tags] = js.undefined
}
object CreateUpdatedImageRequest {
  
  inline def apply(existingImageName: Name, newImageName: Name): CreateUpdatedImageRequest = {
    val __obj = js.Dynamic.literal(existingImageName = existingImageName.asInstanceOf[js.Any], newImageName = newImageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUpdatedImageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateUpdatedImageRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    inline def setExistingImageName(value: Name): Self = StObject.set(x, "existingImageName", value.asInstanceOf[js.Any])
    
    inline def setNewImageDescription(value: Description): Self = StObject.set(x, "newImageDescription", value.asInstanceOf[js.Any])
    
    inline def setNewImageDescriptionUndefined: Self = StObject.set(x, "newImageDescription", js.undefined)
    
    inline def setNewImageDisplayName(value: DisplayName): Self = StObject.set(x, "newImageDisplayName", value.asInstanceOf[js.Any])
    
    inline def setNewImageDisplayNameUndefined: Self = StObject.set(x, "newImageDisplayName", js.undefined)
    
    inline def setNewImageName(value: Name): Self = StObject.set(x, "newImageName", value.asInstanceOf[js.Any])
    
    inline def setNewImageTags(value: Tags): Self = StObject.set(x, "newImageTags", value.asInstanceOf[js.Any])
    
    inline def setNewImageTagsUndefined: Self = StObject.set(x, "newImageTags", js.undefined)
  }
}
