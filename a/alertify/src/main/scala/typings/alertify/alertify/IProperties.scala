package typings.alertify.alertify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties for alertify.set function
  */
@js.native
trait IProperties extends js.Object {
  /** Default button for focus */
  var buttonFocus: js.UndefOr[String] = js.native
  /** Should buttons be displayed in reverse order */
  var buttonReverse: js.UndefOr[Boolean] = js.native
  /** Default value for milliseconds display of log messages */
  var delay: js.UndefOr[Double] = js.native
  /** Default values for display of labels */
  var labels: js.UndefOr[ILabels] = js.native
}

object IProperties {
  @scala.inline
  def apply(): IProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProperties]
  }
  @scala.inline
  implicit class IPropertiesOps[Self <: IProperties] (val x: Self) extends AnyVal {
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
    def setButtonFocus(value: String): Self = this.set("buttonFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonFocus: Self = this.set("buttonFocus", js.undefined)
    @scala.inline
    def setButtonReverse(value: Boolean): Self = this.set("buttonReverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonReverse: Self = this.set("buttonReverse", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setLabels(value: ILabels): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
  }
  
}

