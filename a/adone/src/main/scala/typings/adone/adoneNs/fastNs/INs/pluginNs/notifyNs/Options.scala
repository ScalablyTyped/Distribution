package typings.adone.adoneNs.fastNs.INs.pluginNs.notifyNs

import typings.adone.Anon_Timeout
import typings.adone.adoneNs.utilNs.INs.DebounceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  var appName: js.UndefOr[String] = js.undefined
  /**
    * Whether to use console notifications (print a message to console)
    */
  var console: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to debounce notifications. Accepts a number as timeout or debounce options
    * Default: undefined
    */
  var debounce: js.UndefOr[Double | (DebounceOptions with Anon_Timeout)] = js.undefined
  /**
    * Whether to emit an error when the stream emits an error. Default: false
    */
  var emitError: js.UndefOr[Boolean] = js.undefined
  /**
    * Filter out files
    */
  var filter: js.UndefOr[js.Function1[/* file */ T, Boolean]] = js.undefined
  /**
    * Whether to use GUI notifications (notify-send/toaster/etc)
    */
  var gui: js.UndefOr[Boolean] = js.undefined
   // TODO adone.notifier
  var host: js.UndefOr[String] = js.undefined
  /**
    * Notification message
    */
  var message: js.UndefOr[String | (js.Function1[/* file */ T, String])] = js.undefined
  var notifier: js.UndefOr[js.Object] = js.undefined
  /**
    * Whether to notify on the last file. Default: false
    */
  var onLast: js.UndefOr[Boolean] = js.undefined
  var open: js.UndefOr[String | (js.Function1[/* file */ T, String])] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  /**
    * Notification subtitle
    */
  var subtitle: js.UndefOr[String | (js.Function1[/* file */ T, String])] = js.undefined
  /**
    * Object passed to the lodash template, for additional properties passed to the template
    */
  var templateOptions: js.UndefOr[js.Object] = js.undefined
  /**
    * Notification title
    */
  var title: js.UndefOr[String | (js.Function1[/* file */ T, String])] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](
    appName: String = null,
    console: js.UndefOr[Boolean] = js.undefined,
    debounce: Double | (DebounceOptions with Anon_Timeout) = null,
    emitError: js.UndefOr[Boolean] = js.undefined,
    filter: /* file */ T => Boolean = null,
    gui: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    message: String | (js.Function1[/* file */ T, String]) = null,
    notifier: js.Object = null,
    onLast: js.UndefOr[Boolean] = js.undefined,
    open: String | (js.Function1[/* file */ T, String]) = null,
    port: Int | Double = null,
    subtitle: String | (js.Function1[/* file */ T, String]) = null,
    templateOptions: js.Object = null,
    title: String | (js.Function1[/* file */ T, String]) = null
  ): Options[T] = {
    val __obj = js.Dynamic.literal()
    if (appName != null) __obj.updateDynamic("appName")(appName)
    if (!js.isUndefined(console)) __obj.updateDynamic("console")(console)
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (!js.isUndefined(emitError)) __obj.updateDynamic("emitError")(emitError)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (!js.isUndefined(gui)) __obj.updateDynamic("gui")(gui)
    if (host != null) __obj.updateDynamic("host")(host)
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (notifier != null) __obj.updateDynamic("notifier")(notifier)
    if (!js.isUndefined(onLast)) __obj.updateDynamic("onLast")(onLast)
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (templateOptions != null) __obj.updateDynamic("templateOptions")(templateOptions)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[T]]
  }
}

