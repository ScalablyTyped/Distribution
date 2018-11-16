package typings
package atAngularCompilerLib.srcExpressionUnderscoreParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParsedEventType extends js.Object

@JSImport("@angular/compiler/src/expression_parser/ast", "ParsedEventType")
@js.native
object ParsedEventType extends js.Object {
  @js.native
  sealed trait Animation
    extends atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedEventType
  
  @js.native
  sealed trait Regular
    extends atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedEventType
  
  /* 1 */ val Animation: Animation with scala.Double = js.native
  /* 0 */ val Regular: Regular with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedEventType with scala.Double
  ] = js.native
}

