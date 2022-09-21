package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "TmplAstTextAttribute")
@js.native
open class TmplAstTextAttribute protected ()
  extends StObject
     with TmplAstNode {
  def this(name: String, value: String, sourceSpan: ParseSourceSpan) = this()
  def this(name: String, value: String, sourceSpan: ParseSourceSpan, keySpan: ParseSourceSpan) = this()
  def this(
    name: String,
    value: String,
    sourceSpan: ParseSourceSpan,
    keySpan: Unit,
    valueSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    value: String,
    sourceSpan: ParseSourceSpan,
    keySpan: ParseSourceSpan,
    valueSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    value: String,
    sourceSpan: ParseSourceSpan,
    keySpan: Unit,
    valueSpan: Unit,
    i18n: I18nMeta2
  ) = this()
  def this(
    name: String,
    value: String,
    sourceSpan: ParseSourceSpan,
    keySpan: Unit,
    valueSpan: ParseSourceSpan,
    i18n: I18nMeta2
  ) = this()
  def this(
    name: String,
    value: String,
    sourceSpan: ParseSourceSpan,
    keySpan: ParseSourceSpan,
    valueSpan: Unit,
    i18n: I18nMeta2
  ) = this()
  def this(
    name: String,
    value: String,
    sourceSpan: ParseSourceSpan,
    keySpan: ParseSourceSpan,
    valueSpan: ParseSourceSpan,
    i18n: I18nMeta2
  ) = this()
  
  var i18n: js.UndefOr[I18nMeta2] = js.native
  
  val keySpan: js.UndefOr[ParseSourceSpan] = js.native
  
  var name: String = js.native
  
  /* CompleteClass */
  var sourceSpan: ParseSourceSpan = js.native
  
  var value: String = js.native
  
  var valueSpan: js.UndefOr[ParseSourceSpan] = js.native
  
  /* CompleteClass */
  override def visit[Result](visitor: Visitor3[Result]): Result = js.native
}
