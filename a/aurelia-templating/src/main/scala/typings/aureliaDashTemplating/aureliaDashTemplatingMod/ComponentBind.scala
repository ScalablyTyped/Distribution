package typings.aureliaDashTemplating.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentBind extends js.Object {
  /**
    * Implement this hook if you want to perform custom logic when databinding is activated on the view and view-model.
    * The "binding context" to which the component is being bound will be passed first.
    * An "override context" will be passed second. The override context contains information used to traverse
    * the parent hierarchy and can also be used to add any contextual properties that the component wants to add.
    */
  def bind(bindingContext: js.Any, overrideContext: js.Any): Unit
}

object ComponentBind {
  @scala.inline
  def apply(bind: (js.Any, js.Any) => Unit): ComponentBind = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction2(bind))
  
    __obj.asInstanceOf[ComponentBind]
  }
}

