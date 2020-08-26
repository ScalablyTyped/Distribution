package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITooltipOptions extends js.Object {
  /**
    * Should the modal fade in and out?
    *
    * @default true
    */
  var animation: js.UndefOr[Boolean] = js.native
  /**
    * Should the tooltip be appended to `$body` instead of the parent element?
    *
    * @default false
    */
  var appendToBody: js.UndefOr[Boolean] = js.native
  /**
    * Where to place it? Defaults to 'top', but also accepts 'right', 'bottom', or 'left'.
    *
    * @default 'top'
    */
  var placement: js.UndefOr[String] = js.native
  /**
    * For how long should the tooltip remain open after the close trigger event?
    *
    * @default 0
    */
  var popupCloseDelay: js.UndefOr[Double] = js.native
  /**
    * Popup delay in milliseconds until it opens.
    *
    * @default 0
    */
  var popupDelay: js.UndefOr[Double] = js.native
  /**
    * What should trigger a show of the tooltip? Supports a space separated list of event names.
    *
    * @default 'mouseenter' for tooltip, 'click' for popover
    */
  var trigger: js.UndefOr[String] = js.native
  /**
    * Should an expression on the scope be used to load the content?
    *
    * @default false
    */
  var useContentExp: js.UndefOr[Boolean] = js.native
}

object ITooltipOptions {
  @scala.inline
  def apply(): ITooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITooltipOptions]
  }
  @scala.inline
  implicit class ITooltipOptionsOps[Self <: ITooltipOptions] (val x: Self) extends AnyVal {
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
    def setAnimation(value: Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAppendToBody(value: Boolean): Self = this.set("appendToBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendToBody: Self = this.set("appendToBody", js.undefined)
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setPopupCloseDelay(value: Double): Self = this.set("popupCloseDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupCloseDelay: Self = this.set("popupCloseDelay", js.undefined)
    @scala.inline
    def setPopupDelay(value: Double): Self = this.set("popupDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupDelay: Self = this.set("popupDelay", js.undefined)
    @scala.inline
    def setTrigger(value: String): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    @scala.inline
    def setUseContentExp(value: Boolean): Self = this.set("useContentExp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseContentExp: Self = this.set("useContentExp", js.undefined)
  }
  
}

