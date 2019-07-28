package typings.atAngularCompiler.srcOutputOutputUnderscoreJitMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularCompiler.srcCompileUnderscoreReflectorMod.CompileReflector
import typings.atAngularCompiler.srcOutputAbstractUnderscoreEmitterMod.EmitterVisitorContext
import typings.atAngularCompiler.srcOutputAbstractUnderscoreJsUnderscoreEmitterMod.AbstractJsEmitterVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_jit", "JitEmitterVisitor")
@js.native
class JitEmitterVisitor protected () extends AbstractJsEmitterVisitor {
  def this(reflector: CompileReflector) = this()
  var _emitReferenceToExternal: js.Any = js.native
  var _evalArgNames: js.Any = js.native
  var _evalArgValues: js.Any = js.native
  var _evalExportedVars: js.Any = js.native
  var reflector: js.Any = js.native
  def createReturnStmt(ctx: EmitterVisitorContext): Unit = js.native
  def getArgs(): StringDictionary[js.Any] = js.native
}

