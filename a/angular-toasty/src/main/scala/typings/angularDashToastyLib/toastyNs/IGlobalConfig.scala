package typings
package angularDashToastyLib.toastyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGlobalConfig extends js.Object {
  /**
    * Whether clicking the toast closes it.
    */
  var clickToClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether HTML is allowed in toast.
    */
  var html: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Maximum number of toasts to show at once.
    */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /**
    * The toast's message.
    */
  var msg: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The window position where the toast pops up.
    *
    */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to shake the toast.
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
    * How long (in miliseconds) the toast shows before it's removed. Set to false to disable.
    */
  var timeout: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  /**
    * The toast's title.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object IGlobalConfig {
  @scala.inline
  def apply(
    clickToClose: js.UndefOr[scala.Boolean] = js.undefined,
    html: js.UndefOr[scala.Boolean] = js.undefined,
    limit: scala.Int | scala.Double = null,
    msg: java.lang.String = null,
    position: java.lang.String = null,
    shake: js.UndefOr[scala.Boolean] = js.undefined,
    showClose: js.UndefOr[scala.Boolean] = js.undefined,
    sound: js.UndefOr[scala.Boolean] = js.undefined,
    theme: java.lang.String = null,
    timeout: scala.Double | scala.Boolean = null,
    title: java.lang.String = null
  ): IGlobalConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clickToClose)) __obj.updateDynamic("clickToClose")(clickToClose)
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (msg != null) __obj.updateDynamic("msg")(msg)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(shake)) __obj.updateDynamic("shake")(shake)
    if (!js.isUndefined(showClose)) __obj.updateDynamic("showClose")(showClose)
    if (!js.isUndefined(sound)) __obj.updateDynamic("sound")(sound)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IGlobalConfig]
  }
}

