package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`flow-from`
import typings.arcgisJsApi.arcgisJsApiStrings.`flow-to`
import typings.arcgisJsApi.arcgisJsApiStrings.butt_
import typings.arcgisJsApi.arcgisJsApiStrings.round_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowRenderer
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * Contains metadata about renderers generated from the [flowRendererCreator.createRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-flow.html#createRenderer) method, including information for setting UI elements such as sliders and themes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#authoringInfo)
  		 */
  var authoringInfo: AuthoringInfo = js.native
  
  /**
  		 * The color of the animated streamlines.
  		 *
  		 * @default [255, 255, 255, 1]
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#color)
  		 */
  var color: Color_ = js.native
  
  /**
  		 * The density of the streamlines.
  		 *
  		 * @default 0.8
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#density)
  		 */
  var density: Double = js.native
  
  /**
  		 * Defines the flow direction of the data.
  		 *
  		 * @default "flow-from"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#flowRepresentation)
  		 */
  var flowRepresentation: `flow-from` | `flow-to` = js.native
  
  /**
  		 * The speed of the animated streamlines, relative to the simulation time.
  		 *
  		 * @default 10
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#flowSpeed)
  		 */
  var flowSpeed: Double = js.native
  
  /**
  		 * An object providing options for displaying the renderer in the Legend.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#legendOptions)
  		 */
  var legendOptions: FlowRendererLegendOptions = js.native
  
  /**
  		 * The maximum path length streamlines will travel in points.
  		 *
  		 * @default 200
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#maxPathLength)
  		 */
  var maxPathLength: Double = js.native
  
  /**
  		 * The front cap of the streamline.
  		 *
  		 * @default "butt"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#trailCap)
  		 */
  var trailCap: butt_ | round_ = js.native
  
  /**
  		 * The approximate visible length of the streamline in points.
  		 *
  		 * @default 100
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#trailLength)
  		 */
  var trailLength: Double = js.native
  
  /**
  		 * The width of the streamline trail in points.
  		 *
  		 * @default 1.5
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#trailWidth)
  		 */
  var trailWidth: Double = js.native
  
  /**
  		 * The type of Renderer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#type)
  		 */
  val `type`: typings.arcgisJsApi.arcgisJsApiStrings.flow = js.native
  
  /**
  		 * An array of [VisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html) objects.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#visualVariables)
  		 */
  var visualVariables: js.Array[VisualVariable] = js.native
}
