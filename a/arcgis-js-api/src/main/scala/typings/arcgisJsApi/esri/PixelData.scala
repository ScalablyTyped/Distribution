package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PixelData
  extends StObject
     with Object {
  
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
  
  inline def apply(
    constructor: js.Function,
    extent: Extent,
    hasOwnProperty: PropertyKey => Boolean,
    pixelBlock: PixelBlock,
    propertyIsEnumerable: PropertyKey => Boolean
  ): PixelData = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), pixelBlock = pixelBlock.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[PixelData]
  }
  
  extension [Self <: PixelData](x: Self) {
    
    inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setPixelBlock(value: PixelBlock): Self = StObject.set(x, "pixelBlock", value.asInstanceOf[js.Any])
  }
}
