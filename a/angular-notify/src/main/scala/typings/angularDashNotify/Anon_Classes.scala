package typings.angularDashNotify

import typings.angular.angularMod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Classes extends js.Object {
  /**
    * Optional. A valid Angular scope object. The scope of the template will be created by calling $new() on this scope.
    */
  @JSName("$scope")
  var $scope: js.UndefOr[IScope] = js.native
  /**
    * Optional. A list of custom CSS classes to apply to the message element.
    */
  var classes: js.UndefOr[String] = js.native
  /**
    * Optional. Element that contains each notification. Defaults to document.body.
    */
  var container: js.UndefOr[js.Any] = js.native
  /**
    * Optional. The duration (in milliseconds) of the message. A duration of 0 will prevent the message from closing automatically.
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * Required. The message to show.
    */
  var message: String = js.native
  /**
    * Optional. A string containing any valid Angular HTML which will be shown instead of the regular message text.
    * The string must contain one root element like all valid Angular HTML templates (so wrap everything in a <span>).
    */
  var messageTemplate: js.UndefOr[String] = js.native
  /**
    * Optional. Currently center and right are the only acceptable values.
    */
  var position: js.UndefOr[String] = js.native
  /**
    * Optional. A custom template for the UI of the message.
    */
  var templateUrl: js.UndefOr[String] = js.native
}

