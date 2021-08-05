package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisposableLike extends StObject {
  
  def dispose(): Unit
}
object DisposableLike {
  
  inline def apply(dispose: () => Unit): DisposableLike = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[DisposableLike]
  }
  
  extension [Self <: DisposableLike](x: Self) {
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
  }
}
