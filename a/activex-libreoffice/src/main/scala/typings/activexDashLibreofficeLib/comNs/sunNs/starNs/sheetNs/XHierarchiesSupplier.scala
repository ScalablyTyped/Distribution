package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the collection of hierarchies of a data pilot source dimension.
  * @see com.sun.star.sheet.DataPilotSourceDimension
  * @see com.sun.star.sheet.DataPilotSource
  */
trait XHierarchiesSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the collection of hierarchies.
    * @see com.sun.star.sheet.DataPilotSourceHierarchies
    */
  val Hierarchies: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /**
    * returns the collection of hierarchies.
    * @see com.sun.star.sheet.DataPilotSourceHierarchies
    */
  def getHierarchies(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
}

