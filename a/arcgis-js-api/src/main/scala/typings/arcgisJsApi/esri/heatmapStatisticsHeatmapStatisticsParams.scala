package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait heatmapStatisticsHeatmapStatisticsParams extends Object {
  /**
    * The area of influence for each point as a radius in pixels from the point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-heatmapStatistics.html#heatmapStatistics)
    */
  var blurRadius: js.UndefOr[Double] = js.undefined
  /**
    * A subset of features for which to calculate the statistics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-heatmapStatistics.html#heatmapStatistics)
    */
  var features: js.UndefOr[js.Array[Graphic]] = js.undefined
  /**
    * The name of the numeric field for which the statistics will be generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-heatmapStatistics.html#heatmapStatistics)
    */
  var field: js.UndefOr[String] = js.undefined
  /**
    * The layer from which to generate statistics for the pixel intensity values and a given `field` if provided.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-heatmapStatistics.html#heatmapStatistics)
    */
  var layer: FeatureLayer | CSVLayer | GeoJSONLayer
  /**
    * A [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance used to calculate pixel intensity values based on the features in the current view.
    *
    * [Read more...](global.html)
    */
  var view: MapView
}

object heatmapStatisticsHeatmapStatisticsParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | CSVLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean,
    view: MapView,
    blurRadius: Int | Double = null,
    features: js.Array[Graphic] = null,
    field: String = null
  ): heatmapStatisticsHeatmapStatisticsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), view = view.asInstanceOf[js.Any])
    if (blurRadius != null) __obj.updateDynamic("blurRadius")(blurRadius.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    __obj.asInstanceOf[heatmapStatisticsHeatmapStatisticsParams]
  }
}

