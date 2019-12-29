package typings.atAngularCompiler.srcMlUnderscoreParserTagsMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TagContentType with Double] = js.native
  /* 1 */ @js.native
  object ESCAPABLE_RAW_TEXT extends TopLevel[ESCAPABLE_RAW_TEXT with Double]
  
  /* 2 */ @js.native
  object PARSABLE_DATA extends TopLevel[PARSABLE_DATA with Double]
  
  /* 0 */ @js.native
  object RAW_TEXT extends TopLevel[RAW_TEXT with Double]
  
}

