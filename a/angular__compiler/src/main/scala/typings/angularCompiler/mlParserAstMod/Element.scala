package typings.angularCompiler.mlParserAstMod

import typings.angularCompiler.i18nAstMod.I18nMeta
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/ml_parser/ast", "Element")
@js.native
class Element protected () extends NodeWithI18n {
  def this(
    name: String,
    attrs: js.Array[Attribute],
    children: js.Array[Node],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    attrs: js.Array[Attribute],
    children: js.Array[Node],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: ParseSourceSpan,
    endSourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    attrs: js.Array[Attribute],
    children: js.Array[Node],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: ParseSourceSpan,
    endSourceSpan: js.UndefOr[scala.Nothing],
    i18n: I18nMeta
  ) = this()
  def this(
    name: String,
    attrs: js.Array[Attribute],
    children: js.Array[Node],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: ParseSourceSpan,
    endSourceSpan: Null,
    i18n: I18nMeta
  ) = this()
  def this(
    name: String,
    attrs: js.Array[Attribute],
    children: js.Array[Node],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: ParseSourceSpan,
    endSourceSpan: ParseSourceSpan,
    i18n: I18nMeta
  ) = this()
  
  var attrs: js.Array[Attribute] = js.native
  
  var children: js.Array[Node] = js.native
  
  var endSourceSpan: ParseSourceSpan | Null = js.native
  
  var name: String = js.native
  
  var startSourceSpan: ParseSourceSpan = js.native
}
