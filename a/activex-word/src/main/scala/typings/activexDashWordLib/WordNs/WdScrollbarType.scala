package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdScrollbarType extends js.Object

@JSGlobal("Word.WdScrollbarType")
@js.native
object WdScrollbarType extends js.Object {
  @js.native
  sealed trait wdScrollbarTypeAuto
    extends activexDashWordLib.WordNs.WdScrollbarType
  
  @js.native
  sealed trait wdScrollbarTypeNo
    extends activexDashWordLib.WordNs.WdScrollbarType
  
  @js.native
  sealed trait wdScrollbarTypeYes
    extends activexDashWordLib.WordNs.WdScrollbarType
  
  /* 0 */ val wdScrollbarTypeAuto: wdScrollbarTypeAuto with scala.Double = js.native
  /* 2 */ val wdScrollbarTypeNo: wdScrollbarTypeNo with scala.Double = js.native
  /* 1 */ val wdScrollbarTypeYes: wdScrollbarTypeYes with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdScrollbarType with scala.Double] = js.native
}

