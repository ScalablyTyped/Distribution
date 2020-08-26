package typings.angularCompiler.mod

import typings.angularCompiler.astMod.BindingType
import typings.angularCompiler.coreMod.SecurityContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "BoundElementProperty")
@js.native
class BoundElementProperty protected ()
  extends typings.angularCompiler.compilerMod.BoundElementProperty {
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typings.angularCompiler.astMod.ASTWithSource,
    unit: String,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typings.angularCompiler.astMod.ASTWithSource,
    unit: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typings.angularCompiler.astMod.ASTWithSource,
    unit: String,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: typings.angularCompiler.astMod.ASTWithSource,
    unit: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

