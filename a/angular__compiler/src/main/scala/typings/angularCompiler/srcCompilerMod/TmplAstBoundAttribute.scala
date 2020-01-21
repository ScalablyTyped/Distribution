package typings.angularCompiler.srcCompilerMod

import typings.angularCompiler.astMod.BindingType
import typings.angularCompiler.coreMod.SecurityContext
import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.i18nAstMod.Node
import typings.angularCompiler.r3AstMod.BoundAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "TmplAstBoundAttribute")
@js.native
class TmplAstBoundAttribute protected () extends BoundAttribute {
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typings.angularCompiler.astMod.AST,
    unit: String,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typings.angularCompiler.astMod.AST,
    unit: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typings.angularCompiler.astMod.AST,
    unit: String,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typings.angularCompiler.astMod.AST,
    unit: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typings.angularCompiler.astMod.AST,
    unit: String,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: js.UndefOr[scala.Nothing],
    i18n: Message
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typings.angularCompiler.astMod.AST,
    unit: String,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: js.UndefOr[scala.Nothing],
    i18n: Node
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typings.angularCompiler.astMod.AST,
    unit: String,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typings.angularCompiler.astMod.AST,
    unit: String,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Node
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typings.angularCompiler.astMod.AST,
    unit: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: js.UndefOr[scala.Nothing],
    i18n: Message
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typings.angularCompiler.astMod.AST,
    unit: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: js.UndefOr[scala.Nothing],
    i18n: Node
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typings.angularCompiler.astMod.AST,
    unit: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typings.angularCompiler.astMod.AST,
    unit: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Node
  ) = this()
}

/* static members */
@JSImport("@angular/compiler/src/compiler", "TmplAstBoundAttribute")
@js.native
object TmplAstBoundAttribute extends js.Object {
  def fromBoundElementProperty(prop: typings.angularCompiler.astMod.BoundElementProperty): BoundAttribute = js.native
  def fromBoundElementProperty(
    prop: typings.angularCompiler.astMod.BoundElementProperty,
    i18n: typings.angularCompiler.i18nAstMod.AST
  ): BoundAttribute = js.native
}

