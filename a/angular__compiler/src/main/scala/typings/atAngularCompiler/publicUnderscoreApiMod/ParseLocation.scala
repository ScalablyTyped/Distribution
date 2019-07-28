package typings.atAngularCompiler.publicUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "ParseLocation")
@js.native
class ParseLocation protected ()
  extends typings.atAngularCompiler.srcCompilerMod.ParseLocation {
  def this(
    file: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceFile,
    offset: Double,
    line: Double,
    col: Double
  ) = this()
}

