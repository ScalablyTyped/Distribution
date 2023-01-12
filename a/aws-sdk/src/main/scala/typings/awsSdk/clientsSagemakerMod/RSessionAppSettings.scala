package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RSessionAppSettings extends StObject {
  
  /**
    * A list of custom SageMaker images that are configured to run as a RSession app.
    */
  var CustomImages: js.UndefOr[typings.awsSdk.clientsSagemakerMod.CustomImages] = js.undefined
  
  var DefaultResourceSpec: js.UndefOr[ResourceSpec] = js.undefined
}
object RSessionAppSettings {
  
  inline def apply(): RSessionAppSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RSessionAppSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RSessionAppSettings] (val x: Self) extends AnyVal {
    
    inline def setCustomImages(value: CustomImages): Self = StObject.set(x, "CustomImages", value.asInstanceOf[js.Any])
    
    inline def setCustomImagesUndefined: Self = StObject.set(x, "CustomImages", js.undefined)
    
    inline def setCustomImagesVarargs(value: CustomImage*): Self = StObject.set(x, "CustomImages", js.Array(value*))
    
    inline def setDefaultResourceSpec(value: ResourceSpec): Self = StObject.set(x, "DefaultResourceSpec", value.asInstanceOf[js.Any])
    
    inline def setDefaultResourceSpecUndefined: Self = StObject.set(x, "DefaultResourceSpec", js.undefined)
  }
}
