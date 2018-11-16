package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdOMathJc extends js.Object

@JSGlobal("Word.WdOMathJc")
@js.native
object WdOMathJc extends js.Object {
  @js.native
  sealed trait wdOMathJcCenter
    extends activexDashWordLib.WordNs.WdOMathJc
  
  @js.native
  sealed trait wdOMathJcCenterGroup
    extends activexDashWordLib.WordNs.WdOMathJc
  
  @js.native
  sealed trait wdOMathJcInline
    extends activexDashWordLib.WordNs.WdOMathJc
  
  @js.native
  sealed trait wdOMathJcLeft
    extends activexDashWordLib.WordNs.WdOMathJc
  
  @js.native
  sealed trait wdOMathJcRight
    extends activexDashWordLib.WordNs.WdOMathJc
  
  /* 2 */ val wdOMathJcCenter: wdOMathJcCenter with scala.Double = js.native
  /* 1 */ val wdOMathJcCenterGroup: wdOMathJcCenterGroup with scala.Double = js.native
  /* 7 */ val wdOMathJcInline: wdOMathJcInline with scala.Double = js.native
  /* 3 */ val wdOMathJcLeft: wdOMathJcLeft with scala.Double = js.native
  /* 4 */ val wdOMathJcRight: wdOMathJcRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdOMathJc with scala.Double] = js.native
}

