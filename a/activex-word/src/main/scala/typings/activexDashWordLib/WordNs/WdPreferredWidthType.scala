package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdPreferredWidthType extends js.Object

@JSGlobal("Word.WdPreferredWidthType")
@js.native
object WdPreferredWidthType extends js.Object {
  @js.native
  sealed trait wdPreferredWidthAuto
    extends activexDashWordLib.WordNs.WdPreferredWidthType
  
  @js.native
  sealed trait wdPreferredWidthPercent
    extends activexDashWordLib.WordNs.WdPreferredWidthType
  
  @js.native
  sealed trait wdPreferredWidthPoints
    extends activexDashWordLib.WordNs.WdPreferredWidthType
  
  /* 1 */ val wdPreferredWidthAuto: wdPreferredWidthAuto with scala.Double = js.native
  /* 2 */ val wdPreferredWidthPercent: wdPreferredWidthPercent with scala.Double = js.native
  /* 3 */ val wdPreferredWidthPoints: wdPreferredWidthPoints with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdPreferredWidthType with scala.Double] = js.native
}

