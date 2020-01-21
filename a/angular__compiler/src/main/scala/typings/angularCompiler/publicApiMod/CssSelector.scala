package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "CssSelector")
@js.native
class CssSelector ()
  extends typings.angularCompiler.srcCompilerMod.CssSelector

/* static members */
@JSImport("@angular/compiler/public_api", "CssSelector")
@js.native
object CssSelector extends js.Object {
  def parse(selector: String): js.Array[typings.angularCompiler.selectorMod.CssSelector] = js.native
}

