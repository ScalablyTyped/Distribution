package typings.aureliaDashBinding.aureliaDashBindingMod

import org.scalablytyped.runtime.TopLevel
import typings.aureliaDashBinding.aureliaDashBindingMod.bindingMode.fromView
import typings.aureliaDashBinding.aureliaDashBindingMod.bindingMode.oneTime
import typings.aureliaDashBinding.aureliaDashBindingMod.bindingMode.oneWay
import typings.aureliaDashBinding.aureliaDashBindingMod.bindingMode.toView
import typings.aureliaDashBinding.aureliaDashBindingMod.bindingMode.twoWay
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[bindingMode with Double] = js.native
  /* 3 */ @js.native
  object fromView extends TopLevel[fromView with Double]
  
  /* 0 */ @js.native
  object oneTime extends TopLevel[oneTime with Double]
  
  /* 1 */ @js.native
  object oneWay extends TopLevel[oneWay with Double]
  
  /* 1 */ @js.native
  object toView extends TopLevel[toView with Double]
  
  /* 2 */ @js.native
  object twoWay extends TopLevel[twoWay with Double]
  
}

