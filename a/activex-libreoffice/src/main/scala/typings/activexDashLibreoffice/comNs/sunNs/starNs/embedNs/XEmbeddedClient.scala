package typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XCloseable
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
  def saveObject(): Unit
  /**
    * An object can use this method to notify the client when the object outplace window becomes visible or invisible.
    * @param bVisible visibility state of the window
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    */
  def visibilityChanged(bVisible: Boolean): Unit
}

object XEmbeddedClient {
  @scala.inline
  def apply(
    Component: XCloseable,
    acquire: () => Unit,
    getComponent: () => XCloseable,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    saveObject: () => Unit,
    visibilityChanged: Boolean => Unit
  ): XEmbeddedClient = {
    val __obj = js.Dynamic.literal(Component = Component, acquire = js.Any.fromFunction0(acquire), getComponent = js.Any.fromFunction0(getComponent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), saveObject = js.Any.fromFunction0(saveObject), visibilityChanged = js.Any.fromFunction1(visibilityChanged))
  
    __obj.asInstanceOf[XEmbeddedClient]
  }
}

