package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoBootstrap extends StObject {
  
  def ngDoBootstrap(appRef: ApplicationRef): Unit
}
object DoBootstrap {
  
  inline def apply(ngDoBootstrap: ApplicationRef => Unit): DoBootstrap = {
    val __obj = js.Dynamic.literal(ngDoBootstrap = js.Any.fromFunction1(ngDoBootstrap))
    __obj.asInstanceOf[DoBootstrap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DoBootstrap] (val x: Self) extends AnyVal {
    
    inline def setNgDoBootstrap(value: ApplicationRef => Unit): Self = StObject.set(x, "ngDoBootstrap", js.Any.fromFunction1(value))
  }
}
