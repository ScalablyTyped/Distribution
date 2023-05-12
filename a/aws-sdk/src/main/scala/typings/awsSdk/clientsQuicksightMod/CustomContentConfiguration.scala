package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomContentConfiguration extends StObject {
  
  /**
    * The content type of the custom content visual. You can use this to have the visual render as an image.
    */
  var ContentType: js.UndefOr[CustomContentType] = js.undefined
  
  /**
    * The input URL that links to the custom content that you want in the custom visual.
    */
  var ContentUrl: js.UndefOr[URLOperationTemplate] = js.undefined
  
  /**
    * The sizing options for the size of the custom content visual. This structure is required when the ContentType of the visual is 'IMAGE'.
    */
  var ImageScaling: js.UndefOr[CustomContentImageScalingConfiguration] = js.undefined
}
object CustomContentConfiguration {
  
  inline def apply(): CustomContentConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomContentConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomContentConfiguration] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: CustomContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setContentUrl(value: URLOperationTemplate): Self = StObject.set(x, "ContentUrl", value.asInstanceOf[js.Any])
    
    inline def setContentUrlUndefined: Self = StObject.set(x, "ContentUrl", js.undefined)
    
    inline def setImageScaling(value: CustomContentImageScalingConfiguration): Self = StObject.set(x, "ImageScaling", value.asInstanceOf[js.Any])
    
    inline def setImageScalingUndefined: Self = StObject.set(x, "ImageScaling", js.undefined)
  }
}
