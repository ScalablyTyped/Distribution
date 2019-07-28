package typings.angular.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAngularEvent extends js.Object {
  /**
    * the scope that is currently handling the event. Once the event propagates through the scope hierarchy, this property is set to null.
    */
  var currentScope: IScope
  /**
    * true if preventDefault was called.
    */
  var defaultPrevented: Boolean
  /**
    * name of the event.
    */
  var name: String
  /**
    * calling stopPropagation function will cancel further event propagation (available only for events that were $emit-ed).
    */
  var stopPropagation: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * the scope on which the event was $emit-ed or $broadcast-ed.
    */
  var targetScope: IScope
  /**
    * calling preventDefault sets defaultPrevented flag to true.
    */
  def preventDefault(): Unit
}

object IAngularEvent {
  @scala.inline
  def apply(
    currentScope: IScope,
    defaultPrevented: Boolean,
    name: String,
    preventDefault: () => Unit,
    targetScope: IScope,
    stopPropagation: () => Unit = null
  ): IAngularEvent = {
    val __obj = js.Dynamic.literal(currentScope = currentScope, defaultPrevented = defaultPrevented, name = name, preventDefault = js.Any.fromFunction0(preventDefault), targetScope = targetScope)
    if (stopPropagation != null) __obj.updateDynamic("stopPropagation")(js.Any.fromFunction0(stopPropagation))
    __obj.asInstanceOf[IAngularEvent]
  }
}

