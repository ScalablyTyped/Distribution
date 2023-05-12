package typings.angularCommon.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageLoaderConfig extends StObject {
  
  /**
    * Additional user-provided parameters for use by the ImageLoader.
    */
  var loaderParams: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
    * Image file name to be added to the image request URL.
    */
  var src: String
  
  /**
    * Width of the requested image (to be used when generating srcset).
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ImageLoaderConfig {
  
  inline def apply(src: String): ImageLoaderConfig = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageLoaderConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageLoaderConfig] (val x: Self) extends AnyVal {
    
    inline def setLoaderParams(value: StringDictionary[Any]): Self = StObject.set(x, "loaderParams", value.asInstanceOf[js.Any])
    
    inline def setLoaderParamsUndefined: Self = StObject.set(x, "loaderParams", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
