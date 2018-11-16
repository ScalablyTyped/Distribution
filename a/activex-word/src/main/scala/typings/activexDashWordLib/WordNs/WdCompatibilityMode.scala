package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdCompatibilityMode extends js.Object

@JSGlobal("Word.WdCompatibilityMode")
@js.native
object WdCompatibilityMode extends js.Object {
  @js.native
  sealed trait wdCurrent
    extends activexDashWordLib.WordNs.WdCompatibilityMode
  
  @js.native
  sealed trait wdWord2003
    extends activexDashWordLib.WordNs.WdCompatibilityMode
  
  @js.native
  sealed trait wdWord2007
    extends activexDashWordLib.WordNs.WdCompatibilityMode
  
  @js.native
  sealed trait wdWord2010
    extends activexDashWordLib.WordNs.WdCompatibilityMode
  
  /* 65535 */ val wdCurrent: wdCurrent with scala.Double = js.native
  /* 11 */ val wdWord2003: wdWord2003 with scala.Double = js.native
  /* 12 */ val wdWord2007: wdWord2007 with scala.Double = js.native
  /* 14 */ val wdWord2010: wdWord2010 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdCompatibilityMode with scala.Double] = js.native
}

