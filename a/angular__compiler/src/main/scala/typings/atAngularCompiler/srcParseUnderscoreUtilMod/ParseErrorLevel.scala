package typings.atAngularCompiler.srcParseUnderscoreUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParseErrorLevel extends js.Object

@JSImport("@angular/compiler/src/parse_util", "ParseErrorLevel")
@js.native
object ParseErrorLevel extends js.Object {
  @js.native
  sealed trait ERROR extends ParseErrorLevel
  
  @js.native
  sealed trait WARNING extends ParseErrorLevel
  
  /* 1 */ val ERROR: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseErrorLevel.ERROR with Double = js.native
  /* 0 */ val WARNING: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseErrorLevel.WARNING with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParseErrorLevel with Double] = js.native
}

