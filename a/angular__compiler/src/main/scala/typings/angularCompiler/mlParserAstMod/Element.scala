package typings.angularCompiler.mlParserAstMod

import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/ast", "Element")
@js.native
class Element protected () extends Node {
  def this(name: String, attrs: js.Array[Attribute], children: js.Array[Node], sourceSpan: ParseSourceSpan) = this()
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
    startSourceSpan: Null,
    endSourceSpan: ParseSourceSpan
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
    startSourceSpan: Null,
    endSourceSpan: Null,
    i18n: Message
  ) = this()
  def this(
    name: String,
    attrs: js.Array[Attribute],
    children: js.Array[Node],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: Null,
    endSourceSpan: Null,
    i18n: typings.angularCompiler.i18nAstMod.Node
  ) = this()
  def this(
    name: String,
    attrs: js.Array[Attribute],
    children: js.Array[Node],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: Null,
    endSourceSpan: ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    name: String,
    attrs: js.Array[Attribute],
    children: js.Array[Node],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: Null,
    endSourceSpan: ParseSourceSpan,
    i18n: typings.angularCompiler.i18nAstMod.Node
  ) = this()
  def this(
    name: String,
    attrs: js.Array[Attribute],
    children: js.Array[Node],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: ParseSourceSpan,
    endSourceSpan: Null,
    i18n: Message
  ) = this()
  def this(
    name: String,
    attrs: js.Array[Attribute],
    children: js.Array[Node],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: ParseSourceSpan,
    endSourceSpan: Null,
    i18n: typings.angularCompiler.i18nAstMod.Node
  ) = this()
  def this(
    name: String,
    attrs: js.Array[Attribute],
    children: js.Array[Node],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: ParseSourceSpan,
    endSourceSpan: ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    name: String,
    attrs: js.Array[Attribute],
    children: js.Array[Node],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: ParseSourceSpan,
    endSourceSpan: ParseSourceSpan,
    i18n: typings.angularCompiler.i18nAstMod.Node
  ) = this()
  var attrs: js.Array[Attribute] = js.native
  var children: js.Array[Node] = js.native
  var endSourceSpan: ParseSourceSpan | Null = js.native
  var i18n: js.UndefOr[Message | typings.angularCompiler.i18nAstMod.Node] = js.native
  var name: String = js.native
  /* CompleteClass */
  override var sourceSpan: ParseSourceSpan = js.native
  var startSourceSpan: ParseSourceSpan | Null = js.native
  /* CompleteClass */
  override def visit(visitor: Visitor, context: js.Any): js.Any = js.native
}

