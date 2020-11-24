package typings.angularCompiler.r3AstMod

import typings.angularCompiler.astMod.AST
import typings.angularCompiler.astMod.BindingType
import typings.angularCompiler.astMod.BoundElementProperty
import typings.angularCompiler.coreMod.SecurityContext
import typings.angularCompiler.i18nAstMod.I18nMeta
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/render3/r3_ast", "BoundAttribute")
@js.native
class BoundAttribute protected () extends Node {
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
    valueSpan: js.UndefOr[scala.Nothing],
    i18n: I18nMeta
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
    i18n: I18nMeta
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: AST,
    unit: Null,
    sourceSpan: ParseSourceSpan,
    keySpan: ParseSourceSpan,
    valueSpan: js.UndefOr[scala.Nothing],
    i18n: I18nMeta
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
    i18n: I18nMeta
  ) = this()
  
  var i18n: js.UndefOr[I18nMeta] = js.native
  
  val keySpan: ParseSourceSpan = js.native
  
  var name: String = js.native
  
  var securityContext: SecurityContext = js.native
  
  var `type`: BindingType = js.native
  
  var unit: String | Null = js.native
  
  var value: AST = js.native
  
  var valueSpan: js.UndefOr[ParseSourceSpan] = js.native
}
/* static members */
@JSImport("@angular/compiler/src/render3/r3_ast", "BoundAttribute")
@js.native
object BoundAttribute extends js.Object {
  
  def fromBoundElementProperty(prop: BoundElementProperty): BoundAttribute = js.native
  def fromBoundElementProperty(prop: BoundElementProperty, i18n: I18nMeta): BoundAttribute = js.native
}
