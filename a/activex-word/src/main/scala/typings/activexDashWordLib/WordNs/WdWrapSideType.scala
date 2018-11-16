package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdWrapSideType extends js.Object

@JSGlobal("Word.WdWrapSideType")
@js.native
object WdWrapSideType extends js.Object {
  @js.native
  sealed trait wdWrapBoth
    extends activexDashWordLib.WordNs.WdWrapSideType
  
  @js.native
  sealed trait wdWrapLargest
    extends activexDashWordLib.WordNs.WdWrapSideType
  
  @js.native
  sealed trait wdWrapLeft
    extends activexDashWordLib.WordNs.WdWrapSideType
  
  @js.native
  sealed trait wdWrapRight
    extends activexDashWordLib.WordNs.WdWrapSideType
  
  /* 0 */ val wdWrapBoth: wdWrapBoth with scala.Double = js.native
  /* 3 */ val wdWrapLargest: wdWrapLargest with scala.Double = js.native
  /* 1 */ val wdWrapLeft: wdWrapLeft with scala.Double = js.native
  /* 2 */ val wdWrapRight: wdWrapRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdWrapSideType with scala.Double] = js.native
}

