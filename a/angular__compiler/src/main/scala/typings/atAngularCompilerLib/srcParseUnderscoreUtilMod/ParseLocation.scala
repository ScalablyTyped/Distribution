package typings
package atAngularCompilerLib.srcParseUnderscoreUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/parse_util", "ParseLocation")
@js.native
class ParseLocation protected () extends js.Object {
  def this(file: ParseSourceFile, offset: scala.Double, line: scala.Double, col: scala.Double) = this()
  var col: scala.Double = js.native
  var file: ParseSourceFile = js.native
  var line: scala.Double = js.native
  var offset: scala.Double = js.native
  def getContext(maxChars: scala.Double, maxLines: scala.Double): atAngularCompilerLib.Anon_After | scala.Null = js.native
  def moveBy(delta: scala.Double): ParseLocation = js.native
}

