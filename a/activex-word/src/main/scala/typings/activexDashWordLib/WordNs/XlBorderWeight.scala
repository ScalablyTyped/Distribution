package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlBorderWeight extends js.Object

@JSGlobal("Word.XlBorderWeight")
@js.native
object XlBorderWeight extends js.Object {
  @js.native
  sealed trait xlHairline
    extends activexDashWordLib.WordNs.XlBorderWeight
  
  @js.native
  sealed trait xlMedium
    extends activexDashWordLib.WordNs.XlBorderWeight
  
  @js.native
  sealed trait xlThick
    extends activexDashWordLib.WordNs.XlBorderWeight
  
  @js.native
  sealed trait xlThin
    extends activexDashWordLib.WordNs.XlBorderWeight
  
  /* 1 */ val xlHairline: xlHairline with scala.Double = js.native
  /* -4138 */ val xlMedium: xlMedium with scala.Double = js.native
  /* 4 */ val xlThick: xlThick with scala.Double = js.native
  /* 2 */ val xlThin: xlThin with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlBorderWeight with scala.Double] = js.native
}

