package typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/static_symbol", "StaticSymbol")
@js.native
class StaticSymbol protected () extends js.Object {
  def this(filePath: String, name: String, members: js.Array[String]) = this()
  var filePath: String = js.native
  var members: js.Array[String] = js.native
  var name: String = js.native
  def assertNoMembers(): Unit = js.native
}

