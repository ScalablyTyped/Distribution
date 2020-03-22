package typings.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "Token")
@js.native
class Token protected ()
  extends typings.angularCompiler.publicApiMod.Token {
  def this(
    index: Double,
    end: Double,
    `type`: typings.angularCompiler.lexerMod.TokenType,
    numValue: Double,
    strValue: String
  ) = this()
}

