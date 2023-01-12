package typings.async

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Arity extends StObject {
    
    var arity: js.UndefOr[Double] = js.undefined
  }
  object Arity {
    
    inline def apply(): Arity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Arity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Arity] (val x: Self) extends AnyVal {
      
      inline def setArity(value: Double): Self = StObject.set(x, "arity", value.asInstanceOf[js.Any])
      
      inline def setArityUndefined: Self = StObject.set(x, "arity", js.undefined)
    }
  }
  
  trait Error[E, T] extends StObject {
    
    var error: js.UndefOr[E] = js.undefined
    
    var value: js.UndefOr[T] = js.undefined
  }
  object Error {
    
    inline def apply[E, T](): Error[E, T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Error[E, T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Error[?, ?], E, T] (val x: Self & (Error[E, T])) extends AnyVal {
      
      inline def setError(value: E): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
