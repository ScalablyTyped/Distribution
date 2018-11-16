package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdGoToDirection extends js.Object

@JSGlobal("Word.WdGoToDirection")
@js.native
object WdGoToDirection extends js.Object {
  @js.native
  sealed trait wdGoToAbsolute
    extends activexDashWordLib.WordNs.WdGoToDirection
  
  @js.native
  sealed trait wdGoToFirst
    extends activexDashWordLib.WordNs.WdGoToDirection
  
  @js.native
  sealed trait wdGoToLast
    extends activexDashWordLib.WordNs.WdGoToDirection
  
  @js.native
  sealed trait wdGoToNext
    extends activexDashWordLib.WordNs.WdGoToDirection
  
  @js.native
  sealed trait wdGoToPrevious
    extends activexDashWordLib.WordNs.WdGoToDirection
  
  @js.native
  sealed trait wdGoToRelative
    extends activexDashWordLib.WordNs.WdGoToDirection
  
  /* 1 */ val wdGoToAbsolute: wdGoToAbsolute with scala.Double = js.native
  /* 1 */ val wdGoToFirst: wdGoToFirst with scala.Double = js.native
  /* -1 */ val wdGoToLast: wdGoToLast with scala.Double = js.native
  /* 2 */ val wdGoToNext: wdGoToNext with scala.Double = js.native
  /* 3 */ val wdGoToPrevious: wdGoToPrevious with scala.Double = js.native
  /* 2 */ val wdGoToRelative: wdGoToRelative with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdGoToDirection with scala.Double] = js.native
}

