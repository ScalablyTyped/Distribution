package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "EmitterVisitorContext")
@js.native
class EmitterVisitorContext protected ()
  extends typings.angularCompiler.srcCompilerMod.EmitterVisitorContext {
  def this(_indent: Double) = this()
}

/* static members */
@JSImport("@angular/compiler/public_api", "EmitterVisitorContext")
@js.native
object EmitterVisitorContext extends js.Object {
  def createRoot(): typings.angularCompiler.abstractEmitterMod.EmitterVisitorContext = js.native
}

