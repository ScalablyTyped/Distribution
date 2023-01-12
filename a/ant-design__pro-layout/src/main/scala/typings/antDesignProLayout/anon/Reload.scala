package typings.antDesignProLayout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reload extends StObject {
  
  def reload(): Unit
}
object Reload {
  
  inline def apply(reload: () => Unit): Reload = {
    val __obj = js.Dynamic.literal(reload = js.Any.fromFunction0(reload))
    __obj.asInstanceOf[Reload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Reload] (val x: Self) extends AnyVal {
    
    inline def setReload(value: () => Unit): Self = StObject.set(x, "reload", js.Any.fromFunction0(value))
  }
}
