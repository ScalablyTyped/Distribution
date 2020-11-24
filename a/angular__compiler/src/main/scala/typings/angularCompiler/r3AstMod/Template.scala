package typings.angularCompiler.r3AstMod

import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/render3/r3_ast", "Template")
@js.native
class Template protected () extends Node {
  def this(
    tagName: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    templateAttrs: js.Array[BoundAttribute | TextAttribute],
    children: js.Array[Node],
    references: js.Array[Reference],
    variables: js.Array[Variable],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: ParseSourceSpan
  ) = this()
  def this(
    tagName: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    templateAttrs: js.Array[BoundAttribute | TextAttribute],
    children: js.Array[Node],
    references: js.Array[Reference],
    variables: js.Array[Variable],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: ParseSourceSpan,
    endSourceSpan: ParseSourceSpan
  ) = this()
  def this(
    tagName: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    templateAttrs: js.Array[BoundAttribute | TextAttribute],
    children: js.Array[Node],
    references: js.Array[Reference],
    variables: js.Array[Variable],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: ParseSourceSpan,
    endSourceSpan: Null,
    i18n: Message
  ) = this()
  def this(
    tagName: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    templateAttrs: js.Array[BoundAttribute | TextAttribute],
    children: js.Array[Node],
    references: js.Array[Reference],
    variables: js.Array[Variable],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: ParseSourceSpan,
    endSourceSpan: Null,
    i18n: typings.angularCompiler.i18nAstMod.Node
  ) = this()
  def this(
    tagName: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    templateAttrs: js.Array[BoundAttribute | TextAttribute],
    children: js.Array[Node],
    references: js.Array[Reference],
    variables: js.Array[Variable],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: ParseSourceSpan,
    endSourceSpan: ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    tagName: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    templateAttrs: js.Array[BoundAttribute | TextAttribute],
    children: js.Array[Node],
    references: js.Array[Reference],
    variables: js.Array[Variable],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: ParseSourceSpan,
    endSourceSpan: ParseSourceSpan,
    i18n: typings.angularCompiler.i18nAstMod.Node
  ) = this()
  
  var attributes: js.Array[TextAttribute] = js.native
  
  var children: js.Array[Node] = js.native
  
  var endSourceSpan: ParseSourceSpan | Null = js.native
  
  var i18n: js.UndefOr[Message | typings.angularCompiler.i18nAstMod.Node] = js.native
  
  var inputs: js.Array[BoundAttribute] = js.native
  
  var outputs: js.Array[BoundEvent] = js.native
  
  var references: js.Array[Reference] = js.native
  
  var startSourceSpan: ParseSourceSpan = js.native
  
  var tagName: String = js.native
  
  var templateAttrs: js.Array[BoundAttribute | TextAttribute] = js.native
  
  var variables: js.Array[Variable] = js.native
}
