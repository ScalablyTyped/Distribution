package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PCContinuousRendererResult
  extends stdLib.Object {
  /**
    * The ID of the basemap used to determine the optimal color scheme for the output renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#PCContinuousRendererResult)
    */
  var basemapId: java.lang.String
  /**
    * The color scheme used by the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#PCContinuousRendererResult)
    */
  var colorScheme: ColorScheme
  /**
    * Indicates whether default values are used in the absence of sufficient data and/or statistics from the layer. Default values are typically used when all features have the same field value or no value at all.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#PCContinuousRendererResult)
    */
  var defaultValuesUsed: scala.Boolean
  /**
    * The renderer object configured to best match the given basemap and the spread of the data. Set this object on the input layer's `renderer` property to update its visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#PCContinuousRendererResult)
    */
  var renderer: PointCloudStretchRenderer
  /**
    * Basic statistics returned from a query to the service for data from the given field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#PCContinuousRendererResult)
    */
  var statistics: SummaryStatisticsResult
}

object PCContinuousRendererResult {
  @scala.inline
  def apply(
    basemapId: java.lang.String,
    colorScheme: ColorScheme,
    constructor: js.Function,
    defaultValuesUsed: scala.Boolean,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    renderer: PointCloudStretchRenderer,
    statistics: SummaryStatisticsResult
  ): PCContinuousRendererResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("basemapId")(basemapId)
    __obj.updateDynamic("colorScheme")(colorScheme)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("defaultValuesUsed")(defaultValuesUsed)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("renderer")(renderer)
    __obj.updateDynamic("statistics")(statistics)
    __obj.asInstanceOf[PCContinuousRendererResult]
  }
}

