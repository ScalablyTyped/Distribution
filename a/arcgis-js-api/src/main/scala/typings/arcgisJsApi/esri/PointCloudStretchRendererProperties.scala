package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`absolute-value`
import typings.arcgisJsApi.arcgisJsApiStrings.`high-four-bit`
import typings.arcgisJsApi.arcgisJsApiStrings.`low-four-bit`
import typings.arcgisJsApi.arcgisJsApiStrings.`modulo-ten`
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointCloudStretchRendererProperties
  extends StObject
     with PointCloudRendererProperties {
  
  /**
  		 * The name of the number field whose values are used to drive the continuous color visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#field)
  		 */
  var field: js.UndefOr[String] = js.undefined
  
  /**
  		 * A transform that is applied to the field value before evaluating the renderer.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#fieldTransformType)
  		 */
  var fieldTransformType: js.UndefOr[none_ | `low-four-bit` | `high-four-bit` | `absolute-value` | `modulo-ten`] = js.undefined
  
  /**
  		 * An object providing options for displaying the renderer in the Legend.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#legendOptions)
  		 */
  var legendOptions: js.UndefOr[PointCloudStretchRendererLegendOptions] = js.undefined
  
  /**
  		 * An array of color value pairs.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#stops)
  		 */
  var stops: js.UndefOr[js.Array[ColorStopProperties]] = js.undefined
}
object PointCloudStretchRendererProperties {
  
  inline def apply(): PointCloudStretchRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointCloudStretchRendererProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointCloudStretchRendererProperties] (val x: Self) extends AnyVal {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldTransformType(value: none_ | `low-four-bit` | `high-four-bit` | `absolute-value` | `modulo-ten`): Self = StObject.set(x, "fieldTransformType", value.asInstanceOf[js.Any])
    
    inline def setFieldTransformTypeUndefined: Self = StObject.set(x, "fieldTransformType", js.undefined)
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setLegendOptions(value: PointCloudStretchRendererLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    inline def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
    
    inline def setStops(value: js.Array[ColorStopProperties]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    inline def setStopsVarargs(value: ColorStopProperties*): Self = StObject.set(x, "stops", js.Array(value*))
  }
}
