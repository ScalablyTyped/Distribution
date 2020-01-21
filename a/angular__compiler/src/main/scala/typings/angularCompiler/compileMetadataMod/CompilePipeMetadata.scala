package typings.angularCompiler.compileMetadataMod

import typings.angularCompiler.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compile_metadata", "CompilePipeMetadata")
@js.native
class CompilePipeMetadata protected () extends js.Object {
  def this(hasTypeNamePure: AnonName) = this()
  var name: String = js.native
  var pure: Boolean = js.native
  var `type`: CompileTypeMetadata = js.native
  def toSummary(): CompilePipeSummary = js.native
}

