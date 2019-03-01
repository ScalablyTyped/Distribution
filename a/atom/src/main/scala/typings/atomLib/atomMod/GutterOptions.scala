package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GutterOptions extends js.Object {
  /** String added to the CSS classnames of the gutter's root DOM element. */
  var `class`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Function called by a 'line-number' gutter to generate the label for each
    * line number element. Should return a String that will be used to label the
    * corresponding line.
    */
  var labelFn: js.UndefOr[js.Function1[/* lineData */ LineDataExtended, java.lang.String]] = js.undefined
  /** (required) A unique String to identify this gutter. */
  var name: java.lang.String
  /**
    * Function to be called when a mousedown event is received by a line-number
    * element within this type: 'line-number' Gutter. If unspecified, the default
    * behavior is to select the clicked buffer row.
    */
  var onMouseDown: js.UndefOr[js.Function1[/* lineData */ LineData, scala.Unit]] = js.undefined
  /**
    * Function to be called when a mousemove event occurs on a line-number
    * element within within this type: 'line-number' Gutter.
    */
  var onMouseMove: js.UndefOr[js.Function1[/* lineData */ LineData, scala.Unit]] = js.undefined
  /**
    * A Number that determines stacking order between gutters.
    * Lower priority items are forced closer to the edges of the window. (default: -100)
    */
  var priority: js.UndefOr[scala.Double] = js.undefined
  /**
    * String specifying the type of gutter to create.
    * 'decorated' gutters are useful as a destination for decorations created with
    * Gutter::decorateMarker.
    * 'line-number' gutters.
    */
  var `type`: js.UndefOr[atomLib.atomLibStrings.decorated | atomLib.atomLibStrings.`line-number`] = js.undefined
  /**
    * Boolean specifying whether the gutter is visible initially after being created.
    * (default: true)
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object GutterOptions {
  @scala.inline
  def apply(
    name: java.lang.String,
    `class`: java.lang.String = null,
    labelFn: js.Function1[/* lineData */ LineDataExtended, java.lang.String] = null,
    onMouseDown: js.Function1[/* lineData */ LineData, scala.Unit] = null,
    onMouseMove: js.Function1[/* lineData */ LineData, scala.Unit] = null,
    priority: scala.Int | scala.Double = null,
    `type`: atomLib.atomLibStrings.decorated | atomLib.atomLibStrings.`line-number` = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): GutterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (labelFn != null) __obj.updateDynamic("labelFn")(labelFn)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[GutterOptions]
  }
}

