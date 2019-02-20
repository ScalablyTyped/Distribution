package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a member in a data pilot source level.
  *
  * Members are the data items that will appear in a data pilot table as row headers and column headers of the data range (if used in row or column
  * dimensions), or to calculate the values of the data range (if used in data dimensions).
  * @see com.sun.star.sheet.DataPilotSourceLevel
  * @see com.sun.star.sheet.DataPilotSource
  */
trait DataPilotSourceMember
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** specifies whether the member is visible. */
  var IsVisible: scala.Boolean
  /**
    * specifies the member's position in its hierarchy level if sorting is manual.
    * @since OOo 2.4
    */
  var Position: scala.Boolean
  /** specifies whether details for the member are shown. */
  var ShowDetails: scala.Boolean
}

