package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoBootstrap extends StObject {
  
  def ngDoBootstrap(appRef: ApplicationRef): Unit = js.native
}
object DoBootstrap {
  
  @scala.inline
  def apply(ngDoBootstrap: ApplicationRef => Unit): DoBootstrap = {
    val __obj = js.Dynamic.literal(ngDoBootstrap = js.Any.fromFunction1(ngDoBootstrap))
    __obj.asInstanceOf[DoBootstrap]
  }
  
  @scala.inline
  implicit class DoBootstrapMutableBuilder[Self <: DoBootstrap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNgDoBootstrap(value: ApplicationRef => Unit): Self = StObject.set(x, "ngDoBootstrap", js.Any.fromFunction1(value))
  }
}
