package typings
package adoneLib.adoneNs.fastNs.INs.pluginNs.notifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  var appName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to use console notifications (print a message to console)
    */
  var console: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to debounce notifications. Accepts a number as timeout or debounce options
    * Default: undefined
    */
  var debounce: js.UndefOr[
    (scala.Double | adoneLib.adoneNs.utilNs.INs.DebounceOptions) with adoneLib.Anon_Timeout
  ] = js.undefined
  /**
    * Whether to emit an error when the stream emits an error. Default: false
    */
  var emitError: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Filter out files
    */
  var filter: js.UndefOr[js.Function1[/* file */ T, scala.Boolean]] = js.undefined
  /**
    * Whether to use GUI notifications (notify-send/toaster/etc)
    */
  var gui: js.UndefOr[scala.Boolean] = js.undefined
   // TODO adone.notifier
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Notification message
    */
  var message: js.UndefOr[java.lang.String | (js.Function1[/* file */ T, java.lang.String])] = js.undefined
  var notifier: js.UndefOr[js.Object] = js.undefined
  /**
    * Whether to notify on the last file. Default: false
    */
  var onLast: js.UndefOr[scala.Boolean] = js.undefined
  var open: js.UndefOr[java.lang.String | (js.Function1[/* file */ T, java.lang.String])] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  /**
    * Notification subtitle
    */
  var subtitle: js.UndefOr[java.lang.String | (js.Function1[/* file */ T, java.lang.String])] = js.undefined
  /**
    * Object passed to the lodash template, for additional properties passed to the template
    */
  var templateOptions: js.UndefOr[js.Object] = js.undefined
  /**
    * Notification title
    */
  var title: js.UndefOr[java.lang.String | (js.Function1[/* file */ T, java.lang.String])] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](
    appName: java.lang.String = null,
    console: js.UndefOr[scala.Boolean] = js.undefined,
    debounce: (scala.Double | adoneLib.adoneNs.utilNs.INs.DebounceOptions) with adoneLib.Anon_Timeout = null,
    emitError: js.UndefOr[scala.Boolean] = js.undefined,
    filter: js.Function1[/* file */ T, scala.Boolean] = null,
    gui: js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String = null,
    message: java.lang.String | (js.Function1[/* file */ T, java.lang.String]) = null,
    notifier: js.Object = null,
    onLast: js.UndefOr[scala.Boolean] = js.undefined,
    open: java.lang.String | (js.Function1[/* file */ T, java.lang.String]) = null,
    port: scala.Int | scala.Double = null,
    subtitle: java.lang.String | (js.Function1[/* file */ T, java.lang.String]) = null,
    templateOptions: js.Object = null,
    title: java.lang.String | (js.Function1[/* file */ T, java.lang.String]) = null
  ): Options[T] = {
    val __obj = js.Dynamic.literal()
    if (appName != null) __obj.updateDynamic("appName")(appName)
    if (!js.isUndefined(console)) __obj.updateDynamic("console")(console)
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (!js.isUndefined(emitError)) __obj.updateDynamic("emitError")(emitError)
    if (filter != null) __obj.updateDynamic("filter")(filter)
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

