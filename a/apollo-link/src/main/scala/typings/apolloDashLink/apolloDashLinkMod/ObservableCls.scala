package typings.apolloDashLink.apolloDashLinkMod

import typings.zenDashObservableDashTs.libZenObservableMod.Observable
import typings.zenDashObservableDashTs.libZenObservableMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link", "Observable")
@js.native
class ObservableCls[T] protected () extends Observable[T] {
  def this(subscriber: Subscriber[T]) = this()
}

