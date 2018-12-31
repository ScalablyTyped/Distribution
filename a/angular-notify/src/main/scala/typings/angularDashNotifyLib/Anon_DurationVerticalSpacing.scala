package typings
package angularDashNotifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DurationVerticalSpacing extends js.Object {
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

