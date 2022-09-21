package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`raster-colormap`
import typings.arcgisJsApi.esri.ColormapInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.RasterColormapRendererProperties & {  type :'raster-colormap'} */
trait RasterColormapRendererPro extends StObject {
  
  /**
    * A colormap info array containing mappings for pixel and RGB color values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterColormapRenderer.html#colormapInfos)
    */
  var colormapInfos: js.UndefOr[js.Array[ColormapInfoProperties]] = js.undefined
  
  var `type`: `raster-colormap`
}
object RasterColormapRendererPro {
  
  inline def apply(): RasterColormapRendererPro = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("raster-colormap")
    __obj.asInstanceOf[RasterColormapRendererPro]
  }
  
  extension [Self <: RasterColormapRendererPro](x: Self) {
    
    inline def setColormapInfos(value: js.Array[ColormapInfoProperties]): Self = StObject.set(x, "colormapInfos", value.asInstanceOf[js.Any])
    
    inline def setColormapInfosUndefined: Self = StObject.set(x, "colormapInfos", js.undefined)
    
    inline def setColormapInfosVarargs(value: ColormapInfoProperties*): Self = StObject.set(x, "colormapInfos", js.Array(value*))
    
    inline def setType(value: `raster-colormap`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
