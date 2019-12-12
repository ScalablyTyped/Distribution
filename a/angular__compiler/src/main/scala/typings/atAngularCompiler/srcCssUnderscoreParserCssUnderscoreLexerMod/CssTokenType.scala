package typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod

import org.scalablytyped.runtime.TopLevel
import typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.AtKeyword
import typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.Character
import typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.Comment
import typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.EOF
import typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.Identifier
import typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.IdentifierOrNumber
import typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.Invalid
import typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.Number
import typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.String
import typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.Whitespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CssTokenType extends js.Object

@JSImport("@angular/compiler/src/css_parser/css_lexer", "CssTokenType")
@js.native
object CssTokenType extends js.Object {
  @js.native
  sealed trait AtKeyword extends CssTokenType
  
  @js.native
  sealed trait Character extends CssTokenType
  
  @js.native
  sealed trait Comment extends CssTokenType
  
  @js.native
  sealed trait EOF extends CssTokenType
  
  @js.native
  sealed trait Identifier extends CssTokenType
  
  @js.native
  sealed trait IdentifierOrNumber extends CssTokenType
  
  @js.native
  sealed trait Invalid extends CssTokenType
  
  @js.native
  sealed trait Number extends CssTokenType
  
  @js.native
  sealed trait String extends CssTokenType
  
  @js.native
  sealed trait Whitespace extends CssTokenType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CssTokenType with Double] = js.native
  /* 6 */ @js.native
  object AtKeyword extends TopLevel[AtKeyword with Double]
  
  /* 7 */ @js.native
  object Character extends TopLevel[Character with Double]
  
  /* 2 */ @js.native
  object Comment extends TopLevel[Comment with Double]
  
  /* 0 */ @js.native
  object EOF extends TopLevel[EOF with Double]
  
  /* 3 */ @js.native
  object Identifier extends TopLevel[Identifier with Double]
  
  /* 5 */ @js.native
  object IdentifierOrNumber extends TopLevel[IdentifierOrNumber with Double]
  
  /* 9 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  /* 4 */ @js.native
  object Number extends TopLevel[Number with Double]
  
  /* 1 */ @js.native
  object String extends TopLevel[String with Double]
  
  /* 8 */ @js.native
  object Whitespace extends TopLevel[Whitespace with Double]
  
}

