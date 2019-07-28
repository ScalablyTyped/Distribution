package typings.atAngularCommon.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchView extends js.Object {
  var _created: js.Any
  var _templateRef: js.Any
  var _viewContainerRef: js.Any
  def create(): Unit
  def destroy(): Unit
  def enforceState(created: Boolean): Unit
}

object SwitchView {
  @scala.inline
  def apply(
    _created: js.Any,
    _templateRef: js.Any,
    _viewContainerRef: js.Any,
    create: () => Unit,
    destroy: () => Unit,
    enforceState: Boolean => Unit
  ): SwitchView = {
    val __obj = js.Dynamic.literal(_created = _created, _templateRef = _templateRef, _viewContainerRef = _viewContainerRef, create = js.Any.fromFunction0(create), destroy = js.Any.fromFunction0(destroy), enforceState = js.Any.fromFunction1(enforceState))
  
    __obj.asInstanceOf[SwitchView]
  }
}

