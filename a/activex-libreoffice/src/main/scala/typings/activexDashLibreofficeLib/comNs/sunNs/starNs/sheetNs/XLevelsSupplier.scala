package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the collection of levels of a data pilot source hierarchy.
  * @see com.sun.star.sheet.DataPilotSourceHierarchy
  * @see com.sun.star.sheet.DataPilotSource
  */
trait XLevelsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the collection of levels.
    * @see com.sun.star.sheet.DataPilotSourceLevels
    */
  val Levels: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /**
    * returns the collection of levels.
    * @see com.sun.star.sheet.DataPilotSourceLevels
    */
  def getLevels(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
}

