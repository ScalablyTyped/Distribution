package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a hierarchy in a data pilot source dimension.
  * @see com.sun.star.sheet.DataPilotSourceDimension
  * @see com.sun.star.sheet.DataPilotSource
  */
trait DataPilotSourceHierarchy
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed
     with XLevelsSupplier

object DataPilotSourceHierarchy {
  @scala.inline
  def apply(
    Levels: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    Name: java.lang.String,
    acquire: () => scala.Unit,
    getLevels: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    getName: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setName: java.lang.String => scala.Unit
  ): DataPilotSourceHierarchy = {
    val __obj = js.Dynamic.literal(Levels = Levels, Name = Name, acquire = js.Any.fromFunction0(acquire), getLevels = js.Any.fromFunction0(getLevels), getName = js.Any.fromFunction0(getName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setName = js.Any.fromFunction1(setName))
  
    __obj.asInstanceOf[DataPilotSourceHierarchy]
  }
}

