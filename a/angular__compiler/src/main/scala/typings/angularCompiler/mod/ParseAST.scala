package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "_ParseAST")
@js.native
class ParseAST protected ()
  extends typings.angularCompiler.compilerMod.ParseAST {
  def this(
    input: String,
    location: js.Any,
    absoluteOffset: Double,
    tokens: js.Array[typings.angularCompiler.lexerMod.Token],
    inputLength: Double,
    parseAction: Boolean,
    errors: js.Array[typings.angularCompiler.astMod.ParserError],
    offset: Double
  ) = this()
}
