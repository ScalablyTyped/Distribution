package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataSelectionType extends js.Object

/**
  * describes the type of datasource used for a form.
  *
  * Please do **not** use anymore, this enum is deprecated.
  * @deprecated Deprecated
  */
@JSGlobal("com.sun.star.form.DataSelectionType")
@js.native
object DataSelectionType extends js.Object {
  /** The control should be filled with the results of a database query. */
  @js.native
  sealed trait QUERY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.DataSelectionType
  
  /** The control should be filled with the results of a database statement. */
  @js.native
  sealed trait SQL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.DataSelectionType
  
  /** The control should be filled with the results of a database statement, which is not evaluated by the database engine. */
  @js.native
  sealed trait SQLPASSTHROUGH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.DataSelectionType
  
  /** The control should be filled with the data of a table. */
  @js.native
  sealed trait TABLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.DataSelectionType
  
  /* 1 */ val QUERY: QUERY with scala.Double = js.native
  /* 2 */ val SQL: SQL with scala.Double = js.native
  /* 3 */ val SQLPASSTHROUGH: SQLPASSTHROUGH with scala.Double = js.native
  /* 0 */ val TABLE: TABLE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.DataSelectionType with scala.Double
  ] = js.native
}

