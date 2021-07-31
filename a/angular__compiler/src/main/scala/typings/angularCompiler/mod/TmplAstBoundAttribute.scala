package typings.angularCompiler.mod

import typings.angularCompiler.astMod.BindingType
import typings.angularCompiler.coreMod.SecurityContext
import typings.angularCompiler.i18nAstMod.I18nMeta
import typings.angularCompiler.r3AstMod.BoundAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "TmplAstBoundAttribute")
@js.native
class TmplAstBoundAttribute protected ()
  extends typings.angularCompiler.compilerMod.TmplAstBoundAttribute {
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typings.angularCompiler.astMod.AST,
    unit: String,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    keySpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typings.angularCompiler.astMod.AST,
    unit: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    keySpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typings.angularCompiler.astMod.AST,
    unit: String,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    keySpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typings.angularCompiler.astMod.AST,
    unit: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    keySpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typings.angularCompiler.astMod.AST,
    unit: String,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    keySpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: Unit,
    i18n: I18nMeta
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typings.angularCompiler.astMod.AST,
    unit: String,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    keySpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: I18nMeta
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typings.angularCompiler.astMod.AST,
    unit: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    keySpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: Unit,
    i18n: I18nMeta
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typings.angularCompiler.astMod.AST,
    unit: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    keySpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: I18nMeta
  ) = this()
}
/* static members */
object TmplAstBoundAttribute {
  
  @JSImport("@angular/compiler", "TmplAstBoundAttribute")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromBoundElementProperty(prop: typings.angularCompiler.astMod.BoundElementProperty): BoundAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundElementProperty")(prop.asInstanceOf[js.Any]).asInstanceOf[BoundAttribute]
  @scala.inline
  def fromBoundElementProperty(prop: typings.angularCompiler.astMod.BoundElementProperty, i18n: I18nMeta): BoundAttribute = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundElementProperty")(prop.asInstanceOf[js.Any], i18n.asInstanceOf[js.Any])).asInstanceOf[BoundAttribute]
}
