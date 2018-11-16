package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlBackground extends js.Object

@JSGlobal("Word.XlBackground")
@js.native
object XlBackground extends js.Object {
  @js.native
  sealed trait xlBackgroundAutomatic
    extends activexDashWordLib.WordNs.XlBackground
  
  @js.native
  sealed trait xlBackgroundOpaque
    extends activexDashWordLib.WordNs.XlBackground
  
  @js.native
  sealed trait xlBackgroundTransparent
    extends activexDashWordLib.WordNs.XlBackground
  
  /* -4105 */ val xlBackgroundAutomatic: xlBackgroundAutomatic with scala.Double = js.native
  /* 3 */ val xlBackgroundOpaque: xlBackgroundOpaque with scala.Double = js.native
  /* 2 */ val xlBackgroundTransparent: xlBackgroundTransparent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlBackground with scala.Double] = js.native
}

