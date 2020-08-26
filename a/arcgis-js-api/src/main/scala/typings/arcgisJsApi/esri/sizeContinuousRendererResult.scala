package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait sizeContinuousRendererResult extends Object {
  /**
    * The ID of the basemap used to determine the optimal fill color of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ContinuousRendererResult)
    */
  var basemapId: String = js.native
  /**
    * Indicates whether the average color of the input view's basemap is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ContinuousRendererResult)
    */
  var basemapTheme: String = js.native
  /**
    * Indicates whether default values are used in the absence of sufficient data and/or statistics from the layer. Default values are typically used when all features have the same field value or no value at all.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ContinuousRendererResult)
    */
  var defaultValuesUsed: Boolean = js.native
  /**
    * The renderer object configured to best match the given basemap and the spread of the data. Set this on a layer's `renderer` property to update its visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ContinuousRendererResult)
    */
  var renderer: ClassBreaksRenderer = js.native
  /**
    * The size scheme used by the visual variables.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ContinuousRendererResult)
    */
  var sizeScheme: SizeScheme = js.native
  /**
    * Basic statistics returned from a query to the service for data from the given field name or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ContinuousRendererResult)
    */
  var statistics: SummaryStatisticsResult = js.native
  /**
    * Size visual variables configured based on the statistics of the data and the given basemap and scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ContinuousRendererResult)
    */
  var visualVariables: js.Array[SizeVariable] = js.native
}

object sizeContinuousRendererResult {
  @scala.inline
  def apply(
    basemapId: String,
    basemapTheme: String,
    constructor: js.Function,
    defaultValuesUsed: Boolean,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    renderer: ClassBreaksRenderer,
    sizeScheme: SizeScheme,
    statistics: SummaryStatisticsResult,
    visualVariables: js.Array[SizeVariable]
  ): sizeContinuousRendererResult = {
    val __obj = js.Dynamic.literal(basemapId = basemapId.asInstanceOf[js.Any], basemapTheme = basemapTheme.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], defaultValuesUsed = defaultValuesUsed.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer.asInstanceOf[js.Any], sizeScheme = sizeScheme.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], visualVariables = visualVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[sizeContinuousRendererResult]
  }
  @scala.inline
  implicit class sizeContinuousRendererResultOps[Self <: sizeContinuousRendererResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBasemapId(value: String): Self = this.set("basemapId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasemapTheme(value: String): Self = this.set("basemapTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValuesUsed(value: Boolean): Self = this.set("defaultValuesUsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderer(value: ClassBreaksRenderer): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizeScheme(value: SizeScheme): Self = this.set("sizeScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatistics(value: SummaryStatisticsResult): Self = this.set("statistics", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisualVariablesVarargs(value: SizeVariable*): Self = this.set("visualVariables", js.Array(value :_*))
    @scala.inline
    def setVisualVariables(value: js.Array[SizeVariable]): Self = this.set("visualVariables", value.asInstanceOf[js.Any])
  }
  
}

