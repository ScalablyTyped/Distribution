package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.resourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Extends {@link XStringResourcePersistence} by methods to handle an associated location.
  * @see XStringResourcePersistence.
  */
trait XStringResourceWithLocation extends XStringResourcePersistence {
  /**
    * Associates a location to the {@link StringResourceWithStorage} instance which is used on subsequent calls of {@link store()} .
    * @param URL the location to be associated to the StringResourceManager  This call has to be used carefully as it removes the location previously connecte
    * @throws com::sun::star::lang::IllegalArgumentException if an empty string is passed as URL
    * @throws com::sun::star::lang::NoSupportException if the location is readonly
    */
  def setURL(URL: java.lang.String): scala.Unit
  /**
    * Stores all string table data to a location and associates this location to this instance as if setLocation() was called with this location. The
    * modified state will be unmodified after the call.
    * @param URL the location the string table data should be stored to.
    */
  def storeAsURL(URL: java.lang.String): scala.Unit
}

