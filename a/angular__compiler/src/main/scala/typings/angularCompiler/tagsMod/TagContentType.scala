package typings.angularCompiler.tagsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TagContentType extends js.Object
@JSImport("@angular/compiler/src/ml_parser/tags", "TagContentType")
@js.native
object TagContentType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TagContentType with Double] = js.native
  
  @js.native
  sealed trait ESCAPABLE_RAW_TEXT extends TagContentType
  /* 1 */ @js.native
  object ESCAPABLE_RAW_TEXT extends TopLevel[ESCAPABLE_RAW_TEXT with Double]
  
  @js.native
  sealed trait PARSABLE_DATA extends TagContentType
  /* 2 */ @js.native
  object PARSABLE_DATA extends TopLevel[PARSABLE_DATA with Double]
  
  @js.native
  sealed trait RAW_TEXT extends TagContentType
  /* 0 */ @js.native
  object RAW_TEXT extends TopLevel[RAW_TEXT with Double]
}
