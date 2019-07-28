package typings.aureliaDashBinding.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait bindingMode extends js.Object

@JSImport("aurelia-binding", "bindingMode")
@js.native
object bindingMode extends js.Object {
  /**
    * Updates the binding source (source) when the binding target (target) property changes.
    * This type of binding is appropriate if the element being bound (target)
    * is implicitly write-only - serves only as an intput.
    */
  @js.native
  sealed trait fromView extends bindingMode
  
  /**
    * Updates the binding target once. This is essentially a simpler form of to-view binding
    * that provides better performance in cases where the source value does not change.
    */
  @js.native
  sealed trait oneTime extends bindingMode
  
  /**
    * Updates the binding target (target) property when the binding source (source) changes.
    * This type of binding is appropriate if the element being bound (target)
    * is implicitly read-only - serves only as an output.
    * If there is no need to monitor the changes of the target property, using the one-way
    * binding mode avoids the overhead of the two-way binding mode.
    * @deprecated Use `toView` instead.
    */
  @js.native
  sealed trait oneWay extends bindingMode
  
  /**
    * Updates the binding target (target) property when the binding source (source) changes.
    * This type of binding is appropriate if the element being bound (target)
    * is implicitly read-only - serves only as an output.
    * If there is no need to monitor the changes of the target property, using the to-view
    * binding mode avoids the overhead of the two-way binding mode.
    */
  @js.native
  sealed trait toView extends bindingMode
  
  /**
    * Causes changes to either the source property or the target property to automatically update
    * the other. This type of binding is appropriate for editable forms or other fully-interactive
    * UI scenarios.
    */
  @js.native
  sealed trait twoWay extends bindingMode
  
  /* 3 */ val fromView: typings.aureliaDashBinding.aureliaDashBindingMod.bindingMode.fromView with Double = js.native
  /* 0 */ val oneTime: typings.aureliaDashBinding.aureliaDashBindingMod.bindingMode.oneTime with Double = js.native
  /* 1 */ val oneWay: typings.aureliaDashBinding.aureliaDashBindingMod.bindingMode.oneWay with Double = js.native
  /* 1 */ val toView: typings.aureliaDashBinding.aureliaDashBindingMod.bindingMode.toView with Double = js.native
  /* 2 */ val twoWay: typings.aureliaDashBinding.aureliaDashBindingMod.bindingMode.twoWay with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[bindingMode with Double] = js.native
}

