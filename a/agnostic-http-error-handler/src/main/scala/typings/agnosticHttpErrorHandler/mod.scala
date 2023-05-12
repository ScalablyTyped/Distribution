package typings.agnosticHttpErrorHandler

import typings.agnosticHttpErrorHandler.anon.Express
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[Err, Req, Res, P, T](
    preErrorHandler: js.Function4[/* err */ Err, /* responsePayload */ P, /* req */ Req, /* res */ Res, T]
  ): Express[Err, Req, Res, T, P] = ^.asInstanceOf[js.Dynamic].apply(preErrorHandler.asInstanceOf[js.Any]).asInstanceOf[Express[Err, Req, Res, T, P]]
  
  @JSImport("agnostic-http-error-handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Data[T] extends StObject {
    
    def pipe(res: T): Any
  }
  object Data {
    
    inline def apply[T](pipe: T => Any): Data[T] = {
      val __obj = js.Dynamic.literal(pipe = js.Any.fromFunction1(pipe))
      __obj.asInstanceOf[Data[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data[?], T] (val x: Self & Data[T]) extends AnyVal {
      
      inline def setPipe(value: T => Any): Self = StObject.set(x, "pipe", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.agnosticHttpErrorHandler.agnosticHttpErrorHandlerBooleans.`false`
    - typings.agnosticHttpErrorHandler.agnosticHttpErrorHandlerInts.`0`
    - typings.agnosticHttpErrorHandler.agnosticHttpErrorHandlerStrings._empty
    - scala.Null
    - scala.Unit
  */
  type Falsy = js.UndefOr[_Falsy | Null]
  
  trait _Falsy extends StObject
}
