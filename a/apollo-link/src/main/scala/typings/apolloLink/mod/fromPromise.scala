package typings.apolloLink.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link", "fromPromise")
@js.native
object fromPromise extends js.Object {
  def apply[T](promise: js.Promise[T]): typings.zenObservableTs.zenObservableMod.Observable[T] = js.native
}

