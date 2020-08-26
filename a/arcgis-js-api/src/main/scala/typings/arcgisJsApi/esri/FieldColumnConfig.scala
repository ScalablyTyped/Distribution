package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.asc_
import typings.arcgisJsApi.arcgisJsApiStrings.desc_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldColumnConfig extends FieldConfig {
  /**
    * Controls the sort order of the column. This property will only be honored on one [fieldColumn](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html) in the FeatureTable widget. If direction is specified on more than one [fieldColumn](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html) in the same FeatureTable, it will only be honored on the column with the highest index.
    *
    * Possible Value | Description
    * ---------------|------------
    * asc | Sorts the column in ascending order.
    * desc | Sorts the column in descending order.
    * null | No sort is applied to the column.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#direction)
    */
  var direction: asc_ | desc_ | js.Any = js.native
  /**
    * Set this object to customize the field column's menu content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#menuConfig)
    */
  var menuConfig: ButtonMenuConfig = js.native
  /**
    * Indicates whether the field column can be sorted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#sortable)
    *
    * @default true
    */
  var sortable: Boolean = js.native
  /**
    * Indicates whether the field column is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#visible)
    *
    * @default true
    */
  var visible: Boolean = js.native
}

