package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdTabLeader extends js.Object

@JSGlobal("Word.WdTabLeader")
@js.native
object WdTabLeader extends js.Object {
  @js.native
  sealed trait wdTabLeaderDashes
    extends activexDashWordLib.WordNs.WdTabLeader
  
  @js.native
  sealed trait wdTabLeaderDots
    extends activexDashWordLib.WordNs.WdTabLeader
  
  @js.native
  sealed trait wdTabLeaderHeavy
    extends activexDashWordLib.WordNs.WdTabLeader
  
  @js.native
  sealed trait wdTabLeaderLines
    extends activexDashWordLib.WordNs.WdTabLeader
  
  @js.native
  sealed trait wdTabLeaderMiddleDot
    extends activexDashWordLib.WordNs.WdTabLeader
  
  @js.native
  sealed trait wdTabLeaderSpaces
    extends activexDashWordLib.WordNs.WdTabLeader
  
  /* 2 */ val wdTabLeaderDashes: wdTabLeaderDashes with scala.Double = js.native
  /* 1 */ val wdTabLeaderDots: wdTabLeaderDots with scala.Double = js.native
  /* 4 */ val wdTabLeaderHeavy: wdTabLeaderHeavy with scala.Double = js.native
  /* 3 */ val wdTabLeaderLines: wdTabLeaderLines with scala.Double = js.native
  /* 5 */ val wdTabLeaderMiddleDot: wdTabLeaderMiddleDot with scala.Double = js.native
  /* 0 */ val wdTabLeaderSpaces: wdTabLeaderSpaces with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdTabLeader with scala.Double] = js.native
}

