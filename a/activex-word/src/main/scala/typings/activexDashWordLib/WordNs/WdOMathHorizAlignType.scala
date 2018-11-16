package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdOMathHorizAlignType extends js.Object

@JSGlobal("Word.WdOMathHorizAlignType")
@js.native
object WdOMathHorizAlignType extends js.Object {
  @js.native
  sealed trait wdOMathHorizAlignCenter
    extends activexDashWordLib.WordNs.WdOMathHorizAlignType
  
  @js.native
  sealed trait wdOMathHorizAlignLeft
    extends activexDashWordLib.WordNs.WdOMathHorizAlignType
  
  @js.native
  sealed trait wdOMathHorizAlignRight
    extends activexDashWordLib.WordNs.WdOMathHorizAlignType
  
  /* 0 */ val wdOMathHorizAlignCenter: wdOMathHorizAlignCenter with scala.Double = js.native
  /* 1 */ val wdOMathHorizAlignLeft: wdOMathHorizAlignLeft with scala.Double = js.native
  /* 2 */ val wdOMathHorizAlignRight: wdOMathHorizAlignRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdOMathHorizAlignType with scala.Double] = js.native
}

