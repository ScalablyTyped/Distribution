package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a persistence interface which supports to load/store user interface configuration data to a storage and to retrieve information about the
  * current state.
  * @since OOo 2.0
  */
trait XUIConfigurationPersistence
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * provides the current modify state of the configuration manager instance.
    * @returns `TRUE` if the configuration manager has changed since the last {@link store()} call. `FALSE` if the configuration manager has not been changed.
    */
  def isModified(): scala.Boolean
  /**
    * provides the current read-only state of the user configuration manager. Storing a user interface configuration to a read-only storage is not possible.
    * A read-only configuration manager instance will also not support any changes to its configuration settings.
    * @returns `TRUE` if the configuration manager storage is read-only otherwise `FALSE` .
    */
  def isReadOnly(): scala.Boolean
  /**
    * reloads the configuration data from the storage and reinitialize the user interface configuration manager instance with this data.
    *
    * It is up to the implementation if it defers the first loading process until the first data request using {@link XUIConfigurationManager} interface.
    */
  def reload(): scala.Unit
  /**
    * stores the configuration data to the storage provided by setStorage() from the storage and initialize the user interface configuration manager
    * instance with the newly data. This call can throw an {@link com.sun.star.io.IOException} if {@link store()} cannot store its data into the internal
    * storage.
    */
  def store(): scala.Unit
  /**
    * stores the configuration data to the provided storage, ignoring the previously set storage by setStorage(). Can be used to make copy of the current
    * user interface configuration data to another storage. This call will throw an {@link com.sun.star.io.IOException} if the provided storage is in
    * read-only mode.
    * @param Storage all configuration data will be stored to this storage.
    */
  def storeToStorage(Storage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage): scala.Unit
}

object XUIConfigurationPersistence {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    isModified: () => scala.Boolean,
    isReadOnly: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    reload: () => scala.Unit,
    store: () => scala.Unit,
    storeToStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage => scala.Unit
  ): XUIConfigurationPersistence = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), isModified = js.Any.fromFunction0(isModified), isReadOnly = js.Any.fromFunction0(isReadOnly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reload = js.Any.fromFunction0(reload), store = js.Any.fromFunction0(store), storeToStorage = js.Any.fromFunction1(storeToStorage))
  
    __obj.asInstanceOf[XUIConfigurationPersistence]
  }
}

