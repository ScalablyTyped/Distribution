package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildingFilterBlock extends Object {
  /**
    * The SQL where clause used to match features to this filter block. Only the features that satisfy the filter expression are displayed in the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). This property is evaluated on the client using the cached attributes and it only supports [standardized SQL](http://doc.arcgis.com/en/arcgis-online/reference/sql-agol.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#BuildingFilterBlock)
    */
  var filterExpression: String
  /**
    * This object contains information about the filter mode of the filter block. This property can generally be omitted, since only `solid` filter blocks are rendered in the JS API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#BuildingFilterBlock)
    */
  var filterMode: js.UndefOr[BuildingFilterBlockFilterMode] = js.undefined
  /**
    * Title of the filter for display in UIs, for example when the filter block is edited in ArcGIS Pro.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#BuildingFilterBlock)
    */
  var title: js.UndefOr[String] = js.undefined
}

object BuildingFilterBlock {
  @scala.inline
  def apply(
    constructor: js.Function,
    filterExpression: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    filterMode: BuildingFilterBlockFilterMode = null,
    title: String = null
  ): BuildingFilterBlock = {
    val __obj = js.Dynamic.literal(constructor = constructor, filterExpression = filterExpression, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (filterMode != null) __obj.updateDynamic("filterMode")(filterMode)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[BuildingFilterBlock]
  }
}

