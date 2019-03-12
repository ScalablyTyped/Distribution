package typings
package amchartsLib.dataSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts/DataSet", JSImport.Default)
@js.native
class default () extends DataSet {
  /**
    * Category field name in your dataProvider.
    */
  /* CompleteClass */
  override var categoryField: java.lang.String = js.native
  /**
    * Color of the data set. One of colors from AmStockChart.colors array will be used if not set.
    */
  /* CompleteClass */
  override var color: java.lang.String = js.native
  /**
    * Whether this data set is selected for comparing.
    * If you change this property, you should call stockChart.validateData() method
    * in order the changes to be applied.
    */
  /* CompleteClass */
  override var compared: scala.Boolean = js.native
  /**
    * Data provider of the data set.
    */
  /* CompleteClass */
  override var dataProvider: js.Array[_] = js.native
  /**
    * Array of field mappings. Field mapping is an object with fromField and toField properties.
    * fromField is a name of your value field in dataProvider.
    * toField might be chosen freely, it will be used to set value/open/close/high/low fields for the StockGraph.
    * Example: {fromField:"val1", toField:"value"}.
    */
  /* CompleteClass */
  override var fieldMappings: js.Array[_] = js.native
  /**
    * Specifies whether this data set should be visible in "compare to" list.
    * @default true
    */
  /* CompleteClass */
  override var showInCompare: scala.Boolean = js.native
  /**
    * Specifies whether this data set should be visible in "select" dropdown.
    * @default true
    */
  /* CompleteClass */
  override var showInSelect: scala.Boolean = js.native
  /**
    * Array of StockEvent objects.
    */
  /* CompleteClass */
  override var stockEvents: js.Array[amchartsLib.stockEventMod.default] = js.native
  /**
    * DataSet title.
    */
  /* CompleteClass */
  override var title: java.lang.String = js.native
}

