package typings
package amchartsLib.dataSetSelectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSetSelector extends js.Object {
  /**
    * Text displayed in the "compare to" combobox (when position is "top" or "bottom"). Select...
    */
  var comboBoxSelectText: java.lang.String
  /**
    * Text displayed near "compare to" list. Compare to:
    */
  var compareText: java.lang.String
  /**
    * The maximum height of the Compare to field in pixels.
    * @default 150
    */
  var listHeight: scala.Double
  /**
    * Possible values: "right", "left", "top", "bottom". "top" and "bottom" positions has a limitation -
    * only one data set can be selected for comparing.
    * @default "left"
    */
  var position: java.lang.String
  /**
    * Text displayed near "Select" dropDown. Select:
    */
  var selectText: java.lang.String
  /**
    * Width of a Data set selector, when position is "left" or "right".
    * @default 180
    */
  var width: scala.Double
}

object DataSetSelector {
  @scala.inline
  def apply(
    comboBoxSelectText: java.lang.String,
    compareText: java.lang.String,
    listHeight: scala.Double,
    position: java.lang.String,
    selectText: java.lang.String,
    width: scala.Double
  ): DataSetSelector = {
    val __obj = js.Dynamic.literal(comboBoxSelectText = comboBoxSelectText, compareText = compareText, listHeight = listHeight, position = position, selectText = selectText, width = width)
  
    __obj.asInstanceOf[DataSetSelector]
  }
}

