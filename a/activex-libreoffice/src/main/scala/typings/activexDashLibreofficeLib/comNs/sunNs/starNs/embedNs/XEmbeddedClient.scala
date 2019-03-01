package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents common functionality for embedded clients. */
trait XEmbeddedClient extends XComponentSupplier {
  /**
    * asks client to let the object store itself.
    * @throws com::sun::star::uno::ObjectSaveVetoException in case container chants to avoid saving of object
    * @throws com::sun::star::uno::Exception in case of problems during saving
    */
  def saveObject(): scala.Unit
  /**
    * An object can use this method to notify the client when the object outplace window becomes visible or invisible.
    * @param bVisible visibility state of the window
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    */
  def visibilityChanged(bVisible: scala.Boolean): scala.Unit
}

object XEmbeddedClient {
  @scala.inline
  def apply(
    Component: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseable,
    acquire: js.Function0[scala.Unit],
    getComponent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseable],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    saveObject: js.Function0[scala.Unit],
    visibilityChanged: js.Function1[scala.Boolean, scala.Unit]
  ): XEmbeddedClient = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Component")(Component)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getComponent")(getComponent)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("saveObject")(saveObject)
    __obj.updateDynamic("visibilityChanged")(visibilityChanged)
    __obj.asInstanceOf[XEmbeddedClient]
  }
}

