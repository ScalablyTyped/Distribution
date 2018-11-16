package typings
package aureliaDashBindingLib.aureliaDashBindingMod

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
  sealed trait fromView
    extends aureliaDashBindingLib.aureliaDashBindingMod.bindingMode
  
  /**
     * Updates the binding target once. This is essentially a simpler form of to-view binding
     * that provides better performance in cases where the source value does not change.
     */
  @js.native
  sealed trait oneTime
    extends aureliaDashBindingLib.aureliaDashBindingMod.bindingMode
  
  /**
     * Updates the binding target (target) property when the binding source (source) changes.
     * This type of binding is appropriate if the element being bound (target)
     * is implicitly read-only - serves only as an output.
     * If there is no need to monitor the changes of the target property, using the one-way
     * binding mode avoids the overhead of the two-way binding mode.
     * @deprecated Use `toView` instead.
     */
  @js.native
  sealed trait oneWay
    extends aureliaDashBindingLib.aureliaDashBindingMod.bindingMode
  
  /**
     * Updates the binding target (target) property when the binding source (source) changes.
     * This type of binding is appropriate if the element being bound (target)
     * is implicitly read-only - serves only as an output.
     * If there is no need to monitor the changes of the target property, using the to-view
     * binding mode avoids the overhead of the two-way binding mode.
     */
  @js.native
  sealed trait toView
    extends aureliaDashBindingLib.aureliaDashBindingMod.bindingMode
  
  /**
     * Causes changes to either the source property or the target property to automatically update
     * the other. This type of binding is appropriate for editable forms or other fully-interactive
     * UI scenarios.
     */
  @js.native
  sealed trait twoWay
    extends aureliaDashBindingLib.aureliaDashBindingMod.bindingMode
  
  /* 3 */ val fromView: fromView with scala.Double = js.native
  /* 0 */ val oneTime: oneTime with scala.Double = js.native
  /* 1 */ val oneWay: oneWay with scala.Double = js.native
  /* 1 */ val toView: toView with scala.Double = js.native
  /* 2 */ val twoWay: twoWay with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[aureliaDashBindingLib.aureliaDashBindingMod.bindingMode with scala.Double] = js.native
}

