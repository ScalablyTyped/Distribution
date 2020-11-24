package typings.angularCompiler.cssLexerMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CssTokenType extends js.Object
@JSImport("@angular/compiler/src/css_parser/css_lexer", "CssTokenType")
@js.native
object CssTokenType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CssTokenType with Double] = js.native
  
  @js.native
  sealed trait AtKeyword extends CssTokenType
  /* 6 */ @js.native
  object AtKeyword extends TopLevel[AtKeyword with Double]
  
  @js.native
  sealed trait Character extends CssTokenType
  /* 7 */ @js.native
  object Character extends TopLevel[Character with Double]
  
  @js.native
  sealed trait Comment extends CssTokenType
  /* 2 */ @js.native
  object Comment extends TopLevel[Comment with Double]
  
  @js.native
  sealed trait EOF extends CssTokenType
  /* 0 */ @js.native
  object EOF extends TopLevel[EOF with Double]
  
  @js.native
  sealed trait Identifier extends CssTokenType
  /* 3 */ @js.native
  object Identifier extends TopLevel[Identifier with Double]
  
  @js.native
  sealed trait IdentifierOrNumber extends CssTokenType
  /* 5 */ @js.native
  object IdentifierOrNumber extends TopLevel[IdentifierOrNumber with Double]
  
  @js.native
  sealed trait Invalid extends CssTokenType
  /* 9 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  @js.native
  sealed trait Number extends CssTokenType
  /* 4 */ @js.native
  object Number extends TopLevel[Number with Double]
  
  @js.native
  sealed trait String extends CssTokenType
  /* 1 */ @js.native
  object String extends TopLevel[String with Double]
  
  @js.native
  sealed trait Whitespace extends CssTokenType
  /* 8 */ @js.native
  object Whitespace extends TopLevel[Whitespace with Double]
}
