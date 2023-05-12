package typings.assertOptions

import typings.assertOptions.distSrcTypesMod.IOptionsErrorContext
import typings.assertOptions.distSrcTypesMod.NamedValues
import typings.assertOptions.distSrcTypesMod.OptionsError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHandlerMod {
  
  @JSImport("assert-options/dist/src/handler", "DefaultErrorHandler")
  @js.native
  open class DefaultErrorHandler ()
    extends StObject
       with IOptionsErrorHandler {
    
    /**
      * This method is normally expected to throw an error, based on "err"
      */
    /* CompleteClass */
    override def handle(err: OptionsError, ctx: IOptionsErrorContext): NamedValues = js.native
  }
  
  trait IOptionsErrorHandler extends StObject {
    
    /**
      * This method is normally expected to throw an error, based on "err"
      */
    def handle(err: OptionsError, ctx: IOptionsErrorContext): NamedValues
  }
  object IOptionsErrorHandler {
    
    inline def apply(handle: (OptionsError, IOptionsErrorContext) => NamedValues): IOptionsErrorHandler = {
      val __obj = js.Dynamic.literal(handle = js.Any.fromFunction2(handle))
      __obj.asInstanceOf[IOptionsErrorHandler]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOptionsErrorHandler] (val x: Self) extends AnyVal {
      
      inline def setHandle(value: (OptionsError, IOptionsErrorContext) => NamedValues): Self = StObject.set(x, "handle", js.Any.fromFunction2(value))
    }
  }
}
