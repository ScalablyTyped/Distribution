package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to control a data pilot field which has already been created.
  * @see com.sun.star.sheet.DataPilotField
  */
trait XDataPilotField
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the collection of the data pilot items.
    * @see com.sun.star.sheet.DataPilotItems
    */
  val Items: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /**
    * returns the collection of the data pilot items.
    * @see com.sun.star.sheet.DataPilotItems
    */
  def getItems(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
}

