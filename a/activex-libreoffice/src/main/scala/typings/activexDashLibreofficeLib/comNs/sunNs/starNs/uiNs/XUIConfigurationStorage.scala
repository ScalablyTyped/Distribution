package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * supplies functions to change or get information about the storage of a user interface configuration manager.
  * @since OOo 2.0
  */
trait XUIConfigurationStorage
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * checks if an instance has already a storage to load/store its data.
    * @returns `TRUE` if the instance has a storage otherwise `FALSE` .
    */
  def hasStorage(): scala.Boolean
  /**
    * connects a storage to the user interface configuration manager which is used on subsequent calls of load() and store().
    * @param Storage all configuration data is loaded/stored from/into this storage. If the storage is in read/write mode load() and store() can be used other
    */
  def setStorage(Storage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage): scala.Unit
}

object XUIConfigurationStorage {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    hasStorage: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setStorage: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, scala.Unit]
  ): XUIConfigurationStorage = {
    val __obj = js.Dynamic.literal(acquire = acquire, hasStorage = hasStorage, queryInterface = queryInterface, release = release, setStorage = setStorage)
  
    __obj.asInstanceOf[XUIConfigurationStorage]
  }
}

