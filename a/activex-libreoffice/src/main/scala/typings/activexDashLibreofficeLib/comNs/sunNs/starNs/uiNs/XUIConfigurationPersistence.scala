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
    acquire: js.Function0[scala.Unit],
    isModified: js.Function0[scala.Boolean],
    isReadOnly: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    reload: js.Function0[scala.Unit],
    store: js.Function0[scala.Unit],
    storeToStorage: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, scala.Unit]
  ): XUIConfigurationPersistence = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("isModified")(isModified)
    __obj.updateDynamic("isReadOnly")(isReadOnly)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("reload")(reload)
    __obj.updateDynamic("store")(store)
    __obj.updateDynamic("storeToStorage")(storeToStorage)
    __obj.asInstanceOf[XUIConfigurationPersistence]
  }
}

