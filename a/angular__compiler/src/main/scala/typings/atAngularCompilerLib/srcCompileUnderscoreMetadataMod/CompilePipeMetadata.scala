package typings
package atAngularCompilerLib.srcCompileUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compile_metadata", "CompilePipeMetadata")
@js.native
class CompilePipeMetadata protected () extends js.Object {
  def this(hasTypeNamePure: atAngularCompilerLib.Anon_TypeName) = this()
  var name: java.lang.String = js.native
  var pure: scala.Boolean = js.native
  var `type`: CompileTypeMetadata = js.native
  def toSummary(): CompilePipeSummary = js.native
}

