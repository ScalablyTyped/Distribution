package typings.angularCompiler.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "TmplAstIcu")
@js.native
open class TmplAstIcu protected ()
  extends StObject
     with TmplAstNode {
  def this(
    vars: StringDictionary[TmplAstBoundText],
    placeholders: StringDictionary[TmplAstText | TmplAstBoundText],
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    vars: StringDictionary[TmplAstBoundText],
    placeholders: StringDictionary[TmplAstText | TmplAstBoundText],
    sourceSpan: ParseSourceSpan,
    i18n: I18nMeta2
  ) = this()
  
  var i18n: js.UndefOr[I18nMeta2] = js.native
  
  var placeholders: StringDictionary[TmplAstText | TmplAstBoundText] = js.native
  
  /* CompleteClass */
  var sourceSpan: ParseSourceSpan = js.native
  
  var vars: StringDictionary[TmplAstBoundText] = js.native
  
  /* CompleteClass */
  override def visit[Result](visitor: Visitor3[Result]): Result = js.native
}
