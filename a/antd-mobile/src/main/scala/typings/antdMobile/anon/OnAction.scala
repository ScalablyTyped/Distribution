package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnAction extends StObject {
  
  var action: typings.antdMobile.esComponentsModalModalActionButtonMod.Action
  
  def onAction(): Unit | js.Promise[Unit]
}
object OnAction {
  
  inline def apply(
    action: typings.antdMobile.esComponentsModalModalActionButtonMod.Action,
    onAction: () => Unit | js.Promise[Unit]
  ): OnAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], onAction = js.Any.fromFunction0(onAction))
    __obj.asInstanceOf[OnAction]
  }
  
  extension [Self <: OnAction](x: Self) {
    
    inline def setAction(value: typings.antdMobile.esComponentsModalModalActionButtonMod.Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setOnAction(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onAction", js.Any.fromFunction0(value))
  }
}
