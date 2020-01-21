package typings.angularCompiler

import typings.angularCompiler.srcParseUtilMod.ParseError
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/parse_util", JSImport.Namespace)
@js.native
object parseUtilMod extends js.Object {
  @js.native
  class I18nError protected () extends ParseError {
    def this(span: ParseSourceSpan, msg: String) = this()
  }
  
}

