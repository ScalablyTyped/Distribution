package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "ParseLocation")
@js.native
class ParseLocation protected ()
  extends typings.angularCompiler.srcCompilerMod.ParseLocation {
  def this(
    file: typings.angularCompiler.srcParseUtilMod.ParseSourceFile,
    offset: Double,
    line: Double,
    col: Double
  ) = this()
}

