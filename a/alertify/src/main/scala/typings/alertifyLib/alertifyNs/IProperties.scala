package typings
package alertifyLib.alertifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties for alertify.set function
  */
trait IProperties extends js.Object {
  /** Default button for focus */
  var buttonFocus: js.UndefOr[java.lang.String] = js.undefined
  /** Should buttons be displayed in reverse order */
  var buttonReverse: js.UndefOr[scala.Boolean] = js.undefined
  /** Default value for milliseconds display of log messages */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /** Default values for display of labels */
  var labels: js.UndefOr[ILabels] = js.undefined
}

object IProperties {
  @scala.inline
  def apply(
    buttonFocus: java.lang.String = null,
    buttonReverse: js.UndefOr[scala.Boolean] = js.undefined,
    delay: scala.Int | scala.Double = null,
    labels: ILabels = null
  ): IProperties = {
    val __obj = js.Dynamic.literal()
    if (buttonFocus != null) __obj.updateDynamic("buttonFocus")(buttonFocus)
    if (!js.isUndefined(buttonReverse)) __obj.updateDynamic("buttonReverse")(buttonReverse)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels)
    __obj.asInstanceOf[IProperties]
  }
}

