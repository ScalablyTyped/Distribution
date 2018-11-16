package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdStyleSort extends js.Object

@JSGlobal("Word.WdStyleSort")
@js.native
object WdStyleSort extends js.Object {
  @js.native
  sealed trait wdStyleSortByBasedOn
    extends activexDashWordLib.WordNs.WdStyleSort
  
  @js.native
  sealed trait wdStyleSortByFont
    extends activexDashWordLib.WordNs.WdStyleSort
  
  @js.native
  sealed trait wdStyleSortByName
    extends activexDashWordLib.WordNs.WdStyleSort
  
  @js.native
  sealed trait wdStyleSortByType
    extends activexDashWordLib.WordNs.WdStyleSort
  
  @js.native
  sealed trait wdStyleSortRecommended
    extends activexDashWordLib.WordNs.WdStyleSort
  
  /* 3 */ val wdStyleSortByBasedOn: wdStyleSortByBasedOn with scala.Double = js.native
  /* 2 */ val wdStyleSortByFont: wdStyleSortByFont with scala.Double = js.native
  /* 0 */ val wdStyleSortByName: wdStyleSortByName with scala.Double = js.native
  /* 4 */ val wdStyleSortByType: wdStyleSortByType with scala.Double = js.native
  /* 1 */ val wdStyleSortRecommended: wdStyleSortRecommended with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdStyleSort with scala.Double] = js.native
}

