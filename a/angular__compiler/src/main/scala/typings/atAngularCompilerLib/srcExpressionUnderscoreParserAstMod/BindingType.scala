package typings
package atAngularCompilerLib.srcExpressionUnderscoreParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BindingType extends js.Object

@JSImport("@angular/compiler/src/expression_parser/ast", "BindingType")
@js.native
object BindingType extends js.Object {
  @js.native
  sealed trait Animation
    extends atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.BindingType
  
  @js.native
  sealed trait Attribute
    extends atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.BindingType
  
  @js.native
  sealed trait Class
    extends atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.BindingType
  
  @js.native
  sealed trait Property
    extends atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.BindingType
  
  @js.native
  sealed trait Style
    extends atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.BindingType
  
  /* 4 */ val Animation: Animation with scala.Double = js.native
  /* 1 */ val Attribute: Attribute with scala.Double = js.native
  /* 2 */ val Class: Class with scala.Double = js.native
  /* 0 */ val Property: Property with scala.Double = js.native
  /* 3 */ val Style: Style with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.BindingType with scala.Double
  ] = js.native
}

