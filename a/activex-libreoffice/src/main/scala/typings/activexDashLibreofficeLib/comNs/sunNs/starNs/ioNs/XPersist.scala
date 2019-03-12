package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to write this object to an URL or read it from an URL. */
trait XPersist
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** reads all the persistent data of the object from the URL. */
  def read(URL: java.lang.String): scala.Unit
  /** writes all the persistent data of the object to the URL. */
  def write(URL: java.lang.String): scala.Unit
}

object XPersist {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    read: java.lang.String => scala.Unit,
    release: () => scala.Unit,
    write: java.lang.String => scala.Unit
  ): XPersist = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction1(read), release = js.Any.fromFunction0(release), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[XPersist]
  }
}

