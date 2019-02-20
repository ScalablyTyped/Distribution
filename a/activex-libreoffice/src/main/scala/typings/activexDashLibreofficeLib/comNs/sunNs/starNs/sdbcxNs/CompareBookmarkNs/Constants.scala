package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.CompareBookmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sdbcx.CompareBookmark.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait EQUAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.CompareBookmarkNs.Constants
  
  @js.native
  sealed trait GREATER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.CompareBookmarkNs.Constants
  
  @js.native
  sealed trait LESS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.CompareBookmarkNs.Constants
  
  @js.native
  sealed trait NOT_COMPARABLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.CompareBookmarkNs.Constants
  
  @js.native
  sealed trait NOT_EQUAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.CompareBookmarkNs.Constants
  
  /* 0 */ val EQUAL: EQUAL with scala.Double = js.native
  /* 1 */ val GREATER: GREATER with scala.Double = js.native
  /* -1 */ val LESS: LESS with scala.Double = js.native
  /* 3 */ val NOT_COMPARABLE: NOT_COMPARABLE with scala.Double = js.native
  /* 2 */ val NOT_EQUAL: NOT_EQUAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.CompareBookmarkNs.Constants with scala.Double
  ] = js.native
}

