package typings.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/compiler", "CssSelector")
@js.native
class CssSelector ()
  extends typings.angularCompiler.publicApiMod.CssSelector

/* static members */
@JSImport("@angular/compiler/compiler", "CssSelector")
@js.native
object CssSelector extends js.Object {
  def parse(selector: String): js.Array[typings.angularCompiler.selectorMod.CssSelector] = js.native
}

