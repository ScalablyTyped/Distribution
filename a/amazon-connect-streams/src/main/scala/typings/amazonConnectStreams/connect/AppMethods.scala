package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppMethods extends StObject {
  
  def destroy(): Unit
  
  def init(): Unit
}
object AppMethods {
  
  inline def apply(destroy: () => Unit, init: () => Unit): AppMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), init = js.Any.fromFunction0(init))
    __obj.asInstanceOf[AppMethods]
  }
  
  extension [Self <: AppMethods](x: Self) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
  }
}
