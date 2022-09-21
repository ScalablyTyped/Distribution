package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "TmplAstContent")
@js.native
open class TmplAstContent protected ()
  extends StObject
     with TmplAstNode {
  def this(selector: String, attributes: js.Array[TmplAstTextAttribute], sourceSpan: ParseSourceSpan) = this()
  def this(
    selector: String,
    attributes: js.Array[TmplAstTextAttribute],
    sourceSpan: ParseSourceSpan,
    i18n: I18nMeta2
  ) = this()
  
  var attributes: js.Array[TmplAstTextAttribute] = js.native
  
  var i18n: js.UndefOr[I18nMeta2] = js.native
  
  val name: /* "ng-content" */ String = js.native
  
  var selector: String = js.native
  
  /* CompleteClass */
  var sourceSpan: ParseSourceSpan = js.native
  
  /* CompleteClass */
  override def visit[Result](visitor: Visitor3[Result]): Result = js.native
}
