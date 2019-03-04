package typings
package amchartsLib.datasetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSet extends js.Object {
  /**
    * Category field name in your dataProvider.
    */
  var categoryField: java.lang.String
  /**
    * Color of the data set. One of colors from AmStockChart.colors array will be used if not set.
    */
  var color: java.lang.String
  /**
    * Whether this data set is selected for comparing.
    * If you change this property, you should call stockChart.validateData() method
    * in order the changes to be applied.
    */
  var compared: scala.Boolean
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
  var showInCompare: scala.Boolean
  /**
    * Specifies whether this data set should be visible in "select" dropdown.
    * @default true
    */
  var showInSelect: scala.Boolean
  /**
    * Array of StockEvent objects.
    */
  var stockEvents: js.Array[amchartsLib.stockeventMod.default]
  /**
    * DataSet title.
    */
  var title: java.lang.String
}

object DataSet {
  @scala.inline
  def apply(
    categoryField: java.lang.String,
    color: java.lang.String,
    compared: scala.Boolean,
    dataProvider: js.Array[_],
    fieldMappings: js.Array[_],
    showInCompare: scala.Boolean,
    showInSelect: scala.Boolean,
    stockEvents: js.Array[amchartsLib.stockeventMod.default],
    title: java.lang.String
  ): DataSet = {
    val __obj = js.Dynamic.literal(categoryField = categoryField, color = color, compared = compared, dataProvider = dataProvider, fieldMappings = fieldMappings, showInCompare = showInCompare, showInSelect = showInSelect, stockEvents = stockEvents, title = title)
  
    __obj.asInstanceOf[DataSet]
  }
}

