package typings
package angularDashToastyLib.toastyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastyConfig extends js.Object {
  /**
    * Whether clicking the toast closes it.
    */
  var clickToClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether HTML is allowed in toasts.
    */
  var html: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The toast's message.
    */
  var msg: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Add event handler.
    */
  var onAdd: js.UndefOr[js.Function] = js.undefined
  /**
    * Click event handler.
    */
  var onClick: js.UndefOr[js.Function] = js.undefined
  /**
    * Remove event handler.
    */
  var onRemove: js.UndefOr[js.Function] = js.undefined
  /**
    * Whether to shake the toasts.
    */
  var shake: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to show the 'X' icon to close the toast.
    */
  var showClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to play a sound when a toast is added.
    */
  var sound: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * What theme to use.
    * - 'default'
    * - 'material'
    * - 'bootstrap'
    */
  var theme: js.UndefOr[java.lang.String] = js.undefined
  /**
    * How long (in milliseconds) the toast shows before it's removed. Set to false to disable.
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * The toast's title.
    */
  var title: java.lang.String
  /**
    * The toast's type:
    * - 'default'
    * - 'info'
    * - 'success'
    * - 'wait'
    * - 'error'
    * - 'warning'
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object IToastyConfig {
  @scala.inline
  def apply(
    title: java.lang.String,
    clickToClose: js.UndefOr[scala.Boolean] = js.undefined,
    html: js.UndefOr[scala.Boolean] = js.undefined,
    msg: java.lang.String = null,
    onAdd: js.Function = null,
    onClick: js.Function = null,
    onRemove: js.Function = null,
    shake: js.UndefOr[scala.Boolean] = js.undefined,
    showClose: js.UndefOr[scala.Boolean] = js.undefined,
    sound: js.UndefOr[scala.Boolean] = js.undefined,
    theme: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): IToastyConfig = {
    val __obj = js.Dynamic.literal(title = title)
    if (!js.isUndefined(clickToClose)) __obj.updateDynamic("clickToClose")(clickToClose)
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    if (msg != null) __obj.updateDynamic("msg")(msg)
    if (onAdd != null) __obj.updateDynamic("onAdd")(onAdd)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onRemove != null) __obj.updateDynamic("onRemove")(onRemove)
    if (!js.isUndefined(shake)) __obj.updateDynamic("shake")(shake)
    if (!js.isUndefined(showClose)) __obj.updateDynamic("showClose")(showClose)
    if (!js.isUndefined(sound)) __obj.updateDynamic("sound")(sound)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IToastyConfig]
  }
}

