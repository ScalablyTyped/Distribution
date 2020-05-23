package typings.angularNotify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container extends js.Object {
  /**
    * The default element that contains each notification. Defaults to document.body.
    */
  var container: js.UndefOr[js.Any] = js.undefined
  /**
    * The default duration (in milliseconds) of each message. A duration of 0 will prevent messages from closing automatically.
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * The maximum number of total notifications that can be visible at one time. Older notifications will be closed when the maximum is reached.
    */
  var maximumOpen: js.UndefOr[Double] = js.undefined
  /**
    * The default position of each message. Currently only center and right are the supported values.
    */
  var position: js.UndefOr[String] = js.undefined
  /**
    * The Y pixel value where messages will be shown.
    */
  var startTop: js.UndefOr[Double] = js.undefined
  /**
    * The default message template.
    */
  var templateUrl: js.UndefOr[String] = js.undefined
  /**
    * The number of pixels that should be reserved between messages vertically.
    */
  var verticalSpacing: js.UndefOr[Double] = js.undefined
}

object Container {
  @scala.inline
  def apply(
    container: js.Any = null,
    duration: js.UndefOr[Double] = js.undefined,
    maximumOpen: js.UndefOr[Double] = js.undefined,
    position: String = null,
    startTop: js.UndefOr[Double] = js.undefined,
    templateUrl: String = null,
    verticalSpacing: js.UndefOr[Double] = js.undefined
  ): Container = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumOpen)) __obj.updateDynamic("maximumOpen")(maximumOpen.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(startTop)) __obj.updateDynamic("startTop")(startTop.get.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalSpacing)) __obj.updateDynamic("verticalSpacing")(verticalSpacing.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
}

