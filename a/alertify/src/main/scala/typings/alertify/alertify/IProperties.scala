package typings.alertify.alertify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties for alertify.set function
  */
trait IProperties extends js.Object {
  /** Default button for focus */
  var buttonFocus: js.UndefOr[String] = js.undefined
  /** Should buttons be displayed in reverse order */
  var buttonReverse: js.UndefOr[Boolean] = js.undefined
  /** Default value for milliseconds display of log messages */
  var delay: js.UndefOr[Double] = js.undefined
  /** Default values for display of labels */
  var labels: js.UndefOr[ILabels] = js.undefined
}

object IProperties {
  @scala.inline
  def apply(
    buttonFocus: String = null,
    buttonReverse: js.UndefOr[Boolean] = js.undefined,
    delay: Int | Double = null,
    labels: ILabels = null
  ): IProperties = {
    val __obj = js.Dynamic.literal()
    if (buttonFocus != null) __obj.updateDynamic("buttonFocus")(buttonFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonReverse)) __obj.updateDynamic("buttonReverse")(buttonReverse.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProperties]
  }
}

