package typings.angularCompiler.publicApiMod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.viewCompilerMod.ParsedHostBindings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "parseHostBindings")
@js.native
object parseHostBindings extends js.Object {
  def apply(host: StringDictionary[String | typings.angularCompiler.outputAstMod.Expression]): ParsedHostBindings = js.native
}

