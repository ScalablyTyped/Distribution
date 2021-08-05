package typings.aureliaTemplating.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentDetached extends StObject {
  
  /**
    * Implement this hook if you want to perform custom logic if/when the component is removed from the the DOM.
    */
  def detached(): Unit
}
object ComponentDetached {
  
  inline def apply(detached: () => Unit): ComponentDetached = {
    val __obj = js.Dynamic.literal(detached = js.Any.fromFunction0(detached))
    __obj.asInstanceOf[ComponentDetached]
  }
  
  extension [Self <: ComponentDetached](x: Self) {
    
    inline def setDetached(value: () => Unit): Self = StObject.set(x, "detached", js.Any.fromFunction0(value))
  }
}
