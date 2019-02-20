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

