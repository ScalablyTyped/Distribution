package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "TmplAstElement")
@js.native
open class TmplAstElement protected ()
  extends StObject
     with TmplAstNode {
  def this(
    name: String,
    attributes: js.Array[TmplAstTextAttribute],
    inputs: js.Array[TmplAstBoundAttribute],
    outputs: js.Array[TmplAstBoundEvent],
    children: js.Array[TmplAstNode],
    references: js.Array[TmplAstReference],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    attributes: js.Array[TmplAstTextAttribute],
    inputs: js.Array[TmplAstBoundAttribute],
    outputs: js.Array[TmplAstBoundEvent],
    children: js.Array[TmplAstNode],
    references: js.Array[TmplAstReference],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: ParseSourceSpan,
    endSourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    attributes: js.Array[TmplAstTextAttribute],
    inputs: js.Array[TmplAstBoundAttribute],
    outputs: js.Array[TmplAstBoundEvent],
    children: js.Array[TmplAstNode],
    references: js.Array[TmplAstReference],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: ParseSourceSpan,
    endSourceSpan: Null,
    i18n: I18nMeta2
  ) = this()
  def this(
    name: String,
    attributes: js.Array[TmplAstTextAttribute],
    inputs: js.Array[TmplAstBoundAttribute],
    outputs: js.Array[TmplAstBoundEvent],
    children: js.Array[TmplAstNode],
    references: js.Array[TmplAstReference],
    sourceSpan: ParseSourceSpan,
    startSourceSpan: ParseSourceSpan,
    endSourceSpan: ParseSourceSpan,
    i18n: I18nMeta2
  ) = this()
  
  var attributes: js.Array[TmplAstTextAttribute] = js.native
  
  var children: js.Array[TmplAstNode] = js.native
  
  var endSourceSpan: ParseSourceSpan | Null = js.native
  
  var i18n: js.UndefOr[I18nMeta2] = js.native
  
  var inputs: js.Array[TmplAstBoundAttribute] = js.native
  
  var name: String = js.native
  
  var outputs: js.Array[TmplAstBoundEvent] = js.native
  
  var references: js.Array[TmplAstReference] = js.native
  
  /* CompleteClass */
  var sourceSpan: ParseSourceSpan = js.native
  
  var startSourceSpan: ParseSourceSpan = js.native
  
  /* CompleteClass */
  override def visit[Result](visitor: Visitor3[Result]): Result = js.native
}
