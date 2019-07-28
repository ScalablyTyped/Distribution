package typings.amcharts.dataSetSelectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSetSelector extends js.Object {
  /**
    * Text displayed in the "compare to" combobox (when position is "top" or "bottom"). Select...
    */
  var comboBoxSelectText: String
  /**
    * Text displayed near "compare to" list. Compare to:
    */
  var compareText: String
  /**
    * The maximum height of the Compare to field in pixels.
    * @default 150
    */
  var listHeight: Double
  /**
    * Possible values: "right", "left", "top", "bottom". "top" and "bottom" positions has a limitation -
    * only one data set can be selected for comparing.
    * @default "left"
    */
  var position: String
  /**
    * Text displayed near "Select" dropDown. Select:
    */
  var selectText: String
  /**
    * Width of a Data set selector, when position is "left" or "right".
    * @default 180
    */
  var width: Double
}

object DataSetSelector {
  @scala.inline
  def apply(
    comboBoxSelectText: String,
    compareText: String,
    listHeight: Double,
    position: String,
    selectText: String,
    width: Double
  ): DataSetSelector = {
    val __obj = js.Dynamic.literal(comboBoxSelectText = comboBoxSelectText, compareText = compareText, listHeight = listHeight, position = position, selectText = selectText, width = width)
  
    __obj.asInstanceOf[DataSetSelector]
  }
}

