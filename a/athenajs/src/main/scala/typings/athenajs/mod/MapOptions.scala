package typings.athenajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapOptions extends StObject {
  
  var buffer: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var height: Double
  
  var src: String
  
  var tileHeight: Double
  
  var tileWidth: Double
  
  var viewportH: js.UndefOr[Double] = js.undefined
  
  var viewportW: js.UndefOr[Double] = js.undefined
  
  var width: Double
}
object MapOptions {
  
  inline def apply(height: Double, src: String, tileHeight: Double, tileWidth: Double, width: Double): MapOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], tileHeight = tileHeight.asInstanceOf[js.Any], tileWidth = tileWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapOptions] (val x: Self) extends AnyVal {
    
    inline def setBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
    
    inline def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
    
    inline def setViewportH(value: Double): Self = StObject.set(x, "viewportH", value.asInstanceOf[js.Any])
    
    inline def setViewportHUndefined: Self = StObject.set(x, "viewportH", js.undefined)
    
    inline def setViewportW(value: Double): Self = StObject.set(x, "viewportW", value.asInstanceOf[js.Any])
    
    inline def setViewportWUndefined: Self = StObject.set(x, "viewportW", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
