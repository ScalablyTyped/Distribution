package typings
package atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/static_symbol", "StaticSymbolCache")
@js.native
class StaticSymbolCache () extends js.Object {
  var cache: js.Any = js.native
  def get(declarationFile: java.lang.String, name: java.lang.String): StaticSymbol = js.native
  def get(declarationFile: java.lang.String, name: java.lang.String, members: js.Array[java.lang.String]): StaticSymbol = js.native
}

