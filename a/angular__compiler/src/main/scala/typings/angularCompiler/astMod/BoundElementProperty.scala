package typings.angularCompiler.astMod

import typings.angularCompiler.coreMod.SecurityContext
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/expression_parser/ast", "BoundElementProperty")
@js.native
class BoundElementProperty protected () extends StObject {
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: ASTWithSource,
    unit: String,
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: ASTWithSource,
    unit: Null,
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: ASTWithSource,
    unit: String,
    sourceSpan: ParseSourceSpan,
    keySpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: ASTWithSource,
    unit: Null,
    sourceSpan: ParseSourceSpan,
    keySpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: ASTWithSource,
    unit: String,
    sourceSpan: ParseSourceSpan,
    keySpan: Unit,
    valueSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: ASTWithSource,
    unit: String,
    sourceSpan: ParseSourceSpan,
    keySpan: ParseSourceSpan,
    valueSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: ASTWithSource,
    unit: Null,
    sourceSpan: ParseSourceSpan,
    keySpan: Unit,
    valueSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: BindingType,
    securityContext: SecurityContext,
    value: ASTWithSource,
    unit: Null,
    sourceSpan: ParseSourceSpan,
    keySpan: ParseSourceSpan,
    valueSpan: ParseSourceSpan
  ) = this()
  
  val keySpan: js.UndefOr[ParseSourceSpan] = js.native
  
  var name: String = js.native
  
  var securityContext: SecurityContext = js.native
  
  var sourceSpan: ParseSourceSpan = js.native
  
  var `type`: BindingType = js.native
  
  var unit: String | Null = js.native
  
  var value: ASTWithSource = js.native
  
  var valueSpan: js.UndefOr[ParseSourceSpan] = js.native
}
