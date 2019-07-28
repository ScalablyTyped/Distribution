package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`dot-density`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DotDensityRenderer
  extends Renderer
     with RendererWithVisualVariables
     with typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.renderersNs.RendererWithVisualVariables {
  /**
    * Defines the variable(s) used to visualize density. This is an array of objects, each of which references a numeric field value or [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression used to drive the density. You must also set a color corresponding to each value.  If you set a single attribute, `POPULATION` and match it with a color `black` and the [dotValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#dotValue) is `100`, then number of black dots rendered for each feature will approximately equal the value of `POPULATION` divided by `100`.  This property is limited to no more than 8 attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#attributes)
    */
  var attributes: js.Array[AttributeColorInfo] = js.native
  /**
    * The color used to shade the polygon fill behind the dots. This can be autocast with a named string; hex string; array of rgb or rgba values; an object with `r`, `g`, `b`, and `a` properties; or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#backgroundColor)
    *
    * @default [0, 0, 0, 0.25] - black, semitransparent
    */
  var backgroundColor: Color = js.native
  /**
    * Only applicable when two or more [attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#attributes) are specified. When `true`, indicates that colors for overlapping dots will blend. For example, in a feature where a high density of blue dots exist on top of a high density of red dots, some of the dots may appear as purple dots if this property is `true`. When `false` only one color will be favored over the others in rendering.
    *
    * Blend enabled | Blend disabled
    * --------------|---------------
    * ![dot-density-blend](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/dot-density-blend.png) | ![dot-density-no-blend](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/dot-density-no-blend.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#dotBlendingEnabled)
    *
    * @default true
    */
  var dotBlendingEnabled: Boolean = js.native
  /**
    * Defines the initial dot value used for visualizing density. If a [referenceScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#referenceScale) is provided, this value indicates the value of each dot at the [view.scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale) matching the value in [referenceScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#referenceScale). If [referenceScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#referenceScale) is set, the dot value will be recalculated depending on the view scale. Note the value of `dotValue` will remain constant even in this scenario. The variable dot value as displayed in the legend is recalculated using [calculateDotValue()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#calculateDotValue). If a [referenceScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#referenceScale) is not provided, the value specified in this property will apply to dots at all scales.
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
    * The outline of the polygon. When not set, this renders using the default [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html). It is good practice to explicitly set this for every DotDensityRenderer. Either remove the outline altogether, or set it to a very thin, transparent style so it doesn't distract from the dot density.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#outline)
    */
  var outline: SimpleLineSymbol = js.native
  /**
    * When defined, the renderer will recalculate the dot value linearly based on the change in the view's scale using the [calculateDotValue()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#calculateDotValue) method. The rendering will maintain the density of points as drawn at the provided scale across various scales. However, the dot value will change as the user zooms in or out from the provided scale value, though the value of [dotValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#dotValue) will remain constant.  When the computed dot value reaches `1`, the dot value is no longer recalculated as the user zooms further in.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#referenceScale)
    */
  var referenceScale: Double = js.native
  /**
    * When set to a consistent value, dot placements will be preserved for the same scale given all parameters are the same in the renderer. By design, dot placement varies for the same feature across scales. If the user desires to see a different set of dot placements for a given scale, the developer may provide an alternate seed value to recalculate the random placement of dots.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#seed)
    *
    * @default 1
    */
  var seed: Double = js.native
  /**
    * The type of renderer. For DotDensityRenderer this value is always `dot-density`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#type)
    */
  @JSName("type")
  val type_DotDensityRenderer: `dot-density` = js.native
  /**
    * An array of [Size Visual Variable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) objects. Only one [ScaleDependentStops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentStops) visual variable should be provided. This visual variable is used to vary the [outline](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#outline) width based on the [view.scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale). See the snippet below for an example of this.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#visualVariables)
    */
  var visualVariables: js.Array[ScaleDependentStops] = js.native
  /**
    * Calculates an updated dot value for the given scale for the cases where a [referenceScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#referenceScale) is provided. This allows the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) to update the dot value as the user zooms in or out in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#calculateDotValue)
    *
    * @param scale The view scale at which to calculate a new dot value.
    *
    */
  def calculateDotValue(scale: Double): Double = js.native
}

@JSGlobal("__esri.DotDensityRenderer")
@js.native
/**
  * DotDensityRenderer allows you to create dot density visualizations for polygon layers. Dot density visualizations randomly draw dots within each polygon to visualize the density of a population or some other variable. Each dot represents a fixed numeric value of an [attribute](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#attributes) or a subset of attributes. Unlike choropleth maps, field values used in dot density visualizations don't need to be normalized because the size of the polygon, together with the number of dots rendered within its boundaries, indicate the spatial density of that value.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html)
  */
class DotDensityRendererCls () extends DotDensityRenderer {
  def this(properties: DotDensityRendererProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

