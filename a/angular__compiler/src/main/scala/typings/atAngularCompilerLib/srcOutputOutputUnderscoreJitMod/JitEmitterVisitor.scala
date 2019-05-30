package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreJitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_jit", "JitEmitterVisitor")
@js.native
class JitEmitterVisitor protected ()
  extends atAngularCompilerLib.srcOutputAbstractUnderscoreJsUnderscoreEmitterMod.AbstractJsEmitterVisitor {
  def this(reflector: atAngularCompilerLib.srcCompileUnderscoreReflectorMod.CompileReflector) = this()
  var _emitReferenceToExternal: js.Any = js.native
  var _evalArgNames: js.Any = js.native
  var _evalArgValues: js.Any = js.native
  var _evalExportedVars: js.Any = js.native
  var reflector: js.Any = js.native
  def createReturnStmt(ctx: atAngularCompilerLib.srcOutputAbstractUnderscoreEmitterMod.EmitterVisitorContext): scala.Unit = js.native
  def getArgs(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
}

