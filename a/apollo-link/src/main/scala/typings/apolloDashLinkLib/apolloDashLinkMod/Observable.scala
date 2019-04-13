package typings
package apolloDashLinkLib.apolloDashLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link", "Observable")
@js.native
class ObservableCls[T] protected ()
  extends zenDashObservableDashTsLib.libZenObservableMod.Observable[T] {
  def this(subscriber: zenDashObservableDashTsLib.libZenObservableMod.Subscriber[T]) = this()
}

@JSImport("apollo-link", "Observable")
@js.native
object Observable
  extends org.scalablytyped.runtime.Instantiable1[
      /* subscriber */ zenDashObservableDashTsLib.libZenObservableMod.Subscriber[js.Object], 
      zenDashObservableDashTsLib.libZenObservableMod.Observable[js.Object]
    ] {
  def from[R](observable: stdLib.ArrayLike[R]): zenDashObservableDashTsLib.libZenObservableMod.Observable[R] = js.native
  def from[R](observable: zenDashObservableDashTsLib.libTypesMod.ZenObservableNs.ObservableLike[R]): zenDashObservableDashTsLib.libZenObservableMod.Observable[R] = js.native
  def from[R](observable: zenDashObservableDashTsLib.libZenObservableMod.Observable[R]): zenDashObservableDashTsLib.libZenObservableMod.Observable[R] = js.native
  def of[R](args: R*): zenDashObservableDashTsLib.libZenObservableMod.Observable[R] = js.native
}

