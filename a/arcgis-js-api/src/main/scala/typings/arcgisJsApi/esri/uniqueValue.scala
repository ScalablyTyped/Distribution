package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains helper methods for generating a [UniqueValueRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html) for raster layers (i.e.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-uniqueValue.html)
  */
trait uniqueValue extends StObject {
  
  /**
    * Generates a [UniqueValueRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html) to render thematic imagery.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-uniqueValue.html#createRenderer)
    */
  def createRenderer(params: uniqueValueCreateRendererParams): js.Promise[RasterUniqueValuesResult]
}
object uniqueValue {
  
  inline def apply(createRenderer: uniqueValueCreateRendererParams => js.Promise[RasterUniqueValuesResult]): uniqueValue = {
    val __obj = js.Dynamic.literal(createRenderer = js.Any.fromFunction1(createRenderer))
    __obj.asInstanceOf[uniqueValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: uniqueValue] (val x: Self) extends AnyVal {
    
    inline def setCreateRenderer(value: uniqueValueCreateRendererParams => js.Promise[RasterUniqueValuesResult]): Self = StObject.set(x, "createRenderer", js.Any.fromFunction1(value))
  }
}
