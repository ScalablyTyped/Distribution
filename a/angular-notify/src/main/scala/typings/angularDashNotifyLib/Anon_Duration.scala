package typings
package angularDashNotifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  /**
    * Optional. A valid Angular scope object. The scope of the template will be created by calling $new() on this scope.
    */
  @JSName("$scope")
  var $scope: js.UndefOr[angularLib.angularMod.angularNs.IScope] = js.undefined
  /**
    * Optional. A list of custom CSS classes to apply to the message element.
    */
  var classes: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional. Element that contains each notification. Defaults to document.body.
    */
  var container: js.UndefOr[js.Any] = js.undefined
  /**
    * Optional. The duration (in milliseconds) of the message. A duration of 0 will prevent the message from closing automatically.
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Required. The message to show.
    */
  var message: java.lang.String
  /**
    * Optional. A string containing any valid Angular HTML which will be shown instead of the regular message text.
    * The string must contain one root element like all valid Angular HTML templates (so wrap everything in a <span>).
    */
  var messageTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional. Currently center and right are the only acceptable values.
    */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional. A custom template for the UI of the message.
    */
  var templateUrl: js.UndefOr[java.lang.String] = js.undefined
}

