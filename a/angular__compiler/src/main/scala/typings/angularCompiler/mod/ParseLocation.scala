package typings.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "ParseLocation")
@js.native
class ParseLocation protected ()
  extends typings.angularCompiler.compilerMod.ParseLocation {
  def this(
    file: typings.angularCompiler.srcParseUtilMod.ParseSourceFile,
    offset: Double,
    line: Double,
    col: Double
  ) = this()
}

