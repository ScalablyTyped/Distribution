package typings.angularDashToasty.toasty

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGlobalConfig extends js.Object {
  /**
    * Whether clicking the toast closes it.
    */
  var clickToClose: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether HTML is allowed in toast.
    */
  var html: js.UndefOr[Boolean] = js.undefined
  /**
    * Maximum number of toasts to show at once.
    */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * The toast's message.
    */
  var msg: js.UndefOr[String] = js.undefined
  /**
    * The window position where the toast pops up.
    *
    */
  var position: js.UndefOr[String] = js.undefined
  /**
    * Whether to shake the toast.
    */
  var shake: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to show the 'X' icon to close the toast.
    */
  var showClose: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to play a sound when a toast is added.
    */
  var sound: js.UndefOr[Boolean] = js.undefined
  /**
    * What theme to use.
    * - 'default'
    * - 'material'
    * - 'bootstrap'
    */
  var theme: js.UndefOr[String] = js.undefined
  /**
    * How long (in miliseconds) the toast shows before it's removed. Set to false to disable.
    */
  var timeout: js.UndefOr[Double | Boolean] = js.undefined
  /**
    * The toast's title.
    */
  var title: js.UndefOr[String] = js.undefined
}

object IGlobalConfig {
  @scala.inline
  def apply(
    clickToClose: js.UndefOr[Boolean] = js.undefined,
    html: js.UndefOr[Boolean] = js.undefined,
    limit: Int | Double = null,
    msg: String = null,
    position: String = null,
    shake: js.UndefOr[Boolean] = js.undefined,
    showClose: js.UndefOr[Boolean] = js.undefined,
    sound: js.UndefOr[Boolean] = js.undefined,
    theme: String = null,
    timeout: Double | Boolean = null,
    title: String = null
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

