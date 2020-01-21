package typings.angularCompiler.i18nAstMod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/i18n_ast", "TagPlaceholder")
@js.native
class TagPlaceholder protected () extends Node {
  def this(
    tag: String,
    attrs: StringDictionary[String],
    startName: String,
    closeName: String,
    children: js.Array[Node],
    isVoid: Boolean,
    sourceSpan: ParseSourceSpan
  ) = this()
  var attrs: StringDictionary[String] = js.native
  var children: js.Array[Node] = js.native
  var closeName: String = js.native
  var isVoid: Boolean = js.native
  var startName: String = js.native
  var tag: String = js.native
}

