package typings.apolloClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/util/Observable", JSImport.Namespace)
@js.native
object observableMod extends js.Object {
  @js.native
  class Observable[T] ()
    extends typings.zenObservableTs.zenObservableMod.Observable[T]
  
  type Observer[T] = typings.zenObservable.mod.global.ZenObservable.Observer[T]
  type Subscription = typings.zenObservable.mod.global.ZenObservable.Subscription
}

