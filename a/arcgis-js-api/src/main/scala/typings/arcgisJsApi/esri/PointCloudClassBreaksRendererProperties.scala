package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`absolute-value`
import typings.arcgisJsApi.arcgisJsApiStrings.`high-four-bit`
import typings.arcgisJsApi.arcgisJsApiStrings.`low-four-bit`
import typings.arcgisJsApi.arcgisJsApiStrings.`modulo-ten`
import typings.arcgisJsApi.arcgisJsApiStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointCloudClassBreaksRendererProperties extends PointCloudRendererProperties {
  
  /**
    * Each element in the array is an object that provides information about a class break associated with the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#colorClassBreakInfos)
    */
  var colorClassBreakInfos: js.UndefOr[js.Array[PointCloudClassBreaksRendererColorClassBreakInfos]] = js.native
  
  /**
    * The name of the field that is used to drive the color visualization for the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#field)
    */
  var field: js.UndefOr[String] = js.native
  
  /**
    * A transform that is applied to the field value before evaluating the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#fieldTransformType)
    */
  var fieldTransformType: js.UndefOr[none | `low-four-bit` | `high-four-bit` | `absolute-value` | `modulo-ten`] = js.native
  
  /**
    * An object providing options for displaying the renderer in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#legendOptions)
    */
  var legendOptions: js.UndefOr[PointCloudClassBreaksRendererLegendOptions] = js.native
}
object PointCloudClassBreaksRendererProperties {
  
  @scala.inline
  def apply(): PointCloudClassBreaksRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointCloudClassBreaksRendererProperties]
  }
  
  @scala.inline
  implicit class PointCloudClassBreaksRendererPropertiesMutableBuilder[Self <: PointCloudClassBreaksRendererProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorClassBreakInfos(value: js.Array[PointCloudClassBreaksRendererColorClassBreakInfos]): Self = StObject.set(x, "colorClassBreakInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorClassBreakInfosUndefined: Self = StObject.set(x, "colorClassBreakInfos", js.undefined)
    
    @scala.inline
    def setColorClassBreakInfosVarargs(value: PointCloudClassBreaksRendererColorClassBreakInfos*): Self = StObject.set(x, "colorClassBreakInfos", js.Array(value :_*))
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldTransformType(value: none | `low-four-bit` | `high-four-bit` | `absolute-value` | `modulo-ten`): Self = StObject.set(x, "fieldTransformType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldTransformTypeUndefined: Self = StObject.set(x, "fieldTransformType", js.undefined)
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setLegendOptions(value: PointCloudClassBreaksRendererLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
  }
}
