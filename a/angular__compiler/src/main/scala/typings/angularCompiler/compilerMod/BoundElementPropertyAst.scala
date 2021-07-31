package typings.angularCompiler.compilerMod

import typings.angularCompiler.coreMod.SecurityContext
import typings.angularCompiler.templateAstMod.PropertyBindingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "BoundElementPropertyAst")
@js.native
class BoundElementPropertyAst protected ()
  extends typings.angularCompiler.publicApiMod.BoundElementPropertyAst {
  def this(
    name: String,
    `type`: PropertyBindingType,
    securityContext: SecurityContext,
    value: typings.angularCompiler.astMod.ASTWithSource,
    unit: String,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: PropertyBindingType,
    securityContext: SecurityContext,
    value: typings.angularCompiler.astMod.ASTWithSource,
    unit: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}
/* static members */
object BoundElementPropertyAst {
  
  @JSImport("@angular/compiler/compiler", "BoundElementPropertyAst")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromBoundProperty(prop: typings.angularCompiler.astMod.BoundElementProperty): typings.angularCompiler.templateAstMod.BoundElementPropertyAst = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundProperty")(prop.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.templateAstMod.BoundElementPropertyAst]
}
