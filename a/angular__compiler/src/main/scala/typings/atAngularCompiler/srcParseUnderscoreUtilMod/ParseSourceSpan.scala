package typings.atAngularCompiler.srcParseUnderscoreUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/parse_util", "ParseSourceSpan")
@js.native
class ParseSourceSpan protected () extends js.Object {
  def this(start: ParseLocation, end: ParseLocation) = this()
  def this(start: ParseLocation, end: ParseLocation, details: String) = this()
  var details: String | Null = js.native
  var end: ParseLocation = js.native
  var start: ParseLocation = js.native
}

