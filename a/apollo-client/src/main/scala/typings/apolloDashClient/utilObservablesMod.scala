package typings.apolloDashClient

import typings.apolloDashClient.utilObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/util/observables", JSImport.Namespace)
@js.native
object utilObservablesMod extends js.Object {
  def asyncMap[V, R](observable: Observable[V], mapFn: js.Function1[/* value */ V, R | js.Promise[R]]): Observable[R] = js.native
  def multiplex[T](inner: Observable[T]): Observable[T] = js.native
}

