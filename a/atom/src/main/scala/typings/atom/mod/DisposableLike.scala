package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisposableLike extends StObject {
  
  def dispose(): Unit
}
object DisposableLike {
  
  @scala.inline
  def apply(dispose: () => Unit): DisposableLike = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[DisposableLike]
  }
  
  @scala.inline
  implicit class DisposableLikeMutableBuilder[Self <: DisposableLike] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
  }
}
