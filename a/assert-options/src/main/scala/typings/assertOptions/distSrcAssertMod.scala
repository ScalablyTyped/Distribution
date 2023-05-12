package typings.assertOptions

import typings.assertOptions.distSrcHandlerMod.IOptionsErrorHandler
import typings.assertOptions.distSrcTypesMod.AssertFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAssertMod {
  
  @JSImport("assert-options/dist/src/assert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("assert-options/dist/src/assert", "assertOptions")
  @js.native
  val assertOptions: AssertFunc = js.native
  
  inline def createAssert(errHandler: IOptionsErrorHandler): AssertFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("createAssert")(errHandler.asInstanceOf[js.Any]).asInstanceOf[AssertFunc]
}
