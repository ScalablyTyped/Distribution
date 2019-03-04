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
    acquire: js.Function0[scala.Unit],
    getLevels: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    getName: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit]
  ): DataPilotSourceHierarchy = {
    val __obj = js.Dynamic.literal(Levels = Levels, Name = Name, acquire = acquire, getLevels = getLevels, getName = getName, queryInterface = queryInterface, release = release, setName = setName)
  
    __obj.asInstanceOf[DataPilotSourceHierarchy]
  }
}

