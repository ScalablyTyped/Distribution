package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JoinTableDataSource extends Object {
  /**
    * The type of join that will be performed.
    *
    * Possible Value | Description
    * ---------------|------------
    * left-outer-join | Unmatched records in the left table source are preserved and joined with `null` values in the right table source.
    * left-inner-join | Records in the left table source are discarded if they are unmatched with records in the right table source.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#JoinTableDataSource)
    */
  var joinType: String
  /**
    * The field name used for joining or matching records in the left table to records in the right table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#JoinTableDataSource)
    */
  var leftTableKey: String
  /**
    * The left table for joining to the right table source. This can either be a dynamic map layer or a dynamic data layer. The dynamic data layer may contain another join data source used for nested joining.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#JoinTableDataSource)
    */
  var leftTableSource: DynamicMapLayer | DynamicDataLayer
  /**
    * The field name used for joining or matching records in the right table to records in the left table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#JoinTableDataSource)
    */
  var rightTableKey: String
  /**
    * The right table for joining to the left table source. This can either be a dynamic map layer or a dynamic data layer. The dynamic data layer may contain another join data source used for nested joining.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#JoinTableDataSource)
    */
  var rightTableSource: DynamicMapLayer | DynamicDataLayer
  /**
    * This value is always `join-table` and is inferred when other join table properties of this object are set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#JoinTableDataSource)
    */
  var `type`: String
}

object JoinTableDataSource {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    joinType: String,
    leftTableKey: String,
    leftTableSource: DynamicMapLayer | DynamicDataLayer,
    propertyIsEnumerable: PropertyKey => Boolean,
    rightTableKey: String,
    rightTableSource: DynamicMapLayer | DynamicDataLayer,
    `type`: String
  ): JoinTableDataSource = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), joinType = joinType, leftTableKey = leftTableKey, leftTableSource = leftTableSource.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), rightTableKey = rightTableKey, rightTableSource = rightTableSource.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JoinTableDataSource]
  }
}

