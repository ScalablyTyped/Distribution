package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdOMathFracType extends js.Object

@JSGlobal("Word.WdOMathFracType")
@js.native
object WdOMathFracType extends js.Object {
  @js.native
  sealed trait wdOMathFracBar
    extends activexDashWordLib.WordNs.WdOMathFracType
  
  @js.native
  sealed trait wdOMathFracLin
    extends activexDashWordLib.WordNs.WdOMathFracType
  
  @js.native
  sealed trait wdOMathFracNoBar
    extends activexDashWordLib.WordNs.WdOMathFracType
  
  @js.native
  sealed trait wdOMathFracSkw
    extends activexDashWordLib.WordNs.WdOMathFracType
  
  /* 0 */ val wdOMathFracBar: wdOMathFracBar with scala.Double = js.native
  /* 3 */ val wdOMathFracLin: wdOMathFracLin with scala.Double = js.native
  /* 1 */ val wdOMathFracNoBar: wdOMathFracNoBar with scala.Double = js.native
  /* 2 */ val wdOMathFracSkw: wdOMathFracSkw with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdOMathFracType with scala.Double] = js.native
}

