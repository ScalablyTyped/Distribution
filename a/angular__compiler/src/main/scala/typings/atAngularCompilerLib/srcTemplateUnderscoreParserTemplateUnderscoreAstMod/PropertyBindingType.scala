package typings
package atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PropertyBindingType extends js.Object

@JSImport("@angular/compiler/src/template_parser/template_ast", "PropertyBindingType")
@js.native
object PropertyBindingType extends js.Object {
  @js.native
  sealed trait Animation
    extends atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.PropertyBindingType
  
  @js.native
  sealed trait Attribute
    extends atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.PropertyBindingType
  
  @js.native
  sealed trait Class
    extends atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.PropertyBindingType
  
  @js.native
  sealed trait Property
    extends atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.PropertyBindingType
  
  @js.native
  sealed trait Style
    extends atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.PropertyBindingType
  
  /* 4 */ val Animation: Animation with scala.Double = js.native
  /* 1 */ val Attribute: Attribute with scala.Double = js.native
  /* 2 */ val Class: Class with scala.Double = js.native
  /* 0 */ val Property: Property with scala.Double = js.native
  /* 3 */ val Style: Style with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.PropertyBindingType with scala.Double
  ] = js.native
}

