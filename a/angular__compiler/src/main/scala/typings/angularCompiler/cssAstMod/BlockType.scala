package typings.angularCompiler.cssAstMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlockType extends js.Object
@JSImport("@angular/compiler/src/css_parser/css_ast", "BlockType")
@js.native
object BlockType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlockType with Double] = js.native
  
  @js.native
  sealed trait Charset extends BlockType
  /* 1 */ @js.native
  object Charset extends TopLevel[Charset with Double]
  
  @js.native
  sealed trait Document extends BlockType
  /* 9 */ @js.native
  object Document extends TopLevel[Document with Double]
  
  @js.native
  sealed trait FontFace extends BlockType
  /* 7 */ @js.native
  object FontFace extends TopLevel[FontFace with Double]
  
  @js.native
  sealed trait Import extends BlockType
  /* 0 */ @js.native
  object Import extends TopLevel[Import with Double]
  
  @js.native
  sealed trait Keyframes extends BlockType
  /* 4 */ @js.native
  object Keyframes extends TopLevel[Keyframes with Double]
  
  @js.native
  sealed trait MediaQuery extends BlockType
  /* 5 */ @js.native
  object MediaQuery extends TopLevel[MediaQuery with Double]
  
  @js.native
  sealed trait Namespace extends BlockType
  /* 2 */ @js.native
  object Namespace extends TopLevel[Namespace with Double]
  
  @js.native
  sealed trait Page extends BlockType
  /* 8 */ @js.native
  object Page extends TopLevel[Page with Double]
  
  @js.native
  sealed trait Selector extends BlockType
  /* 6 */ @js.native
  object Selector extends TopLevel[Selector with Double]
  
  @js.native
  sealed trait Supports extends BlockType
  /* 3 */ @js.native
  object Supports extends TopLevel[Supports with Double]
  
  @js.native
  sealed trait Unsupported extends BlockType
  /* 11 */ @js.native
  object Unsupported extends TopLevel[Unsupported with Double]
  
  @js.native
  sealed trait Viewport extends BlockType
  /* 10 */ @js.native
  object Viewport extends TopLevel[Viewport with Double]
}
