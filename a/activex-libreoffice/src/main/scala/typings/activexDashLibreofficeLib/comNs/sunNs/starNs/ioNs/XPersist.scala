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

