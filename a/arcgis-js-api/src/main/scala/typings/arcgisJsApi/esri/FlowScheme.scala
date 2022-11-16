package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`flow-line`
import typings.arcgisJsApi.arcgisJsApiStrings.`wave-front`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowScheme extends StObject {
  
  /**
    * The suggested color of the flow lines if a color visual variable is not desired.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html#FlowScheme)
    */
  var color: Color_
  
  /**
    * The suggested colors to use if a [ColorVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html) is set on the flow renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html#FlowScheme)
    */
  var colors: js.Array[Color_]
  
  /**
    * The suggested [density](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#density) of the stream lines.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html#FlowScheme)
    */
  var density: Double
  
  /**
    * The suggested [flowSpeed](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#flowSpeed) of the stream lines.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html#FlowScheme)
    */
  var flowSpeed: Double
  
  /**
    * The unique id of the color scheme to use in the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html#FlowScheme)
    */
  var id: String
  
  /**
    * The suggested [effect](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#effect) to apply to the input layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html#FlowScheme)
    */
  var layerEffect: String
  
  /**
    * The suggested opacity to apply to large magnitude values if an [OpacityVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html) is set on the flow renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html#FlowScheme)
    */
  var maxOpacity: Double
  
  /**
    * The suggested size to apply to large magnitude values if a [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) is set on the flow renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html#FlowScheme)
    */
  var maxWidth: Double
  
  /**
    * The suggested opacity to apply to small magnitude values if an [OpacityVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html) is set on the flow renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html#FlowScheme)
    */
  var minOpacity: Double
  
  /**
    * The suggested size to apply to small magnitude values if a [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) is set on the flow renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html#FlowScheme)
    */
  var minWidth: Double
  
  /**
    * The unique name of the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html#FlowScheme)
    */
  var name: String
  
  /**
    * Tags associated with the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html#FlowScheme)
    */
  var tags: js.Array[String]
  
  /**
    * Determines how flow lines will render.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html#FlowScheme)
    */
  var theme: `flow-line` | `wave-front`
  
  /**
    * The suggested [cap style](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#trailCap) of the stream lines.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html#FlowScheme)
    */
  var trailCap: Double
  
  /**
    * The suggested [length](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#trailLength) of the stream lines.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html#FlowScheme)
    */
  var trailLength: Double
  
  /**
    * The suggested [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html#trailWidth) of the stream lines.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html#FlowScheme)
    */
  var trailWidth: Double
}
object FlowScheme {
  
  inline def apply(
    color: Color_,
    colors: js.Array[Color_],
    density: Double,
    flowSpeed: Double,
    id: String,
    layerEffect: String,
    maxOpacity: Double,
    maxWidth: Double,
    minOpacity: Double,
    minWidth: Double,
    name: String,
    tags: js.Array[String],
    theme: `flow-line` | `wave-front`,
    trailCap: Double,
    trailLength: Double,
    trailWidth: Double
  ): FlowScheme = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], density = density.asInstanceOf[js.Any], flowSpeed = flowSpeed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], layerEffect = layerEffect.asInstanceOf[js.Any], maxOpacity = maxOpacity.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minOpacity = minOpacity.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], trailCap = trailCap.asInstanceOf[js.Any], trailLength = trailLength.asInstanceOf[js.Any], trailWidth = trailWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowScheme]
  }
  
  extension [Self <: FlowScheme](x: Self) {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColors(value: js.Array[Color_]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: Color_ *): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    inline def setFlowSpeed(value: Double): Self = StObject.set(x, "flowSpeed", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLayerEffect(value: String): Self = StObject.set(x, "layerEffect", value.asInstanceOf[js.Any])
    
    inline def setMaxOpacity(value: Double): Self = StObject.set(x, "maxOpacity", value.asInstanceOf[js.Any])
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMinOpacity(value: Double): Self = StObject.set(x, "minOpacity", value.asInstanceOf[js.Any])
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTheme(value: `flow-line` | `wave-front`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTrailCap(value: Double): Self = StObject.set(x, "trailCap", value.asInstanceOf[js.Any])
    
    inline def setTrailLength(value: Double): Self = StObject.set(x, "trailLength", value.asInstanceOf[js.Any])
    
    inline def setTrailWidth(value: Double): Self = StObject.set(x, "trailWidth", value.asInstanceOf[js.Any])
  }
}
