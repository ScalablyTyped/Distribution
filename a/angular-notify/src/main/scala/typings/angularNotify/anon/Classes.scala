package typings.angularNotify.anon

import typings.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Classes extends js.Object {
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

object Classes {
  @scala.inline
  def apply(message: String): Classes = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classes]
  }
  @scala.inline
  implicit class ClassesOps[Self <: Classes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def set$scope(value: IScope): Self = this.set("$scope", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$scope: Self = this.set("$scope", js.undefined)
    @scala.inline
    def setClasses(value: String): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setContainer(value: js.Any): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setMessageTemplate(value: String): Self = this.set("messageTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageTemplate: Self = this.set("messageTemplate", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setTemplateUrl(value: String): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateUrl: Self = this.set("templateUrl", js.undefined)
  }
  
}

