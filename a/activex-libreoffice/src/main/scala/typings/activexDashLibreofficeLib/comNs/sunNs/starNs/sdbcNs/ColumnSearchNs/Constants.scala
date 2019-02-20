package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ColumnSearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sdbc.ColumnSearch.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait BASIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ColumnSearchNs.Constants
  
  @js.native
  sealed trait CHAR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ColumnSearchNs.Constants
  
  @js.native
  sealed trait FULL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ColumnSearchNs.Constants
  
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ColumnSearchNs.Constants
  
  /* 2 */ val BASIC: BASIC with scala.Double = js.native
  /* 1 */ val CHAR: CHAR with scala.Double = js.native
  /* 3 */ val FULL: FULL with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ColumnSearchNs.Constants with scala.Double
  ] = js.native
}

