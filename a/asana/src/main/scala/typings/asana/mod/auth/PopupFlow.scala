package typings.asana.mod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupFlow
  extends StObject
     with BaseBrowserFlow {
  
  /**
    * @param popupWidth
    * @param popupHeight
    */
  def _popupParams(popupWidth: Double, popupHeight: Double): Unit
  
  def runReceiver(): Unit
}
object PopupFlow {
  
  @JSImport("asana", "auth.PopupFlow")
  @js.native
  val ^ : PopupFlowStatic = js.native
  
  @scala.inline
  implicit class PopupFlowMutableBuilder[Self <: PopupFlow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRunReceiver(value: () => Unit): Self = StObject.set(x, "runReceiver", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_popupParams(value: (Double, Double) => Unit): Self = StObject.set(x, "_popupParams", js.Any.fromFunction2(value))
  }
}
