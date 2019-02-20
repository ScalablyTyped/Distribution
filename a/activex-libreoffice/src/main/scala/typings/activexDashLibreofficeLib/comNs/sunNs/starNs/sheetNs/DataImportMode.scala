package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataImportMode extends js.Object

/** used to specify which database contents are imported. */
@JSGlobal("com.sun.star.sheet.DataImportMode")
@js.native
object DataImportMode extends js.Object {
  /**
    * no cells are moved.
    *
    * no condition is specified.
    *
    * nothing is imported.
    *
    * nothing is calculated.
    *
    * new values are used without changes.
    *
    * sheet is not linked.
    */
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataImportMode
  
  /** the name of a database query is supplied. */
  @js.native
  sealed trait QUERY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataImportMode
  
  /** a SQL query string is supplied. */
  @js.native
  sealed trait SQL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataImportMode
  
  /** the name of a database table is supplied. */
  @js.native
  sealed trait TABLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataImportMode
  
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 3 */ val QUERY: QUERY with scala.Double = js.native
  /* 1 */ val SQL: SQL with scala.Double = js.native
  /* 2 */ val TABLE: TABLE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataImportMode with scala.Double
  ] = js.native
}

