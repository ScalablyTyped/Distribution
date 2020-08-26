package typings.angularNotify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container extends js.Object {
  /**
    * The default element that contains each notification. Defaults to document.body.
    */
  var container: js.UndefOr[js.Any] = js.native
  /**
    * The default duration (in milliseconds) of each message. A duration of 0 will prevent messages from closing automatically.
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * The maximum number of total notifications that can be visible at one time. Older notifications will be closed when the maximum is reached.
    */
  var maximumOpen: js.UndefOr[Double] = js.native
  /**
    * The default position of each message. Currently only center and right are the supported values.
    */
  var position: js.UndefOr[String] = js.native
  /**
    * The Y pixel value where messages will be shown.
    */
  var startTop: js.UndefOr[Double] = js.native
  /**
    * The default message template.
    */
  var templateUrl: js.UndefOr[String] = js.native
  /**
    * The number of pixels that should be reserved between messages vertically.
    */
  var verticalSpacing: js.UndefOr[Double] = js.native
}

object Container {
  @scala.inline
  def apply(): Container = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Container]
  }
  @scala.inline
  implicit class ContainerOps[Self <: Container] (val x: Self) extends AnyVal {
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
    def setContainer(value: js.Any): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setMaximumOpen(value: Double): Self = this.set("maximumOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumOpen: Self = this.set("maximumOpen", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setStartTop(value: Double): Self = this.set("startTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTop: Self = this.set("startTop", js.undefined)
    @scala.inline
    def setTemplateUrl(value: String): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateUrl: Self = this.set("templateUrl", js.undefined)
    @scala.inline
    def setVerticalSpacing(value: Double): Self = this.set("verticalSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalSpacing: Self = this.set("verticalSpacing", js.undefined)
  }
  
}

