package typings.atom.mod

import typings.atom.atomStrings.`line-number`
import typings.atom.atomStrings.decorated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GutterOptions extends js.Object {
  /** String added to the CSS classnames of the gutter's root DOM element. */
  var `class`: js.UndefOr[String] = js.undefined
  /**
    * Function called by a 'line-number' gutter to generate the label for each
    * line number element. Should return a String that will be used to label the
    * corresponding line.
    */
  var labelFn: js.UndefOr[js.Function1[/* lineData */ LineDataExtended, String]] = js.undefined
  /** (required) A unique String to identify this gutter. */
  var name: String
  /**
    * Function to be called when a mousedown event is received by a line-number
    * element within this type: 'line-number' Gutter. If unspecified, the default
    * behavior is to select the clicked buffer row.
    */
  var onMouseDown: js.UndefOr[js.Function1[/* lineData */ LineData, Unit]] = js.undefined
  /**
    * Function to be called when a mousemove event occurs on a line-number
    * element within within this type: 'line-number' Gutter.
    */
  var onMouseMove: js.UndefOr[js.Function1[/* lineData */ LineData, Unit]] = js.undefined
  /**
    * A Number that determines stacking order between gutters.
    * Lower priority items are forced closer to the edges of the window. (default: -100)
    */
  var priority: js.UndefOr[Double] = js.undefined
  /**
    * String specifying the type of gutter to create.
    * 'decorated' gutters are useful as a destination for decorations created with
    * Gutter::decorateMarker.
    * 'line-number' gutters.
    */
  var `type`: js.UndefOr[decorated | `line-number`] = js.undefined
  /**
    * Boolean specifying whether the gutter is visible initially after being created.
    * (default: true)
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object GutterOptions {
  @scala.inline
  def apply(
    name: String,
    `class`: String = null,
    labelFn: /* lineData */ LineDataExtended => String = null,
    onMouseDown: /* lineData */ LineData => Unit = null,
    onMouseMove: /* lineData */ LineData => Unit = null,
    priority: Int | Double = null,
    `type`: decorated | `line-number` = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): GutterOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (labelFn != null) __obj.updateDynamic("labelFn")(js.Any.fromFunction1(labelFn))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[GutterOptions]
  }
}

