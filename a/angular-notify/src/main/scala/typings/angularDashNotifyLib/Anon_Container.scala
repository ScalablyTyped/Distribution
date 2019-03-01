package typings
package angularDashNotifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Container extends js.Object {
  /**
    * The default element that contains each notification. Defaults to document.body.
    */
  var container: js.UndefOr[js.Any] = js.undefined
  /**
    * The default duration (in milliseconds) of each message. A duration of 0 will prevent messages from closing automatically.
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum number of total notifications that can be visible at one time. Older notifications will be closed when the maximum is reached.
    */
  var maximumOpen: js.UndefOr[scala.Double] = js.undefined
  /**
    * The default position of each message. Currently only center and right are the supported values.
    */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Y pixel value where messages will be shown.
    */
  var startTop: js.UndefOr[scala.Double] = js.undefined
  /**
    * The default message template.
    */
  var templateUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The number of pixels that should be reserved between messages vertically.
    */
  var verticalSpacing: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Container {
  @scala.inline
  def apply(
    container: js.Any = null,
    duration: scala.Int | scala.Double = null,
    maximumOpen: scala.Int | scala.Double = null,
    position: java.lang.String = null,
    startTop: scala.Int | scala.Double = null,
    templateUrl: java.lang.String = null,
    verticalSpacing: scala.Int | scala.Double = null
  ): Anon_Container = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (maximumOpen != null) __obj.updateDynamic("maximumOpen")(maximumOpen.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (startTop != null) __obj.updateDynamic("startTop")(startTop.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl)
    if (verticalSpacing != null) __obj.updateDynamic("verticalSpacing")(verticalSpacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Container]
  }
}

