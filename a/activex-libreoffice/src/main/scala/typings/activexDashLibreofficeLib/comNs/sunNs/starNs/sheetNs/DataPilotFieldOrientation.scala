package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataPilotFieldOrientation extends js.Object

/** used to specify where a field in a data pilot table is laid out. */
@JSGlobal("com.sun.star.sheet.DataPilotFieldOrientation")
@js.native
object DataPilotFieldOrientation extends js.Object {
  /**
    * the field is used as a column field.
    *
    * is applied to the columns. <p>In this mode, the column contains values and the row
    *
    * contains formulas.</p>
    */
  @js.native
  sealed trait COLUMN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldOrientation
  
  /** the field is used as a data field. */
  @js.native
  sealed trait DATA
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldOrientation
  
  /** the field is not used in the table. */
  @js.native
  sealed trait HIDDEN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldOrientation
  
  /** the field is used as a page field. */
  @js.native
  sealed trait PAGE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldOrientation
  
  /**
    * the field is used as a row field.
    *
    * is applied to the rows. <p>In this mode, the row contains values and the column
    *
    * contains formulas.</p>
    */
  @js.native
  sealed trait ROW
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldOrientation
  
  /* 1 */ val COLUMN: COLUMN with scala.Double = js.native
  /* 4 */ val DATA: DATA with scala.Double = js.native
  /* 0 */ val HIDDEN: HIDDEN with scala.Double = js.native
  /* 3 */ val PAGE: PAGE with scala.Double = js.native
  /* 2 */ val ROW: ROW with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldOrientation with scala.Double
  ] = js.native
}

