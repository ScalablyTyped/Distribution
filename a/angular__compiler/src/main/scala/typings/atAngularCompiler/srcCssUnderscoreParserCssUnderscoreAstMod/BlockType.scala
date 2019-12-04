package typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BlockType extends js.Object

@JSImport("@angular/compiler/src/css_parser/css_ast", "BlockType")
@js.native
object BlockType extends js.Object {
  @js.native
  sealed trait Charset extends BlockType
  
  @js.native
  sealed trait Document extends BlockType
  
  @js.native
  sealed trait FontFace extends BlockType
  
  @js.native
  sealed trait Import extends BlockType
  
  @js.native
  sealed trait Keyframes extends BlockType
  
  @js.native
  sealed trait MediaQuery extends BlockType
  
  @js.native
  sealed trait Namespace extends BlockType
  
  @js.native
  sealed trait Page extends BlockType
  
  @js.native
  sealed trait Selector extends BlockType
  
  @js.native
  sealed trait Supports extends BlockType
  
  @js.native
  sealed trait Unsupported extends BlockType
  
  @js.native
  sealed trait Viewport extends BlockType
  
  /* 1 */ val Charset: typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreAstMod.BlockType.Charset with Double = js.native
  /* 9 */ val Document: typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreAstMod.BlockType.Document with Double = js.native
  /* 7 */ val FontFace: typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreAstMod.BlockType.FontFace with Double = js.native
  /* 0 */ val Import: typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreAstMod.BlockType.Import with Double = js.native
  /* 4 */ val Keyframes: typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreAstMod.BlockType.Keyframes with Double = js.native
  /* 5 */ val MediaQuery: typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreAstMod.BlockType.MediaQuery with Double = js.native
  /* 2 */ val Namespace: typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreAstMod.BlockType.Namespace with Double = js.native
  /* 8 */ val Page: typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreAstMod.BlockType.Page with Double = js.native
  /* 6 */ val Selector: typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreAstMod.BlockType.Selector with Double = js.native
  /* 3 */ val Supports: typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreAstMod.BlockType.Supports with Double = js.native
  /* 11 */ val Unsupported: typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreAstMod.BlockType.Unsupported with Double = js.native
  /* 10 */ val Viewport: typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreAstMod.BlockType.Viewport with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlockType with Double] = js.native
}

