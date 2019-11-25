package typings.angularDashNotify

import typings.angular.angularMod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Classes extends js.Object {
  /**
    * Optional. A valid Angular scope object. The scope of the template will be created by calling $new() on this scope.
    */
  @JSName("$scope")
  var $scope: js.UndefOr[IScope] = js.undefined
  /**
    * Optional. A list of custom CSS classes to apply to the message element.
    */
  var classes: js.UndefOr[String] = js.undefined
  /**
    * Optional. Element that contains each notification. Defaults to document.body.
    */
  var container: js.UndefOr[js.Any] = js.undefined
  /**
    * Optional. The duration (in milliseconds) of the message. A duration of 0 will prevent the message from closing automatically.
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * Required. The message to show.
    */
  var message: String
  /**
    * Optional. A string containing any valid Angular HTML which will be shown instead of the regular message text.
    * The string must contain one root element like all valid Angular HTML templates (so wrap everything in a <span>).
    */
  var messageTemplate: js.UndefOr[String] = js.undefined
  /**
    * Optional. Currently center and right are the only acceptable values.
    */
  var position: js.UndefOr[String] = js.undefined
  /**
    * Optional. A custom template for the UI of the message.
    */
  var templateUrl: js.UndefOr[String] = js.undefined
}

object Anon_Classes {
  @scala.inline
  def apply(
    message: String,
    $scope: IScope = null,
    classes: String = null,
    container: js.Any = null,
    duration: Int | Double = null,
    messageTemplate: String = null,
    position: String = null,
    templateUrl: String = null
  ): Anon_Classes = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if ($scope != null) __obj.updateDynamic("$scope")($scope.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (messageTemplate != null) __obj.updateDynamic("messageTemplate")(messageTemplate.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Classes]
  }
}

