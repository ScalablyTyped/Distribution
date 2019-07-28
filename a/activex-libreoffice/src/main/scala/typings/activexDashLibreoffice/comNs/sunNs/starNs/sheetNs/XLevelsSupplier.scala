package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the collection of levels of a data pilot source hierarchy.
  * @see com.sun.star.sheet.DataPilotSourceHierarchy
  * @see com.sun.star.sheet.DataPilotSource
  */
trait XLevelsSupplier extends XInterface {
  /**
    * returns the collection of levels.
    * @see com.sun.star.sheet.DataPilotSourceLevels
    */
  val Levels: XNameAccess
  /**
    * returns the collection of levels.
    * @see com.sun.star.sheet.DataPilotSourceLevels
    */
  def getLevels(): XNameAccess
}

object XLevelsSupplier {
  @scala.inline
  def apply(
    Levels: XNameAccess,
    acquire: () => Unit,
    getLevels: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLevelsSupplier = {
    val __obj = js.Dynamic.literal(Levels = Levels, acquire = js.Any.fromFunction0(acquire), getLevels = js.Any.fromFunction0(getLevels), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XLevelsSupplier]
  }
}

