package typings.angularCompiler.compileMetadataMod

import typings.angularCompiler.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compile_metadata", "CompilePipeMetadata")
@js.native
class CompilePipeMetadata protected () extends js.Object {
  def this(hasTypeNamePure: Name) = this()
  
  var name: String = js.native
  
  var pure: Boolean = js.native
  
  def toSummary(): CompilePipeSummary = js.native
  
  var `type`: CompileTypeMetadata = js.native
}
