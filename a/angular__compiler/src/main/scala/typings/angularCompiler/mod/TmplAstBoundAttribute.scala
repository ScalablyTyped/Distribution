package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "TmplAstBoundAttribute")
@js.native
open class TmplAstBoundAttribute protected ()
  extends StObject
     with TmplAstNode {
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: AST,
    unit: String,
    sourceSpan: ParseSourceSpan,
    keySpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: AST,
    unit: Null,
    sourceSpan: ParseSourceSpan,
    keySpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: AST,
    unit: String,
    sourceSpan: ParseSourceSpan,
    keySpan: ParseSourceSpan,
    valueSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: AST,
    unit: Null,
    sourceSpan: ParseSourceSpan,
    keySpan: ParseSourceSpan,
    valueSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: AST,
    unit: String,
    sourceSpan: ParseSourceSpan,
    keySpan: ParseSourceSpan,
    valueSpan: Unit,
    i18n: I18nMeta2
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: AST,
    unit: String,
    sourceSpan: ParseSourceSpan,
    keySpan: ParseSourceSpan,
    valueSpan: ParseSourceSpan,
    i18n: I18nMeta2
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: AST,
    unit: Null,
    sourceSpan: ParseSourceSpan,
    keySpan: ParseSourceSpan,
    valueSpan: Unit,
    i18n: I18nMeta2
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: AST,
    unit: Null,
    sourceSpan: ParseSourceSpan,
    keySpan: ParseSourceSpan,
    valueSpan: ParseSourceSpan,
    i18n: I18nMeta2
  ) = this()
  
  var i18n: js.UndefOr[I18nMeta2] = js.native
  
  val keySpan: ParseSourceSpan = js.native
  
  var name: String = js.native
  
  var securityContext: SecurityContext = js.native
  
  /* CompleteClass */
  var sourceSpan: ParseSourceSpan = js.native
  
  var `type`: BindingType = js.native
  
  var unit: String | Null = js.native
  
  var value: AST = js.native
  
  var valueSpan: js.UndefOr[ParseSourceSpan] = js.native
  
  /* CompleteClass */
  override def visit[Result](visitor: Visitor3[Result]): Result = js.native
}
/* static members */
object TmplAstBoundAttribute {
  
  @JSImport("@angular/compiler", "TmplAstBoundAttribute")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromBoundElementProperty(prop: BoundElementProperty): TmplAstBoundAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundElementProperty")(prop.asInstanceOf[js.Any]).asInstanceOf[TmplAstBoundAttribute]
  inline def fromBoundElementProperty(prop: BoundElementProperty, i18n: I18nMeta2): TmplAstBoundAttribute = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundElementProperty")(prop.asInstanceOf[js.Any], i18n.asInstanceOf[js.Any])).asInstanceOf[TmplAstBoundAttribute]
}
