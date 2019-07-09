package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotDensityRendererProperties extends RendererProperties {
  /**
    * Defines the variable(s) used to visualize density. This is an array of objects, each of which references a numeric field value or [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression used to drive the density. You must also set a color corresponding to each value.  If you set a single attribute, `POPULATION` and match it with a color `black` and the [dotValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#dotValue) is `100`, then number of black dots rendered for each feature will approximately equal the value of `POPULATION` divided by `100`.  This property is limited to no more than 8 attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#attributes)
    */
  var attributes: js.UndefOr[js.Array[AttributeColorInfoProperties]] = js.undefined
  /**
    * The color used to shade the polygon fill behind the dots. This can be autocast with a named string; hex string; array of rgb or rgba values; an object with `r`, `g`, `b`, and `a` properties; or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#backgroundColor)
    *
    * @default [0, 0, 0, 0.25] - black, semitransparent
    */
  var backgroundColor: js.UndefOr[Color | js.Array[scala.Double] | java.lang.String] = js.undefined
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
  var dotBlendingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Defines the initial dot value used for visualizing density. If a [referenceScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#referenceScale) is provided, this value indicates the value of each dot at the [view.scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale) matching the value in [referenceScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#referenceScale). If [referenceScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#referenceScale) is set, the dot value will be recalculated depending on the view scale. Note the value of `dotValue` will remain constant even in this scenario. The variable dot value as displayed in the legend is recalculated using [calculateDotValue()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#calculateDotValue). If a [referenceScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#referenceScale) is not provided, the value specified in this property will apply to dots at all scales.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#dotValue)
    */
  var dotValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * An object providing options for configuring the renderer in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#legendOptions)
    */
  var legendOptions: js.UndefOr[DotDensityRendererLegendOptions] = js.undefined
  /**
    * The outline of the polygon. When not set, this renders using the default [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html). It is good practice to explicitly set this for every DotDensityRenderer. Either remove the outline altogether, or set it to a very thin, transparent style so it doesn't distract from the dot density.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#outline)
    */
  var outline: js.UndefOr[SimpleLineSymbolProperties] = js.undefined
  /**
    * When defined, the renderer will recalculate the dot value linearly based on the change in the view's scale using the [calculateDotValue()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#calculateDotValue) method. The rendering will maintain the density of points as drawn at the provided scale across various scales. However, the dot value will change as the user zooms in or out from the provided scale value, though the value of [dotValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#dotValue) will remain constant.  When the computed dot value reaches `1`, the dot value is no longer recalculated as the user zooms further in.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#referenceScale)
    */
  var referenceScale: js.UndefOr[scala.Double] = js.undefined
  /**
    * When set to a consistent value, dot placements will be preserved for the same scale given all parameters are the same in the renderer. By design, dot placement varies for the same feature across scales. If the user desires to see a different set of dot placements for a given scale, the developer may provide an alternate seed value to recalculate the random placement of dots.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#seed)
    *
    * @default 1
    */
  var seed: js.UndefOr[scala.Double] = js.undefined
  /**
    * An array of [Size Visual Variable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) objects. Only one [ScaleDependentStops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentStops) visual variable should be provided. This visual variable is used to vary the [outline](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#outline) width based on the [view.scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale). See the snippet below for an example of this.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#visualVariables)
    */
  var visualVariables: js.UndefOr[js.Array[ScaleDependentStops]] = js.undefined
}

object DotDensityRendererProperties {
  @scala.inline
  def apply(
    attributes: js.Array[AttributeColorInfoProperties] = null,
    authoringInfo: AuthoringInfoProperties = null,
    backgroundColor: Color | js.Array[scala.Double] | java.lang.String = null,
    dotBlendingEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    dotValue: scala.Int | scala.Double = null,
    legendOptions: DotDensityRendererLegendOptions = null,
    outline: SimpleLineSymbolProperties = null,
    referenceScale: scala.Int | scala.Double = null,
    seed: scala.Int | scala.Double = null,
    visualVariables: js.Array[ScaleDependentStops] = null
  ): DotDensityRendererProperties = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (authoringInfo != null) __obj.updateDynamic("authoringInfo")(authoringInfo)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(dotBlendingEnabled)) __obj.updateDynamic("dotBlendingEnabled")(dotBlendingEnabled)
    if (dotValue != null) __obj.updateDynamic("dotValue")(dotValue.asInstanceOf[js.Any])
    if (legendOptions != null) __obj.updateDynamic("legendOptions")(legendOptions)
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (referenceScale != null) __obj.updateDynamic("referenceScale")(referenceScale.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    if (visualVariables != null) __obj.updateDynamic("visualVariables")(visualVariables)
    __obj.asInstanceOf[DotDensityRendererProperties]
  }
}

