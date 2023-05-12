package typings.assertOptions

import typings.assertOptions.distSrcHandlerMod.IOptionsErrorHandler
import typings.assertOptions.distSrcTypesMod.AssertFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("assert-options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("assert-options", "DefaultErrorHandler")
  @js.native
  open class DefaultErrorHandler ()
    extends typings.assertOptions.distSrcHandlerMod.DefaultErrorHandler
  
  @JSImport("assert-options", "OptionsError")
  @js.native
  object OptionsError extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.assertOptions.distSrcTypesMod.OptionsError & Double] = js.native
    
    /* 1 */ val invalidDefaultsParam: typings.assertOptions.distSrcTypesMod.OptionsError.invalidDefaultsParam & Double = js.native
    
    /* 0 */ val invalidOptionsParam: typings.assertOptions.distSrcTypesMod.OptionsError.invalidOptionsParam & Double = js.native
    
    /* 2 */ val optionNotRecognized: typings.assertOptions.distSrcTypesMod.OptionsError.optionNotRecognized & Double = js.native
  }
  
  @JSImport("assert-options", "assertOptions")
  @js.native
  val assertOptions: AssertFunc = js.native
  
  inline def createAssert(errHandler: IOptionsErrorHandler): AssertFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("createAssert")(errHandler.asInstanceOf[js.Any]).asInstanceOf[AssertFunc]
}
