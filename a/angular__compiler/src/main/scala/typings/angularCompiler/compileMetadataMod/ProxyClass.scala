package typings.angularCompiler.compileMetadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProxyClass extends StObject {
  
  def setDelegate(delegate: js.Any): Unit
}
object ProxyClass {
  
  inline def apply(setDelegate: js.Any => Unit): ProxyClass = {
    val __obj = js.Dynamic.literal(setDelegate = js.Any.fromFunction1(setDelegate))
    __obj.asInstanceOf[ProxyClass]
  }
  
  extension [Self <: ProxyClass](x: Self) {
    
    inline def setSetDelegate(value: js.Any => Unit): Self = StObject.set(x, "setDelegate", js.Any.fromFunction1(value))
  }
}
