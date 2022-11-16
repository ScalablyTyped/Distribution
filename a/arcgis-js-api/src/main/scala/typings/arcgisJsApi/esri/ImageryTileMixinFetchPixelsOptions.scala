package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.bilinear
import typings.arcgisJsApi.arcgisJsApiStrings.cubic
import typings.arcgisJsApi.arcgisJsApiStrings.majority
import typings.arcgisJsApi.arcgisJsApiStrings.nearest
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageryTileMixinFetchPixelsOptions extends StObject {
  
  /**
    * Added at version 4.23.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ImageryTileMixin.html#fetchPixels)
    */
  var interpolation: js.UndefOr[nearest | bilinear | cubic | majority] = js.undefined
  
  /**
    * An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ImageryTileMixin.html#fetchPixels)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object ImageryTileMixinFetchPixelsOptions {
  
  inline def apply(): ImageryTileMixinFetchPixelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageryTileMixinFetchPixelsOptions]
  }
  
  extension [Self <: ImageryTileMixinFetchPixelsOptions](x: Self) {
    
    inline def setInterpolation(value: nearest | bilinear | cubic | majority): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
