package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides methods to remove an element of its container and to drop it from the related database. */
trait XDrop
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * drops an object of the related container identified by its position.
    * @param index the position of the element to be dropped
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def dropByIndex(index: scala.Double): scala.Unit
  /**
    * drops an object of the related container identified by its name.
    * @param elementName the name of the element to be dropped
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def dropByName(elementName: java.lang.String): scala.Unit
}

object XDrop {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    dropByIndex: js.Function1[scala.Double, scala.Unit],
    dropByName: js.Function1[java.lang.String, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDrop = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("dropByIndex")(dropByIndex)
    __obj.updateDynamic("dropByName")(dropByName)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XDrop]
  }
}

