package typings.angularHttpAuth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Reject extends StObject {
    
    def reject(data: Any): Unit
    
    def resolve(data: Any): Unit
  }
  object Reject {
    
    inline def apply(reject: Any => Unit, resolve: Any => Unit): Reject = {
      val __obj = js.Dynamic.literal(reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[Reject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Reject] (val x: Self) extends AnyVal {
      
      inline def setReject(value: Any => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      inline def setResolve(value: Any => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
}
