package typings.atAngularCompiler

import typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/static_symbol", JSImport.Namespace)
@js.native
object srcAotStaticUnderscoreSymbolMod extends js.Object {
  @js.native
  class StaticSymbol protected () extends js.Object {
    def this(filePath: String, name: String, members: js.Array[String]) = this()
    var filePath: String = js.native
    var members: js.Array[String] = js.native
    var name: String = js.native
    def assertNoMembers(): Unit = js.native
  }
  
  @js.native
  class StaticSymbolCache () extends js.Object {
    var cache: js.Any = js.native
    def get(declarationFile: String, name: String): StaticSymbol = js.native
    def get(declarationFile: String, name: String, members: js.Array[String]): StaticSymbol = js.native
  }
  
}

