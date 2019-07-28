package typings.apolloDashLink.apolloDashLinkMod

import org.scalablytyped.runtime.Instantiable1
import typings.std.ArrayLike
import typings.zenDashObservableDashTs.libTypesMod.ZenObservableNs.ObservableLike
import typings.zenDashObservableDashTs.libZenObservableMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link", "Observable")
@js.native
class ObservableCls[T] protected ()
  extends typings.zenDashObservableDashTs.libZenObservableMod.Observable[T] {
  def this(subscriber: Subscriber[T]) = this()
}

@JSImport("apollo-link", "Observable")
@js.native
object Observable
  extends Instantiable1[
      /* subscriber */ Subscriber[js.Object], 
      typings.zenDashObservableDashTs.libZenObservableMod.Observable[js.Object]
    ] {
  def from[R](observable: ArrayLike[R]): typings.zenDashObservableDashTs.libZenObservableMod.Observable[R] = js.native
  def from[R](observable: ObservableLike[R]): typings.zenDashObservableDashTs.libZenObservableMod.Observable[R] = js.native
  def from[R](observable: typings.zenDashObservableDashTs.libZenObservableMod.Observable[R]): typings.zenDashObservableDashTs.libZenObservableMod.Observable[R] = js.native
  def of[R](args: R*): typings.zenDashObservableDashTs.libZenObservableMod.Observable[R] = js.native
}

