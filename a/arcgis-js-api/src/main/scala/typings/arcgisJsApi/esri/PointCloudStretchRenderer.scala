package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`absolute-value`
import typings.arcgisJsApi.arcgisJsApiStrings.`high-four-bit`
import typings.arcgisJsApi.arcgisJsApiStrings.`low-four-bit`
import typings.arcgisJsApi.arcgisJsApiStrings.`modulo-ten`
import typings.arcgisJsApi.arcgisJsApiStrings.`point-cloud-stretch`
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointCloudStretchRenderer
  extends StObject
     with PointCloudRenderer
     with typings.arcgisJsApi.esri.pointCloudRenderers.PointCloudRenderer
     with pointCloudRenderersPointCloudRenderer {
  
  /**
  		 * The name of the number field whose values are used to drive the continuous color visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#field)
  		 */
  var field: String = js.native
  
  /**
  		 * A transform that is applied to the field value before evaluating the renderer.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#fieldTransformType)
  		 */
  var fieldTransformType: none_ | `low-four-bit` | `high-four-bit` | `absolute-value` | `modulo-ten` = js.native
  
  /**
  		 * An object providing options for displaying the renderer in the Legend.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#legendOptions)
  		 */
  var legendOptions: PointCloudStretchRendererLegendOptions = js.native
  
  /**
  		 * An array of color value pairs.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#stops)
  		 */
  var stops: js.Array[ColorStop] = js.native
  
  /**
  		 * The type of Renderer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#type)
  		 */
  @JSName("type")
  val type_PointCloudStretchRenderer: `point-cloud-stretch` = js.native
}
