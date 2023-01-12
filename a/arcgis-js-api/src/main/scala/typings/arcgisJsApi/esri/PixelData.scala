package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PixelData extends StObject {
  
  /**
    * The extent of the `pixelBlock`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#PixelData)
    */
  var extent: Extent
  
  /**
    * An object representing the pixels in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#PixelData)
    */
  var pixelBlock: PixelBlock
}
object PixelData {
  
  inline def apply(extent: Extent, pixelBlock: PixelBlock): PixelData = {
    val __obj = js.Dynamic.literal(extent = extent.asInstanceOf[js.Any], pixelBlock = pixelBlock.asInstanceOf[js.Any])
    __obj.asInstanceOf[PixelData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PixelData] (val x: Self) extends AnyVal {
    
    inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setPixelBlock(value: PixelBlock): Self = StObject.set(x, "pixelBlock", value.asInstanceOf[js.Any])
  }
}
