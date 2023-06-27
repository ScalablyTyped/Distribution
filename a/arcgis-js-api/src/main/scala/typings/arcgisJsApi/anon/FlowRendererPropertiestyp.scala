package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`flow-from`
import typings.arcgisJsApi.arcgisJsApiStrings.`flow-to`
import typings.arcgisJsApi.arcgisJsApiStrings.butt_
import typings.arcgisJsApi.arcgisJsApiStrings.flow
import typings.arcgisJsApi.arcgisJsApiStrings.round_
import typings.arcgisJsApi.esri.AuthoringInfoProperties
import typings.arcgisJsApi.esri.Color_
import typings.arcgisJsApi.esri.FlowRendererLegendOptions
import typings.arcgisJsApi.esri.VisualVariableProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.FlowRendererProperties & {  type :'flow'} */
trait FlowRendererPropertiestyp extends StObject {
  
  /**
  		 * Contains metadata about renderers generated from the [flowRendererCreator.createRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-flow.html#createRenderer) method, including information for setting UI elements such as sliders and themes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#authoringInfo)
  		 */
  var authoringInfo: js.UndefOr[AuthoringInfoProperties] = js.undefined
  
  /**
  		 * The color of the animated streamlines.
  		 *
  		 * @default [255, 255, 255, 1]
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#color)
  		 */
  var color: js.UndefOr[Color_] = js.undefined
  
  /**
  		 * The density of the streamlines.
  		 *
  		 * @default 0.8
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#density)
  		 */
  var density: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Defines the flow direction of the data.
  		 *
  		 * @default "flow-from"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#flowRepresentation)
  		 */
  var flowRepresentation: js.UndefOr[`flow-from` | `flow-to`] = js.undefined
  
  /**
  		 * The speed of the animated streamlines, relative to the simulation time.
  		 *
  		 * @default 10
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#flowSpeed)
  		 */
  var flowSpeed: js.UndefOr[Double] = js.undefined
  
  /**
  		 * An object providing options for displaying the renderer in the Legend.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#legendOptions)
  		 */
  var legendOptions: js.UndefOr[FlowRendererLegendOptions] = js.undefined
  
  /**
  		 * The maximum path length streamlines will travel in points.
  		 *
  		 * @default 200
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#maxPathLength)
  		 */
  var maxPathLength: js.UndefOr[Double | String] = js.undefined
  
  /**
  		 * The front cap of the streamline.
  		 *
  		 * @default "butt"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#trailCap)
  		 */
  var trailCap: js.UndefOr[butt_ | round_] = js.undefined
  
  /**
  		 * The approximate visible length of the streamline in points.
  		 *
  		 * @default 100
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#trailLength)
  		 */
  var trailLength: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The width of the streamline trail in points.
  		 *
  		 * @default 1.5
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#trailWidth)
  		 */
  var trailWidth: js.UndefOr[Double | String] = js.undefined
  
  var `type`: flow
  
  /**
  		 * An array of [VisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html) objects.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#visualVariables)
  		 */
  var visualVariables: js.UndefOr[js.Array[VisualVariableProperties]] = js.undefined
}
object FlowRendererPropertiestyp {
  
  inline def apply(): FlowRendererPropertiestyp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("flow")
    __obj.asInstanceOf[FlowRendererPropertiestyp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlowRendererPropertiestyp] (val x: Self) extends AnyVal {
    
    inline def setAuthoringInfo(value: AuthoringInfoProperties): Self = StObject.set(x, "authoringInfo", value.asInstanceOf[js.Any])
    
    inline def setAuthoringInfoUndefined: Self = StObject.set(x, "authoringInfo", js.undefined)
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    inline def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
    
    inline def setFlowRepresentation(value: `flow-from` | `flow-to`): Self = StObject.set(x, "flowRepresentation", value.asInstanceOf[js.Any])
    
    inline def setFlowRepresentationUndefined: Self = StObject.set(x, "flowRepresentation", js.undefined)
    
    inline def setFlowSpeed(value: Double): Self = StObject.set(x, "flowSpeed", value.asInstanceOf[js.Any])
    
    inline def setFlowSpeedUndefined: Self = StObject.set(x, "flowSpeed", js.undefined)
    
    inline def setLegendOptions(value: FlowRendererLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    inline def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
    
    inline def setMaxPathLength(value: Double | String): Self = StObject.set(x, "maxPathLength", value.asInstanceOf[js.Any])
    
    inline def setMaxPathLengthUndefined: Self = StObject.set(x, "maxPathLength", js.undefined)
    
    inline def setTrailCap(value: butt_ | round_): Self = StObject.set(x, "trailCap", value.asInstanceOf[js.Any])
    
    inline def setTrailCapUndefined: Self = StObject.set(x, "trailCap", js.undefined)
    
    inline def setTrailLength(value: Double): Self = StObject.set(x, "trailLength", value.asInstanceOf[js.Any])
    
    inline def setTrailLengthUndefined: Self = StObject.set(x, "trailLength", js.undefined)
    
    inline def setTrailWidth(value: Double | String): Self = StObject.set(x, "trailWidth", value.asInstanceOf[js.Any])
    
    inline def setTrailWidthUndefined: Self = StObject.set(x, "trailWidth", js.undefined)
    
    inline def setType(value: flow): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVisualVariables(value: js.Array[VisualVariableProperties]): Self = StObject.set(x, "visualVariables", value.asInstanceOf[js.Any])
    
    inline def setVisualVariablesUndefined: Self = StObject.set(x, "visualVariables", js.undefined)
    
    inline def setVisualVariablesVarargs(value: VisualVariableProperties*): Self = StObject.set(x, "visualVariables", js.Array(value*))
  }
}
