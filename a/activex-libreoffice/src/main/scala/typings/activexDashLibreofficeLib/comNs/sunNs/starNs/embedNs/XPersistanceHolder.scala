package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to disconnect an object from its persistence. */
trait XPersistanceHolder
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * connects the object to a persistence.
    * @param xStream a stream that specify the persistence
    * @throws com::sun::star::io::IOException in case of io problems
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def connectPersistance(xStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream): scala.Unit
  /**
    * disconnects the object from the persistence.
    * @throws com::sun::star::io::IOException in case of io problems
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def disconnectPersistence(): scala.Unit
}

object XPersistanceHolder {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    connectPersistance: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream, scala.Unit],
    disconnectPersistence: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XPersistanceHolder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("connectPersistance")(connectPersistance)
    __obj.updateDynamic("disconnectPersistence")(disconnectPersistence)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XPersistanceHolder]
  }
}

