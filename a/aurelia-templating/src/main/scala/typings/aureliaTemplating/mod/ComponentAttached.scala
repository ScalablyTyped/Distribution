package typings.aureliaTemplating.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentAttached extends StObject {
  
  /**
    * Implement this hook if you want to perform custom logic when the component is attached to the DOM (in document).
    */
  def attached(): Unit
}
object ComponentAttached {
  
  inline def apply(attached: () => Unit): ComponentAttached = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction0(attached))
    __obj.asInstanceOf[ComponentAttached]
  }
  
  extension [Self <: ComponentAttached](x: Self) {
    
    inline def setAttached(value: () => Unit): Self = StObject.set(x, "attached", js.Any.fromFunction0(value))
  }
}
