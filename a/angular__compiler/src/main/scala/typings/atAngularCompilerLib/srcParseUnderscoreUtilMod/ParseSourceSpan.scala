package typings
package atAngularCompilerLib.srcParseUnderscoreUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/parse_util", "ParseSourceSpan")
@js.native
class ParseSourceSpan protected () extends js.Object {
  def this(start: ParseLocation, end: ParseLocation) = this()
  def this(start: ParseLocation, end: ParseLocation, details: java.lang.String) = this()
  var details: java.lang.String | scala.Null = js.native
  var end: ParseLocation = js.native
  var start: ParseLocation = js.native
}

