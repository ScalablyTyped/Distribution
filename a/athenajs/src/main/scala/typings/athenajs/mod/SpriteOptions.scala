package typings.athenajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpriteOptions
  extends StObject
     with DrawableOptions {
  
  var animations: js.UndefOr[Animations] = js.undefined
  
  var data: js.UndefOr[JSObject] = js.undefined
  
  var easing: js.UndefOr[String] = js.undefined
  
  var imageId: js.UndefOr[String] = js.undefined
}
object SpriteOptions {
  
  inline def apply(): SpriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpriteOptions]
  }
  
  extension [Self <: SpriteOptions](x: Self) {
    
    inline def setAnimations(value: Animations): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    inline def setAnimationsUndefined: Self = StObject.set(x, "animations", js.undefined)
    
    inline def setData(value: JSObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setImageId(value: String): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "imageId", js.undefined)
  }
}
