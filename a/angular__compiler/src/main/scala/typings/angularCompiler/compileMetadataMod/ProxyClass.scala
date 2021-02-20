package typings.angularCompiler.compileMetadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyClass extends StObject {
  
  def setDelegate(delegate: js.Any): Unit = js.native
}
object ProxyClass {
  
  @scala.inline
  def apply(setDelegate: js.Any => Unit): ProxyClass = {
    val __obj = js.Dynamic.literal(setDelegate = js.Any.fromFunction1(setDelegate))
    __obj.asInstanceOf[ProxyClass]
  }
  
  @scala.inline
  implicit class ProxyClassMutableBuilder[Self <: ProxyClass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetDelegate(value: js.Any => Unit): Self = StObject.set(x, "setDelegate", js.Any.fromFunction1(value))
  }
}
