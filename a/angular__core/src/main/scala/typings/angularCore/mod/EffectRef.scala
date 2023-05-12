package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EffectRef extends StObject {
  
  /**
    * Shut down the effect, removing it from any upcoming scheduled executions.
    */
  def destroy(): Unit
}
object EffectRef {
  
  inline def apply(destroy: () => Unit): EffectRef = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[EffectRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EffectRef] (val x: Self) extends AnyVal {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
  }
}
