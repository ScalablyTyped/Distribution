package typings
package atAngularCompilerLib.srcExpressionUnderscoreParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParsedPropertyType extends js.Object

@JSImport("@angular/compiler/src/expression_parser/ast", "ParsedPropertyType")
@js.native
object ParsedPropertyType extends js.Object {
  @js.native
  sealed trait ANIMATION
    extends atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedPropertyType
  
  @js.native
  sealed trait DEFAULT
    extends atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedPropertyType
  
  @js.native
  sealed trait LITERAL_ATTR
    extends atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedPropertyType
  
  /* 2 */ val ANIMATION: ANIMATION with scala.Double = js.native
  /* 0 */ val DEFAULT: DEFAULT with scala.Double = js.native
  /* 1 */ val LITERAL_ATTR: LITERAL_ATTR with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedPropertyType with scala.Double
  ] = js.native
}

