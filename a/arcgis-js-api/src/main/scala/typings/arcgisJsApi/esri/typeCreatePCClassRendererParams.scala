package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait typeCreatePCClassRendererParams
  extends StObject
     with Object {
  
  /**
    * The number of points per inch in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#createPCClassRenderer)
    */
  var density: js.UndefOr[Double] = js.undefined
  
  /**
    * The name of the field containing classification data for the given layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#createPCClassRenderer)
    */
  var field: String
  
  /**
    * The layer for which the visualization is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#createPCClassRenderer)
    */
  var layer: PointCloudLayer
  
  /**
    * Allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#createPCClassRenderer)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * The size of each point expressed as a percentage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#createPCClassRenderer)
    */
  var size: js.UndefOr[String] = js.undefined
  
  /**
    * A statistics object generated from the [uniqueValues](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-uniqueValues.html) function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#createPCClassRenderer)
    */
  var statistics: js.UndefOr[UniqueValuesResult] = js.undefined
  
  /**
    * In authoring apps, the user may select a pre-defined type scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#createPCClassRenderer)
    */
  var typeScheme: js.UndefOr[TypeSchemeForPoint] = js.undefined
}
object typeCreatePCClassRendererParams {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    field: String,
    hasOwnProperty: PropertyKey => Boolean,
    layer: PointCloudLayer,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typeCreatePCClassRendererParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[typeCreatePCClassRendererParams]
  }
  
  @scala.inline
  implicit class typeCreatePCClassRendererParamsMutableBuilder[Self <: typeCreatePCClassRendererParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayer(value: PointCloudLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStatistics(value: UniqueValuesResult): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
    
    @scala.inline
    def setTypeScheme(value: TypeSchemeForPoint): Self = StObject.set(x, "typeScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeSchemeUndefined: Self = StObject.set(x, "typeScheme", js.undefined)
  }
}
