package typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/static_symbol", "StaticSymbolCache")
@js.native
class StaticSymbolCache () extends js.Object {
  var cache: js.Any = js.native
  def get(declarationFile: String, name: String): StaticSymbol = js.native
  def get(declarationFile: String, name: String, members: js.Array[String]): StaticSymbol = js.native
}

