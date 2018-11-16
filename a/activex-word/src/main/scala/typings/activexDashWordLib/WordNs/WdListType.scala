package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdListType extends js.Object

@JSGlobal("Word.WdListType")
@js.native
object WdListType extends js.Object {
  @js.native
  sealed trait wdListBullet
    extends activexDashWordLib.WordNs.WdListType
  
  @js.native
  sealed trait wdListListNumOnly
    extends activexDashWordLib.WordNs.WdListType
  
  @js.native
  sealed trait wdListMixedNumbering
    extends activexDashWordLib.WordNs.WdListType
  
  @js.native
  sealed trait wdListNoNumbering
    extends activexDashWordLib.WordNs.WdListType
  
  @js.native
  sealed trait wdListOutlineNumbering
    extends activexDashWordLib.WordNs.WdListType
  
  @js.native
  sealed trait wdListPictureBullet
    extends activexDashWordLib.WordNs.WdListType
  
  @js.native
  sealed trait wdListSimpleNumbering
    extends activexDashWordLib.WordNs.WdListType
  
  /* 2 */ val wdListBullet: wdListBullet with scala.Double = js.native
  /* 1 */ val wdListListNumOnly: wdListListNumOnly with scala.Double = js.native
  /* 5 */ val wdListMixedNumbering: wdListMixedNumbering with scala.Double = js.native
  /* 0 */ val wdListNoNumbering: wdListNoNumbering with scala.Double = js.native
  /* 4 */ val wdListOutlineNumbering: wdListOutlineNumbering with scala.Double = js.native
  /* 6 */ val wdListPictureBullet: wdListPictureBullet with scala.Double = js.native
  /* 3 */ val wdListSimpleNumbering: wdListSimpleNumbering with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdListType with scala.Double] = js.native
}

