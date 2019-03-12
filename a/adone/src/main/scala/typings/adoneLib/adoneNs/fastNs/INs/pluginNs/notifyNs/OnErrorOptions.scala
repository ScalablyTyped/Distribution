package typings
package adoneLib.adoneNs.fastNs.INs.pluginNs.notifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnErrorOptions[T] extends Options[T] {
  /**
    * Whether to end the stream when an error occurs
    */
  var endStream: js.UndefOr[scala.Boolean] = js.undefined
}

object OnErrorOptions {
  @scala.inline
  def apply[T](
    appName: java.lang.String = null,
    console: js.UndefOr[scala.Boolean] = js.undefined,
    debounce: (scala.Double | adoneLib.adoneNs.utilNs.INs.DebounceOptions) with adoneLib.Anon_Timeout = null,
    emitError: js.UndefOr[scala.Boolean] = js.undefined,
    endStream: js.UndefOr[scala.Boolean] = js.undefined,
    filter: T => scala.Boolean = null,
    gui: js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String = null,
    message: java.lang.String | (js.Function1[T, java.lang.String]) = null,
    notifier: js.Object = null,
    onLast: js.UndefOr[scala.Boolean] = js.undefined,
    open: java.lang.String | (js.Function1[T, java.lang.String]) = null,
    port: scala.Int | scala.Double = null,
    subtitle: java.lang.String | (js.Function1[T, java.lang.String]) = null,
    templateOptions: js.Object = null,
    title: java.lang.String | (js.Function1[T, java.lang.String]) = null
  ): OnErrorOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (appName != null) __obj.updateDynamic("appName")(appName)
    if (!js.isUndefined(console)) __obj.updateDynamic("console")(console)
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (!js.isUndefined(emitError)) __obj.updateDynamic("emitError")(emitError)
    if (!js.isUndefined(endStream)) __obj.updateDynamic("endStream")(endStream)
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
    __obj.asInstanceOf[OnErrorOptions[T]]
  }
}

