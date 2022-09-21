package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "TmplAstBoundText")
@js.native
open class TmplAstBoundText protected ()
  extends StObject
     with TmplAstNode {
  def this(value: AST, sourceSpan: ParseSourceSpan) = this()
  def this(value: AST, sourceSpan: ParseSourceSpan, i18n: I18nMeta2) = this()
  
  var i18n: js.UndefOr[I18nMeta2] = js.native
  
  /* CompleteClass */
  var sourceSpan: ParseSourceSpan = js.native
  
  var value: AST = js.native
  
  /* CompleteClass */
  override def visit[Result](visitor: Visitor3[Result]): Result = js.native
}
