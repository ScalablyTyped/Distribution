package typings.adone.adoneNs.fastNs.INs.pluginNs.notifyNs

import typings.adone.Anon_Timeout
import typings.adone.adoneNs.utilNs.INs.DebounceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnErrorOptions[T] extends Options[T] {
  /**
    * Whether to end the stream when an error occurs
    */
  var endStream: js.UndefOr[Boolean] = js.undefined
}

object OnErrorOptions {
  @scala.inline
  def apply[T](
    appName: String = null,
    console: js.UndefOr[Boolean] = js.undefined,
    debounce: Double | (DebounceOptions with Anon_Timeout) = null,
    emitError: js.UndefOr[Boolean] = js.undefined,
    endStream: js.UndefOr[Boolean] = js.undefined,
    filter: T => Boolean = null,
    gui: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    message: String | (js.Function1[T, String]) = null,
    notifier: js.Object = null,
    onLast: js.UndefOr[Boolean] = js.undefined,
    open: String | (js.Function1[T, String]) = null,
    port: Int | Double = null,
    subtitle: String | (js.Function1[T, String]) = null,
    templateOptions: js.Object = null,
    title: String | (js.Function1[T, String]) = null
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

