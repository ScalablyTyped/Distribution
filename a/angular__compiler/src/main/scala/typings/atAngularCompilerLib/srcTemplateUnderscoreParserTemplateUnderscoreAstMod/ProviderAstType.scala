package typings
package atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProviderAstType extends js.Object

@JSImport("@angular/compiler/src/template_parser/template_ast", "ProviderAstType")
@js.native
object ProviderAstType extends js.Object {
  @js.native
  sealed trait Builtin
    extends atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.ProviderAstType
  
  @js.native
  sealed trait Component
    extends atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.ProviderAstType
  
  @js.native
  sealed trait Directive
    extends atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.ProviderAstType
  
  @js.native
  sealed trait PrivateService
    extends atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.ProviderAstType
  
  @js.native
  sealed trait PublicService
    extends atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.ProviderAstType
  
  /* 4 */ val Builtin: Builtin with scala.Double = js.native
  /* 2 */ val Component: Component with scala.Double = js.native
  /* 3 */ val Directive: Directive with scala.Double = js.native
  /* 1 */ val PrivateService: PrivateService with scala.Double = js.native
  /* 0 */ val PublicService: PublicService with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.ProviderAstType with scala.Double
  ] = js.native
}

