package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`absolute-value`
import typings.arcgisJsApi.arcgisJsApiStrings.`high-four-bit`
import typings.arcgisJsApi.arcgisJsApiStrings.`low-four-bit`
import typings.arcgisJsApi.arcgisJsApiStrings.`modulo-ten`
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointCloudClassBreaksRendererProperties
  extends StObject
     with PointCloudRendererProperties {
  
  /**
    * Each element in the array is an object that provides information about a class break associated with the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#colorClassBreakInfos)
    */
  var colorClassBreakInfos: js.UndefOr[js.Array[PointCloudClassBreaksRendererColorClassBreakInfos]] = js.undefined
  
  /**
    * The name of the field that is used to drive the color visualization for the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#field)
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * A transform that is applied to the field value before evaluating the renderer.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#fieldTransformType)
    */
  var fieldTransformType: js.UndefOr[none_ | `low-four-bit` | `high-four-bit` | `absolute-value` | `modulo-ten`] = js.undefined
  
  /**
    * An object providing options for displaying the renderer in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#legendOptions)
    */
  var legendOptions: js.UndefOr[PointCloudClassBreaksRendererLegendOptions] = js.undefined
}
object PointCloudClassBreaksRendererProperties {
  
  inline def apply(): PointCloudClassBreaksRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointCloudClassBreaksRendererProperties]
  }
  
  extension [Self <: PointCloudClassBreaksRendererProperties](x: Self) {
    
    inline def setColorClassBreakInfos(value: js.Array[PointCloudClassBreaksRendererColorClassBreakInfos]): Self = StObject.set(x, "colorClassBreakInfos", value.asInstanceOf[js.Any])
    
    inline def setColorClassBreakInfosUndefined: Self = StObject.set(x, "colorClassBreakInfos", js.undefined)
    
    inline def setColorClassBreakInfosVarargs(value: PointCloudClassBreaksRendererColorClassBreakInfos*): Self = StObject.set(x, "colorClassBreakInfos", js.Array(value*))
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldTransformType(value: none_ | `low-four-bit` | `high-four-bit` | `absolute-value` | `modulo-ten`): Self = StObject.set(x, "fieldTransformType", value.asInstanceOf[js.Any])
    
    inline def setFieldTransformTypeUndefined: Self = StObject.set(x, "fieldTransformType", js.undefined)
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setLegendOptions(value: PointCloudClassBreaksRendererLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    inline def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
  }
}
