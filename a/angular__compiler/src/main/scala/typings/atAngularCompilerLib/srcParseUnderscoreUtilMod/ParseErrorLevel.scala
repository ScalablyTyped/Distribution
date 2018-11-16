package typings
package atAngularCompilerLib.srcParseUnderscoreUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParseErrorLevel extends js.Object

@JSImport("@angular/compiler/src/parse_util", "ParseErrorLevel")
@js.native
object ParseErrorLevel extends js.Object {
  @js.native
  sealed trait ERROR
    extends atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseErrorLevel
  
  @js.native
  sealed trait WARNING
    extends atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseErrorLevel
  
  /* 1 */ val ERROR: ERROR with scala.Double = js.native
  /* 0 */ val WARNING: WARNING with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseErrorLevel with scala.Double] = js.native
}

