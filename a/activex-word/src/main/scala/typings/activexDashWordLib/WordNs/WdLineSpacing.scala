package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdLineSpacing extends js.Object

@JSGlobal("Word.WdLineSpacing")
@js.native
object WdLineSpacing extends js.Object {
  @js.native
  sealed trait wdLineSpace1pt5
    extends activexDashWordLib.WordNs.WdLineSpacing
  
  @js.native
  sealed trait wdLineSpaceAtLeast
    extends activexDashWordLib.WordNs.WdLineSpacing
  
  @js.native
  sealed trait wdLineSpaceDouble
    extends activexDashWordLib.WordNs.WdLineSpacing
  
  @js.native
  sealed trait wdLineSpaceExactly
    extends activexDashWordLib.WordNs.WdLineSpacing
  
  @js.native
  sealed trait wdLineSpaceMultiple
    extends activexDashWordLib.WordNs.WdLineSpacing
  
  @js.native
  sealed trait wdLineSpaceSingle
    extends activexDashWordLib.WordNs.WdLineSpacing
  
  /* 1 */ val wdLineSpace1pt5: wdLineSpace1pt5 with scala.Double = js.native
  /* 3 */ val wdLineSpaceAtLeast: wdLineSpaceAtLeast with scala.Double = js.native
  /* 2 */ val wdLineSpaceDouble: wdLineSpaceDouble with scala.Double = js.native
  /* 4 */ val wdLineSpaceExactly: wdLineSpaceExactly with scala.Double = js.native
  /* 5 */ val wdLineSpaceMultiple: wdLineSpaceMultiple with scala.Double = js.native
  /* 0 */ val wdLineSpaceSingle: wdLineSpaceSingle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdLineSpacing with scala.Double] = js.native
}

