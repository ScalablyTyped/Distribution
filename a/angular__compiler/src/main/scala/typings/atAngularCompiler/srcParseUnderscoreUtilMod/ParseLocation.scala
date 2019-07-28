package typings.atAngularCompiler.srcParseUnderscoreUtilMod

import typings.atAngularCompiler.Anon_After
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/parse_util", "ParseLocation")
@js.native
class ParseLocation protected () extends js.Object {
  def this(file: ParseSourceFile, offset: Double, line: Double, col: Double) = this()
  var col: Double = js.native
  var file: ParseSourceFile = js.native
  var line: Double = js.native
  var offset: Double = js.native
  def getContext(maxChars: Double, maxLines: Double): Anon_After | Null = js.native
  def moveBy(delta: Double): ParseLocation = js.native
}

