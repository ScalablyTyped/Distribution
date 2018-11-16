package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdBookmarkSortBy extends js.Object

@JSGlobal("Word.WdBookmarkSortBy")
@js.native
object WdBookmarkSortBy extends js.Object {
  @js.native
  sealed trait wdSortByLocation
    extends activexDashWordLib.WordNs.WdBookmarkSortBy
  
  @js.native
  sealed trait wdSortByName
    extends activexDashWordLib.WordNs.WdBookmarkSortBy
  
  /* 1 */ val wdSortByLocation: wdSortByLocation with scala.Double = js.native
  /* 0 */ val wdSortByName: wdSortByName with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdBookmarkSortBy with scala.Double] = js.native
}

