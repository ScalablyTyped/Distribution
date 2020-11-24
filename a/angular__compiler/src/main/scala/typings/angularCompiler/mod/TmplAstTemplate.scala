package typings.angularCompiler.mod

import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.r3AstMod.BoundAttribute
import typings.angularCompiler.r3AstMod.BoundEvent
import typings.angularCompiler.r3AstMod.Node
import typings.angularCompiler.r3AstMod.Reference
import typings.angularCompiler.r3AstMod.TextAttribute
import typings.angularCompiler.r3AstMod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "TmplAstTemplate")
@js.native
class TmplAstTemplate protected ()
  extends typings.angularCompiler.compilerMod.TmplAstTemplate {
  def this(
    tagName: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    templateAttrs: js.Array[BoundAttribute | TextAttribute],
    children: js.Array[Node],
    references: js.Array[Reference],
    variables: js.Array[Variable],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    startSourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
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
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    startSourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    endSourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
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
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    startSourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
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
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    startSourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
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
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    startSourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    endSourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
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
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    startSourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    endSourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: typings.angularCompiler.i18nAstMod.Node
  ) = this()
}
