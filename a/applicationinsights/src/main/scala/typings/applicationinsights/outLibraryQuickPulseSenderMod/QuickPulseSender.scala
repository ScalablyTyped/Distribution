package typings.applicationinsights.outLibraryQuickPulseSenderMod

import typings.applicationinsights.outDeclarationsContractsQuickPulseTypesEnvelopeQuickPulseMod.EnvelopeQuickPulse
import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuickPulseSender extends js.Object {
  var _config: js.Any
  var _consecutiveErrors: js.Any
  /* private */ def _submitData(envelope: js.Any, done: js.Any, postOrPing: js.Any): js.Any
  def ping(
    envelope: EnvelopeQuickPulse,
    done: js.Function2[/* shouldPOST */ js.UndefOr[Boolean], /* res */ js.UndefOr[IncomingMessage], Unit]
  ): Unit
  def post(
    envelope: EnvelopeQuickPulse,
    done: js.Function2[/* shouldPOST */ js.UndefOr[Boolean], /* res */ js.UndefOr[IncomingMessage], Unit]
  ): Unit
}

object QuickPulseSender {
  @scala.inline
  def apply(
    _config: js.Any,
    _consecutiveErrors: js.Any,
    _submitData: (js.Any, js.Any, js.Any) => js.Any,
    ping: (EnvelopeQuickPulse, js.Function2[/* shouldPOST */ js.UndefOr[Boolean], /* res */ js.UndefOr[IncomingMessage], Unit]) => Unit,
    post: (EnvelopeQuickPulse, js.Function2[/* shouldPOST */ js.UndefOr[Boolean], /* res */ js.UndefOr[IncomingMessage], Unit]) => Unit
  ): QuickPulseSender = {
    val __obj = js.Dynamic.literal(_config = _config.asInstanceOf[js.Any], _consecutiveErrors = _consecutiveErrors.asInstanceOf[js.Any], _submitData = js.Any.fromFunction3(_submitData), ping = js.Any.fromFunction2(ping), post = js.Any.fromFunction2(post))
  
    __obj.asInstanceOf[QuickPulseSender]
  }
}

