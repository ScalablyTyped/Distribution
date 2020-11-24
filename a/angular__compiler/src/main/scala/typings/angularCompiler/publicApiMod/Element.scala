package typings.angularCompiler.publicApiMod

import typings.angularCompiler.i18nAstMod.I18nMeta
import typings.angularCompiler.mlParserAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "Element")
@js.native
class Element protected ()
  extends typings.angularCompiler.srcCompilerMod.Element {
  def this(
    name: String,
    attrs: js.Array[typings.angularCompiler.mlParserAstMod.Attribute],
    children: js.Array[Node],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    startSourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    attrs: js.Array[typings.angularCompiler.mlParserAstMod.Attribute],
    children: js.Array[Node],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    startSourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    endSourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    attrs: js.Array[typings.angularCompiler.mlParserAstMod.Attribute],
    children: js.Array[Node],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    startSourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    endSourceSpan: js.UndefOr[scala.Nothing],
    i18n: I18nMeta
  ) = this()
  def this(
    name: String,
    attrs: js.Array[typings.angularCompiler.mlParserAstMod.Attribute],
    children: js.Array[Node],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    startSourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    endSourceSpan: Null,
    i18n: I18nMeta
  ) = this()
  def this(
    name: String,
    attrs: js.Array[typings.angularCompiler.mlParserAstMod.Attribute],
    children: js.Array[Node],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    startSourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    endSourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: I18nMeta
  ) = this()
}
