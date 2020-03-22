package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "Token")
@js.native
class Token protected ()
  extends typings.angularCompiler.srcCompilerMod.Token {
  def this(
    index: Double,
    end: Double,
    `type`: typings.angularCompiler.lexerMod.TokenType,
    numValue: Double,
    strValue: String
  ) = this()
}

