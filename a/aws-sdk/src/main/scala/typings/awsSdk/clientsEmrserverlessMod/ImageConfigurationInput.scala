package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageConfigurationInput extends StObject {
  
  /**
    * The URI of an image in the Amazon ECR registry. This field is required when you create a new application. If you leave this field blank in an update, Amazon EMR will remove the image configuration.
    */
  var imageUri: js.UndefOr[ImageUri] = js.undefined
}
object ImageConfigurationInput {
  
  inline def apply(): ImageConfigurationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageConfigurationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageConfigurationInput] (val x: Self) extends AnyVal {
    
    inline def setImageUri(value: ImageUri): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    inline def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
  }
}
