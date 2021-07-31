package typings.angularCompiler.publicApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "EmitterVisitorContext")
@js.native
class EmitterVisitorContext protected ()
  extends typings.angularCompiler.srcCompilerMod.EmitterVisitorContext {
  def this(_indent: Double) = this()
}
/* static members */
object EmitterVisitorContext {
  
  @JSImport("@angular/compiler/public_api", "EmitterVisitorContext")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createRoot(): typings.angularCompiler.abstractEmitterMod.EmitterVisitorContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createRoot")().asInstanceOf[typings.angularCompiler.abstractEmitterMod.EmitterVisitorContext]
}
