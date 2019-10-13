package typings.apolloDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/util/Observable", JSImport.Namespace)
@js.native
object utilObservableMod extends js.Object {
  @js.native
  class Observable[T] ()
    extends typings.zenDashObservableDashTs.libZenObservableMod.Observable[T]
  
  type Observer[T] = typings.zenDashObservable.zenDashObservableMod._Global_.ZenObservable.Observer[T]
  type Subscription = typings.zenDashObservable.zenDashObservableMod._Global_.ZenObservable.Subscription
}

