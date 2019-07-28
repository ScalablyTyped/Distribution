package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait colorCreatePCContinuousRendererParams extends Object {
  /**
    * The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createPCContinuousRenderer)
    *
    * @default gray
    */
  var basemap: js.UndefOr[String | Basemap] = js.undefined
  /**
    * In authoring apps, the user may select a pre-defined color scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createPCContinuousRenderer)
    */
  var colorScheme: js.UndefOr[ColorScheme] = js.undefined
  /**
    * The number of points per inch in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createPCContinuousRenderer)
    *
    * @default 25
    */
  var density: js.UndefOr[Double] = js.undefined
  /**
    * The name of the field whose data will be queried for statistics and used for the basis of the data-driven visualization. The only field names used for this renderer type are `elevation` and `intensity`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createPCContinuousRenderer)
    */
  var field: String
  /**
    * The layer for which the visualization is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createPCContinuousRenderer)
    */
  var layer: PointCloudLayer
  /**
    * The size of each point expressed as a percentage. This value will determine point sizes scaled based on the given `density` of points. When the value is `100%`, the size of each point is set so that it minimizes the number of gaps between neighboring points. Any value above `100%` will allow for points to overlap neighboring points scaled to the given value. Values below `100%` scale point sizes smaller so there appear to be more gaps between points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createPCContinuousRenderer)
    *
    * @default 100%
    */
  var size: js.UndefOr[String] = js.undefined
  /**
    * A statistics object generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html) function. If statistics for the field have already been generated, then pass the stats object here to avoid making a second statistics query to the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createPCContinuousRenderer)
    */
  var statistics: js.UndefOr[SummaryStatisticsResult] = js.undefined
}

object colorCreatePCContinuousRendererParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    field: String,
    hasOwnProperty: PropertyKey => Boolean,
    layer: PointCloudLayer,
    propertyIsEnumerable: PropertyKey => Boolean,
    basemap: String | Basemap = null,
    colorScheme: ColorScheme = null,
    density: Int | Double = null,
    size: String = null,
    statistics: SummaryStatisticsResult = null
  ): colorCreatePCContinuousRendererParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, field = field, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (basemap != null) __obj.updateDynamic("basemap")(basemap.asInstanceOf[js.Any])
    if (colorScheme != null) __obj.updateDynamic("colorScheme")(colorScheme)
    if (density != null) __obj.updateDynamic("density")(density.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (statistics != null) __obj.updateDynamic("statistics")(statistics)
    __obj.asInstanceOf[colorCreatePCContinuousRendererParams]
  }
}

