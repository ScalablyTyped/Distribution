package typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipOptions extends js.Object {
  /**
    * Should the modal fade in and out?
    *
    * @default true
    */
  var animation: js.UndefOr[Boolean] = js.undefined
  /**
    * Should the tooltip be appended to `$body` instead of the parent element?
    *
    * @default false
    */
  var appendToBody: js.UndefOr[Boolean] = js.undefined
  /**
    * Where to place it? Defaults to 'top', but also accepts 'right', 'bottom', or 'left'.
    *
    * @default 'top'
    */
  var placement: js.UndefOr[String] = js.undefined
  /**
    * For how long should the tooltip remain open after the close trigger event?
    *
    * @default 0
    */
  var popupCloseDelay: js.UndefOr[Double] = js.undefined
  /**
    * Popup delay in milliseconds until it opens.
    *
    * @default 0
    */
  var popupDelay: js.UndefOr[Double] = js.undefined
  /**
    * What should trigger a show of the tooltip? Supports a space separated list of event names.
    *
    * @default 'mouseenter' for tooltip, 'click' for popover
    */
  var trigger: js.UndefOr[String] = js.undefined
  /**
    * Should an expression on the scope be used to load the content?
    *
    * @default false
    */
  var useContentExp: js.UndefOr[Boolean] = js.undefined
}

object ITooltipOptions {
  @scala.inline
  def apply(
    animation: js.UndefOr[Boolean] = js.undefined,
    appendToBody: js.UndefOr[Boolean] = js.undefined,
    placement: String = null,
    popupCloseDelay: Int | Double = null,
    popupDelay: Int | Double = null,
    trigger: String = null,
    useContentExp: js.UndefOr[Boolean] = js.undefined
  ): ITooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(appendToBody)) __obj.updateDynamic("appendToBody")(appendToBody)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (popupCloseDelay != null) __obj.updateDynamic("popupCloseDelay")(popupCloseDelay.asInstanceOf[js.Any])
    if (popupDelay != null) __obj.updateDynamic("popupDelay")(popupDelay.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    if (!js.isUndefined(useContentExp)) __obj.updateDynamic("useContentExp")(useContentExp)
    __obj.asInstanceOf[ITooltipOptions]
  }
}

