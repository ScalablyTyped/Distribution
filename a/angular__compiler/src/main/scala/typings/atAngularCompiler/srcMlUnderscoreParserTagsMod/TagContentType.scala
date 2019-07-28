package typings.atAngularCompiler.srcMlUnderscoreParserTagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TagContentType extends js.Object

@JSImport("@angular/compiler/src/ml_parser/tags", "TagContentType")
@js.native
object TagContentType extends js.Object {
  @js.native
  sealed trait ESCAPABLE_RAW_TEXT extends TagContentType
  
  @js.native
  sealed trait PARSABLE_DATA extends TagContentType
  
  @js.native
  sealed trait RAW_TEXT extends TagContentType
  
  /* 1 */ val ESCAPABLE_RAW_TEXT: typings.atAngularCompiler.srcMlUnderscoreParserTagsMod.TagContentType.ESCAPABLE_RAW_TEXT with Double = js.native
  /* 2 */ val PARSABLE_DATA: typings.atAngularCompiler.srcMlUnderscoreParserTagsMod.TagContentType.PARSABLE_DATA with Double = js.native
  /* 0 */ val RAW_TEXT: typings.atAngularCompiler.srcMlUnderscoreParserTagsMod.TagContentType.RAW_TEXT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TagContentType with Double] = js.native
}

