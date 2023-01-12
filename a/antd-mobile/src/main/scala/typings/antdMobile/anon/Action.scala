package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  var action: typings.antdMobile.esComponentsDialogDialogActionButtonMod.Action
  
  def onAction(): Unit | js.Promise[Unit]
}
object Action {
  
  inline def apply(
    action: typings.antdMobile.esComponentsDialogDialogActionButtonMod.Action,
    onAction: () => Unit | js.Promise[Unit]
  ): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], onAction = js.Any.fromFunction0(onAction))
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    inline def setAction(value: typings.antdMobile.esComponentsDialogDialogActionButtonMod.Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setOnAction(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onAction", js.Any.fromFunction0(value))
  }
}
