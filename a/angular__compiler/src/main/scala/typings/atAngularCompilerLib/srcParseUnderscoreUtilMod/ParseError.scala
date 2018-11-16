package typings
package atAngularCompilerLib.srcParseUnderscoreUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/parse_util", "ParseError")
@js.native
class ParseError protected () extends js.Object {
  def this(span: ParseSourceSpan, msg: java.lang.String) = this()
  def this(span: ParseSourceSpan, msg: java.lang.String, level: ParseErrorLevel) = this()
  var level: ParseErrorLevel = js.native
  var msg: java.lang.String = js.native
  var span: ParseSourceSpan = js.native
  def contextualMessage(): java.lang.String = js.native
}

