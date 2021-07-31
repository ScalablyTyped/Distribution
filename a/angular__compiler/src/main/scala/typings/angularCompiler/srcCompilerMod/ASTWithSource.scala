package typings.angularCompiler.srcCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "ASTWithSource")
@js.native
class ASTWithSource protected ()
  extends typings.angularCompiler.astMod.ASTWithSource {
  def this(
    ast: typings.angularCompiler.astMod.AST,
    source: String,
    location: String,
    absoluteOffset: Double,
    errors: js.Array[typings.angularCompiler.astMod.ParserError]
  ) = this()
  def this(
    ast: typings.angularCompiler.astMod.AST,
    source: Null,
    location: String,
    absoluteOffset: Double,
    errors: js.Array[typings.angularCompiler.astMod.ParserError]
  ) = this()
}
