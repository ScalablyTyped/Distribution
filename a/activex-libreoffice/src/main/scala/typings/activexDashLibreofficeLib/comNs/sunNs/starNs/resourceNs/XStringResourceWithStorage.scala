package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.resourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Extends {@link XStringResourcePersistence} by methods to handle an associated {@link com.sun.star.embed.XStorage} instance.
  * @see XStringResourcePersistence.
  */
trait XStringResourceWithStorage extends XStringResourcePersistence {
  /**
    * Associates a storage to the {@link StringResourceWithStorage} instance which is used on subsequent calls of {@link store()} .
    * @param Storage the storage to be associated to the StringResourceManager  This call has to be used carefully as it removes the storage previously connec
    * @throws com::sun::star::lang::IllegalArgumentException if a null interface is passed as Storage
    */
  def setStorage(Storage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage): scala.Unit
  /**
    * Stores all string table data to a storage and associates this storage to this instance as if {@link setStorage()} was called with this storage. The
    * modified state will be unmodified after the call.
    *
    * This method can throw all exceptions thrown by the methods of {@link com.sun.star.embed.XStorage}
    */
  def storeAsStorage(Storage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage): scala.Unit
}

