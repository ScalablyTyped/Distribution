package typings
package amchartsLib.datasetselectorMod

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

