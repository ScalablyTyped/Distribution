package typings.apolloDashLink.apolloDashLinkMod

import typings.zenDashObservableDashTs.libZenObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link", "fromPromise")
@js.native
object fromPromise extends js.Object {
  def apply[T](promise: js.Promise[T]): Observable[T] = js.native
}

