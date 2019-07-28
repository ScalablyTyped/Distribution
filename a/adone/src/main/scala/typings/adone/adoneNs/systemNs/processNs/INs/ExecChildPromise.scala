package typings.adone.adoneNs.systemNs.processNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecChildPromise extends js.Object {
  def `catch`[TResult](): js.Promise[ExecReturns | TResult] = js.native
  def `catch`[TResult](onrejected: js.Function1[/* reason */ ExecError, TResult | js.Thenable[TResult]]): js.Promise[ExecReturns | TResult] = js.native
}

