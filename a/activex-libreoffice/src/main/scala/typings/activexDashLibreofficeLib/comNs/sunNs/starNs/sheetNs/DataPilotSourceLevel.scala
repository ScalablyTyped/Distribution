package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a level in a data pilot source hierarchy.
  * @see com.sun.star.sheet.DataPilotSourceHierarchy
  * @see com.sun.star.sheet.DataPilotSource
  */
trait DataPilotSourceLevel
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed
     with XMembersSupplier
     with XDataPilotMemberResults
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** specifies whether empty members are shown. */
  var ShowEmpty: scala.Boolean
  /**
    * specifies the subtotals that are inserted for the level.
    *
    * The subtotals are calculated with the members of this level.
    */
  var SubTotals: activexDashInteropLib.SafeArray[GeneralFunction]
  /**
    * specifies the subtotals that are inserted for the level.
    *
    * The subtotals are calculated with the members of this level.
    * @since LibreOffice 5.3
    */
  var SubTotals2: activexDashInteropLib.SafeArray[scala.Double]
}

