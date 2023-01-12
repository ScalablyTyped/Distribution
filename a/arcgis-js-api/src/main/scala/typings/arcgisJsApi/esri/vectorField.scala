package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains helper methods for generating a [VectorFieldRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html) for a `Vector-UV` or `Vector-MagDir` [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) or [ImageryTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-vectorField.html)
  */
trait vectorField extends StObject {
  
  /**
    * Generates a [VectorFieldRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html) to display raster data with vector symbols.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-vectorField.html#createRenderer)
    */
  def createRenderer(params: vectorFieldCreateRendererParams): js.Promise[VectorFieldRendererResult]
}
object vectorField {
  
  inline def apply(createRenderer: vectorFieldCreateRendererParams => js.Promise[VectorFieldRendererResult]): vectorField = {
    val __obj = js.Dynamic.literal(createRenderer = js.Any.fromFunction1(createRenderer))
    __obj.asInstanceOf[vectorField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: vectorField] (val x: Self) extends AnyVal {
    
    inline def setCreateRenderer(value: vectorFieldCreateRendererParams => js.Promise[VectorFieldRendererResult]): Self = StObject.set(x, "createRenderer", js.Any.fromFunction1(value))
  }
}
