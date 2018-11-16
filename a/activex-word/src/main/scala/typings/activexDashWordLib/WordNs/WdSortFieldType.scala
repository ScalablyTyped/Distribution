package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdSortFieldType extends js.Object

@JSGlobal("Word.WdSortFieldType")
@js.native
object WdSortFieldType extends js.Object {
  @js.native
  sealed trait wdSortFieldAlphanumeric
    extends activexDashWordLib.WordNs.WdSortFieldType
  
  @js.native
  sealed trait wdSortFieldDate
    extends activexDashWordLib.WordNs.WdSortFieldType
  
  @js.native
  sealed trait wdSortFieldJapanJIS
    extends activexDashWordLib.WordNs.WdSortFieldType
  
  @js.native
  sealed trait wdSortFieldKoreaKS
    extends activexDashWordLib.WordNs.WdSortFieldType
  
  @js.native
  sealed trait wdSortFieldNumeric
    extends activexDashWordLib.WordNs.WdSortFieldType
  
  @js.native
  sealed trait wdSortFieldStroke
    extends activexDashWordLib.WordNs.WdSortFieldType
  
  @js.native
  sealed trait wdSortFieldSyllable
    extends activexDashWordLib.WordNs.WdSortFieldType
  
  /* 0 */ val wdSortFieldAlphanumeric: wdSortFieldAlphanumeric with scala.Double = js.native
  /* 2 */ val wdSortFieldDate: wdSortFieldDate with scala.Double = js.native
  /* 4 */ val wdSortFieldJapanJIS: wdSortFieldJapanJIS with scala.Double = js.native
  /* 6 */ val wdSortFieldKoreaKS: wdSortFieldKoreaKS with scala.Double = js.native
  /* 1 */ val wdSortFieldNumeric: wdSortFieldNumeric with scala.Double = js.native
  /* 5 */ val wdSortFieldStroke: wdSortFieldStroke with scala.Double = js.native
  /* 3 */ val wdSortFieldSyllable: wdSortFieldSyllable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdSortFieldType with scala.Double] = js.native
}

