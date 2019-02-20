package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListSourceType extends js.Object

/**
  * describes the kind of data source used to fill the list data of a listbox or a combobox control.
  * @see com.sun.star.form.component.ListBox
  * @see com.sun.star.form.component.ComboBox
  */
@JSGlobal("com.sun.star.form.ListSourceType")
@js.native
object ListSourceType extends js.Object {
  /** The control should be filled with the results of a database query. */
  @js.native
  sealed trait QUERY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.ListSourceType
  
  /** The control should be filled with the results of a database statement. */
  @js.native
  sealed trait SQL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.ListSourceType
  
  /** The control should be filled with the results of a database statement, which is not evaluated by the database engine. */
  @js.native
  sealed trait SQLPASSTHROUGH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.ListSourceType
  
  /** The control should be filled with the data of a table. */
  @js.native
  sealed trait TABLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.ListSourceType
  
  /** The control should be filled with the field names of a database table. */
  @js.native
  sealed trait TABLEFIELDS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.ListSourceType
  
  /** The control should be filled with a list of string values. */
  @js.native
  sealed trait VALUELIST
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.ListSourceType
  
  /* 2 */ val QUERY: QUERY with scala.Double = js.native
  /* 3 */ val SQL: SQL with scala.Double = js.native
  /* 4 */ val SQLPASSTHROUGH: SQLPASSTHROUGH with scala.Double = js.native
  /* 1 */ val TABLE: TABLE with scala.Double = js.native
  /* 5 */ val TABLEFIELDS: TABLEFIELDS with scala.Double = js.native
  /* 0 */ val VALUELIST: VALUELIST with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.ListSourceType with scala.Double
  ] = js.native
}

