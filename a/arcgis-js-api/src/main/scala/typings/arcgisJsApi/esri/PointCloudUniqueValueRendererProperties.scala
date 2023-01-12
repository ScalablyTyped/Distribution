package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`absolute-value`
import typings.arcgisJsApi.arcgisJsApiStrings.`high-four-bit`
import typings.arcgisJsApi.arcgisJsApiStrings.`low-four-bit`
import typings.arcgisJsApi.arcgisJsApiStrings.`modulo-ten`
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointCloudUniqueValueRendererProperties
  extends StObject
     with PointCloudRendererProperties {
  
  /**
    * Each element in the array is an object that matches a unique value with a specific color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#colorUniqueValueInfos)
    */
  var colorUniqueValueInfos: js.UndefOr[js.Array[PointCloudUniqueValueRendererColorUniqueValueInfos]] = js.undefined
  
  /**
    * The name of the field whose values are used to drive the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#field)
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * A transform that is applied to the field value before evaluating the renderer.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#fieldTransformType)
    */
  var fieldTransformType: js.UndefOr[none_ | `low-four-bit` | `high-four-bit` | `absolute-value` | `modulo-ten`] = js.undefined
  
  /**
    * An object providing options for displaying the renderer in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#legendOptions)
    */
  var legendOptions: js.UndefOr[PointCloudUniqueValueRendererLegendOptions] = js.undefined
}
object PointCloudUniqueValueRendererProperties {
  
  inline def apply(): PointCloudUniqueValueRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointCloudUniqueValueRendererProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointCloudUniqueValueRendererProperties] (val x: Self) extends AnyVal {
    
    inline def setColorUniqueValueInfos(value: js.Array[PointCloudUniqueValueRendererColorUniqueValueInfos]): Self = StObject.set(x, "colorUniqueValueInfos", value.asInstanceOf[js.Any])
    
    inline def setColorUniqueValueInfosUndefined: Self = StObject.set(x, "colorUniqueValueInfos", js.undefined)
    
    inline def setColorUniqueValueInfosVarargs(value: PointCloudUniqueValueRendererColorUniqueValueInfos*): Self = StObject.set(x, "colorUniqueValueInfos", js.Array(value*))
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldTransformType(value: none_ | `low-four-bit` | `high-four-bit` | `absolute-value` | `modulo-ten`): Self = StObject.set(x, "fieldTransformType", value.asInstanceOf[js.Any])
    
    inline def setFieldTransformTypeUndefined: Self = StObject.set(x, "fieldTransformType", js.undefined)
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setLegendOptions(value: PointCloudUniqueValueRendererLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    inline def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
  }
}
