package typings
package aureliaDashKnockoutLib.distCommonjsKnockoutDashBindableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-knockout/dist/commonjs/knockout-bindable", "KnockoutBindable")
@js.native
class KnockoutBindable protected () extends js.Object {
  def this(observerLocator: aureliaDashBindingLib.aureliaDashBindingMod.ObserverLocator) = this()
  var observerLocator: aureliaDashBindingLib.aureliaDashBindingMod.ObserverLocator = js.native
  var subscriptions: js.Array[_] = js.native
  /**
    * Applys all values from a data object (usually the activation data) to the corresponding instance fields
    * in the current view model if they are marked as @bindable. By default all matching values from the data object
    * are applied. To only apply observable values set the last parameter to `true`. Subscriptions are created
    * for all Knockout observables in the data object to update the view-model values respectively.
    *
    * @param data - the data object
    * @param target - the target view model
    * @param applyOnlyObservables - `true` if only observable values should be applied, false by default.
    */
  def applyBindableValues(data: js.Any, target: js.Any, applyOnlyObservables: scala.Boolean): scala.Unit = js.native
  /** internal: do not use */
  def getObserver(target: js.Any, key: java.lang.String): aureliaDashBindingLib.aureliaDashBindingMod.InternalPropertyObserver = js.native
}

