package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`dot-density`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DotDensityRenderer
  extends StObject
     with Renderer
     with RendererWithVisualVariables
     with typings.arcgisJsApi.esri.renderers.RendererWithVisualVariables {
  
  /**
    * Defines the variable(s) used to visualize density.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#attributes)
    */
  var attributes: js.Array[AttributeColorInfo] = js.native
  
  /**
    * The color used to shade the polygon fill behind the dots.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#backgroundColor)
    */
  var backgroundColor: Color_ = js.native
  
  /**
    * Calculates an updated dot value for the given scale for the cases where a [referenceScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#referenceScale) is provided.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#calculateDotValue)
    */
  def calculateDotValue(scale: Double): Double = js.native
  
  /**
    * Only applicable when two or more [attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#attributes) are specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#dotBlendingEnabled)
    */
  var dotBlendingEnabled: Boolean = js.native
  
  /**
    * Defines the initial dot value used for visualizing density.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#dotValue)
    */
  var dotValue: Double = js.native
  
  /**
    * An object providing options for configuring the renderer in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#legendOptions)
    */
  var legendOptions: DotDensityRendererLegendOptions = js.native
  
  /**
    * The outline of the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#outline)
    */
  var outline: SimpleLineSymbol = js.native
  
  /**
    * When defined, the renderer will recalculate the dot value linearly based on the change in the view's scale using the [calculateDotValue()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#calculateDotValue) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#referenceScale)
    */
  var referenceScale: Double = js.native
  
  /**
    * When set to a consistent value, dot placements will be preserved for the same scale given all parameters are the same in the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#seed)
    */
  var seed: Double = js.native
  
  /**
    * The type of renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#type)
    */
  @JSName("type")
  val type_DotDensityRenderer: `dot-density` = js.native
  
  /**
    * An array of [Size Visual Variable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#visualVariables)
    */
  var visualVariables: js.Array[VisualVariable] = js.native
}
