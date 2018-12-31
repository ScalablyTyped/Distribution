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

