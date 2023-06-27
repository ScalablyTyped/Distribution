package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportedRendererInfo extends StObject {
  
  /**
  		 * The default renderer of the input layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-support-utils.html#SupportedRendererInfo)
  		 */
  var defaultRenderer: ClassBreaksRenderer | RasterColormapRenderer | UniqueValueRenderer | RasterStretchRenderer | VectorFieldRenderer | RasterShadedReliefRenderer | FlowRenderer
  
  /**
  		 * A list of supported renderer types that may be applied to the input layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-support-utils.html#SupportedRendererInfo)
  		 */
  var supportedTypes: js.Array[SupportedRendererType]
}
object SupportedRendererInfo {
  
  inline def apply(
    defaultRenderer: ClassBreaksRenderer | RasterColormapRenderer | UniqueValueRenderer | RasterStretchRenderer | VectorFieldRenderer | RasterShadedReliefRenderer | FlowRenderer,
    supportedTypes: js.Array[SupportedRendererType]
  ): SupportedRendererInfo = {
    val __obj = js.Dynamic.literal(defaultRenderer = defaultRenderer.asInstanceOf[js.Any], supportedTypes = supportedTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedRendererInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SupportedRendererInfo] (val x: Self) extends AnyVal {
    
    inline def setDefaultRenderer(
      value: ClassBreaksRenderer | RasterColormapRenderer | UniqueValueRenderer | RasterStretchRenderer | VectorFieldRenderer | RasterShadedReliefRenderer | FlowRenderer
    ): Self = StObject.set(x, "defaultRenderer", value.asInstanceOf[js.Any])
    
    inline def setSupportedTypes(value: js.Array[SupportedRendererType]): Self = StObject.set(x, "supportedTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedTypesVarargs(value: SupportedRendererType*): Self = StObject.set(x, "supportedTypes", js.Array(value*))
  }
}
