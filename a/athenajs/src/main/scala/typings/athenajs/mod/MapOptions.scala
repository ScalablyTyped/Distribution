package typings.athenajs.mod

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapOptions extends StObject {
  
  var buffer: js.UndefOr[ArrayBuffer] = js.undefined
  
  var height: Double
  
  var src: String
  
  var tileHeight: Double
  
  var tileWidth: Double
  
  var viewportH: js.UndefOr[Double] = js.undefined
  
  var viewportW: js.UndefOr[Double] = js.undefined
  
  var width: Double
}
object MapOptions {
  
  @scala.inline
  def apply(height: Double, src: String, tileHeight: Double, tileWidth: Double, width: Double): MapOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], tileHeight = tileHeight.asInstanceOf[js.Any], tileWidth = tileWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
  
  @scala.inline
  implicit class MapOptionsMutableBuilder[Self <: MapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: ArrayBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportH(value: Double): Self = StObject.set(x, "viewportH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportHUndefined: Self = StObject.set(x, "viewportH", js.undefined)
    
    @scala.inline
    def setViewportW(value: Double): Self = StObject.set(x, "viewportW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportWUndefined: Self = StObject.set(x, "viewportW", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
