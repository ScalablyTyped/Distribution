package typings.amcharts.dataSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSet extends js.Object {
  /**
    * Category field name in your dataProvider.
    */
  var categoryField: String
  /**
    * Color of the data set. One of colors from AmStockChart.colors array will be used if not set.
    */
  var color: String
  /**
    * Whether this data set is selected for comparing.
    * If you change this property, you should call stockChart.validateData() method
    * in order the changes to be applied.
    */
  var compared: Boolean
  /**
    * Data provider of the data set.
    */
  var dataProvider: js.Array[_]
  /**
    * Array of field mappings. Field mapping is an object with fromField and toField properties.
    * fromField is a name of your value field in dataProvider.
    * toField might be chosen freely, it will be used to set value/open/close/high/low fields for the StockGraph.
    * Example: {fromField:"val1", toField:"value"}.
    */
  var fieldMappings: js.Array[_]
  /**
    * Specifies whether this data set should be visible in "compare to" list.
    * @default true
    */
  var showInCompare: Boolean
  /**
    * Specifies whether this data set should be visible in "select" dropdown.
    * @default true
    */
  var showInSelect: Boolean
  /**
    * Array of StockEvent objects.
    */
  var stockEvents: js.Array[typings.amcharts.stockEventMod.default]
  /**
    * DataSet title.
    */
  var title: String
}

object DataSet {
  @scala.inline
  def apply(
    categoryField: String,
    color: String,
    compared: Boolean,
    dataProvider: js.Array[_],
    fieldMappings: js.Array[_],
    showInCompare: Boolean,
    showInSelect: Boolean,
    stockEvents: js.Array[typings.amcharts.stockEventMod.default],
    title: String
  ): DataSet = {
    val __obj = js.Dynamic.literal(categoryField = categoryField, color = color, compared = compared, dataProvider = dataProvider, fieldMappings = fieldMappings, showInCompare = showInCompare, showInSelect = showInSelect, stockEvents = stockEvents, title = title)
  
    __obj.asInstanceOf[DataSet]
  }
}

