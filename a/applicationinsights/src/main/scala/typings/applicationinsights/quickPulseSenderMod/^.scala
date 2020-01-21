package typings.applicationinsights.quickPulseSenderMod

import typings.applicationinsights.envelopeQuickPulseMod.EnvelopeQuickPulse
import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/Library/QuickPulseSender", JSImport.Namespace)
@js.native
class ^ protected () extends QuickPulseSender {
  def this(config: typings.applicationinsights.configMod.^) = this()
  /* CompleteClass */
  override var _config: js.Any = js.native
  /* CompleteClass */
  override var _consecutiveErrors: js.Any = js.native
  /* CompleteClass */
  /* private */ override def _submitData(envelope: js.Any, done: js.Any, postOrPing: js.Any): js.Any = js.native
  /* CompleteClass */
  override def ping(
    envelope: EnvelopeQuickPulse,
    done: js.Function2[/* shouldPOST */ js.UndefOr[Boolean], /* res */ js.UndefOr[IncomingMessage], Unit]
  ): Unit = js.native
  /* CompleteClass */
  override def post(
    envelope: EnvelopeQuickPulse,
    done: js.Function2[/* shouldPOST */ js.UndefOr[Boolean], /* res */ js.UndefOr[IncomingMessage], Unit]
  ): Unit = js.native
}

@JSImport("applicationinsights/out/Library/QuickPulseSender", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var MAX_QPS_FAILURES_BEFORE_WARN: js.Any = js.native
  var TAG: js.Any = js.native
}

