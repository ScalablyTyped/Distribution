package typings.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/compiler", "EmitterVisitorContext")
@js.native
class EmitterVisitorContext protected ()
  extends typings.angularCompiler.publicApiMod.EmitterVisitorContext {
  def this(_indent: Double) = this()
}

/* static members */
@JSImport("@angular/compiler/compiler", "EmitterVisitorContext")
@js.native
object EmitterVisitorContext extends js.Object {
  def createRoot(): typings.angularCompiler.abstractEmitterMod.EmitterVisitorContext = js.native
}

