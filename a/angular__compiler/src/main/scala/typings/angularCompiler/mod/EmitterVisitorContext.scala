package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "EmitterVisitorContext")
@js.native
class EmitterVisitorContext protected ()
  extends typings.angularCompiler.compilerMod.EmitterVisitorContext {
  def this(_indent: Double) = this()
}
/* static members */
object EmitterVisitorContext {
  
  @JSImport("@angular/compiler", "EmitterVisitorContext")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRoot(): typings.angularCompiler.abstractEmitterMod.EmitterVisitorContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createRoot")().asInstanceOf[typings.angularCompiler.abstractEmitterMod.EmitterVisitorContext]
}
