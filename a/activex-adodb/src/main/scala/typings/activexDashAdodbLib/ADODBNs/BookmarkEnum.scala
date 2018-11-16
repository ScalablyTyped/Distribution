package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BookmarkEnum extends js.Object

@JSGlobal("ADODB.BookmarkEnum")
@js.native
object BookmarkEnum extends js.Object {
  @js.native
  sealed trait adBookmarkCurrent
    extends activexDashAdodbLib.ADODBNs.BookmarkEnum
  
  @js.native
  sealed trait adBookmarkFirst
    extends activexDashAdodbLib.ADODBNs.BookmarkEnum
  
  @js.native
  sealed trait adBookmarkLast
    extends activexDashAdodbLib.ADODBNs.BookmarkEnum
  
  /* 0 */ val adBookmarkCurrent: adBookmarkCurrent with scala.Double = js.native
  /* 1 */ val adBookmarkFirst: adBookmarkFirst with scala.Double = js.native
  /* 2 */ val adBookmarkLast: adBookmarkLast with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.BookmarkEnum with scala.Double] = js.native
}

