package typings.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "Token")
@js.native
class Token protected ()
  extends typings.angularCompiler.lexerMod.Token {
  def this(
    index: Double,
    end: Double,
    `type`: typings.angularCompiler.lexerMod.TokenType,
    numValue: Double,
    strValue: String
  ) = this()
}

