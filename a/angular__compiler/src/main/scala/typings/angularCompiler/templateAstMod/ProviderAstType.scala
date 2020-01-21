package typings.angularCompiler.templateAstMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProviderAstType extends js.Object

@JSImport("@angular/compiler/src/template_parser/template_ast", "ProviderAstType")
@js.native
object ProviderAstType extends js.Object {
  @js.native
  sealed trait Builtin extends ProviderAstType
  
  @js.native
  sealed trait Component extends ProviderAstType
  
  @js.native
  sealed trait Directive extends ProviderAstType
  
  @js.native
  sealed trait PrivateService extends ProviderAstType
  
  @js.native
  sealed trait PublicService extends ProviderAstType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProviderAstType with Double] = js.native
  /* 4 */ @js.native
  object Builtin extends TopLevel[Builtin with Double]
  
  /* 2 */ @js.native
  object Component extends TopLevel[Component with Double]
  
  /* 3 */ @js.native
  object Directive extends TopLevel[Directive with Double]
  
  /* 1 */ @js.native
  object PrivateService extends TopLevel[PrivateService with Double]
  
  /* 0 */ @js.native
  object PublicService extends TopLevel[PublicService with Double]
  
}

