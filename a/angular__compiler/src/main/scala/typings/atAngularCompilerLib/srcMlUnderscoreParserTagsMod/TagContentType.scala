package typings
package atAngularCompilerLib.srcMlUnderscoreParserTagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TagContentType extends js.Object

@JSImport("@angular/compiler/src/ml_parser/tags", "TagContentType")
@js.native
object TagContentType extends js.Object {
  @js.native
  sealed trait ESCAPABLE_RAW_TEXT
    extends atAngularCompilerLib.srcMlUnderscoreParserTagsMod.TagContentType
  
  @js.native
  sealed trait PARSABLE_DATA
    extends atAngularCompilerLib.srcMlUnderscoreParserTagsMod.TagContentType
  
  @js.native
  sealed trait RAW_TEXT
    extends atAngularCompilerLib.srcMlUnderscoreParserTagsMod.TagContentType
  
  /* 1 */ val ESCAPABLE_RAW_TEXT: ESCAPABLE_RAW_TEXT with scala.Double = js.native
  /* 2 */ val PARSABLE_DATA: PARSABLE_DATA with scala.Double = js.native
  /* 0 */ val RAW_TEXT: RAW_TEXT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCompilerLib.srcMlUnderscoreParserTagsMod.TagContentType with scala.Double
  ] = js.native
}

