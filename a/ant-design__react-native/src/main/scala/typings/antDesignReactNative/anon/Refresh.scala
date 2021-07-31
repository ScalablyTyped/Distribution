package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Refresh extends StObject {
  
  def refresh(): Unit
}
object Refresh {
  
  @scala.inline
  def apply(refresh: () => Unit): Refresh = {
    val __obj = js.Dynamic.literal(refresh = js.Any.fromFunction0(refresh))
    __obj.asInstanceOf[Refresh]
  }
  
  @scala.inline
  implicit class RefreshMutableBuilder[Self <: Refresh] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
  }
}
