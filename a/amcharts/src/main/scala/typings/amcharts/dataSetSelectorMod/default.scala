package typings.amcharts.dataSetSelectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts/DataSetSelector", JSImport.Default)
@js.native
class default () extends DataSetSelector {
  /**
    * Text displayed in the "compare to" combobox (when position is "top" or "bottom"). Select...
    */
  /* CompleteClass */
  override var comboBoxSelectText: String = js.native
  /**
    * Text displayed near "compare to" list. Compare to:
    */
  /* CompleteClass */
  override var compareText: String = js.native
  /**
    * The maximum height of the Compare to field in pixels.
    * @default 150
    */
  /* CompleteClass */
  override var listHeight: Double = js.native
  /**
    * Possible values: "right", "left", "top", "bottom". "top" and "bottom" positions has a limitation -
    * only one data set can be selected for comparing.
    * @default "left"
    */
  /* CompleteClass */
  override var position: String = js.native
  /**
    * Text displayed near "Select" dropDown. Select:
    */
  /* CompleteClass */
  override var selectText: String = js.native
  /**
    * Width of a Data set selector, when position is "left" or "right".
    * @default 180
    */
  /* CompleteClass */
  override var width: Double = js.native
}

