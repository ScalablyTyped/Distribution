package typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParsedPropertyType extends js.Object

@JSImport("@angular/compiler/src/expression_parser/ast", "ParsedPropertyType")
@js.native
object ParsedPropertyType extends js.Object {
  @js.native
  sealed trait ANIMATION extends ParsedPropertyType
  
  @js.native
  sealed trait DEFAULT extends ParsedPropertyType
  
  @js.native
  sealed trait LITERAL_ATTR extends ParsedPropertyType
  
  /* 2 */ val ANIMATION: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParsedPropertyType.ANIMATION with Double = js.native
  /* 0 */ val DEFAULT: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParsedPropertyType.DEFAULT with Double = js.native
  /* 1 */ val LITERAL_ATTR: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParsedPropertyType.LITERAL_ATTR with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParsedPropertyType with Double] = js.native
}

