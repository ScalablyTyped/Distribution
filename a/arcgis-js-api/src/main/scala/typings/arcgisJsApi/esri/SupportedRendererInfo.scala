package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportedRendererInfo
  extends StObject
     with Object {
  
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
    constructor: js.Function,
    defaultRenderer: ClassBreaksRenderer | RasterColormapRenderer | UniqueValueRenderer | RasterStretchRenderer | VectorFieldRenderer | RasterShadedReliefRenderer | FlowRenderer,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportedTypes: js.Array[SupportedRendererType]
  ): SupportedRendererInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], defaultRenderer = defaultRenderer.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportedTypes = supportedTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedRendererInfo]
  }
  
  extension [Self <: SupportedRendererInfo](x: Self) {
    
    inline def setDefaultRenderer(
      value: ClassBreaksRenderer | RasterColormapRenderer | UniqueValueRenderer | RasterStretchRenderer | VectorFieldRenderer | RasterShadedReliefRenderer | FlowRenderer
    ): Self = StObject.set(x, "defaultRenderer", value.asInstanceOf[js.Any])
    
    inline def setSupportedTypes(value: js.Array[SupportedRendererType]): Self = StObject.set(x, "supportedTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedTypesVarargs(value: SupportedRendererType*): Self = StObject.set(x, "supportedTypes", js.Array(value*))
  }
}
