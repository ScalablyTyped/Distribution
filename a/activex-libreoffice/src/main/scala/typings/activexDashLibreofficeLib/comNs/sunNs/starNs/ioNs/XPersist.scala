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
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    read: js.Function1[java.lang.String, scala.Unit],
    release: js.Function0[scala.Unit],
    write: js.Function1[java.lang.String, scala.Unit]
  ): XPersist = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("read")(read)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("write")(write)
    __obj.asInstanceOf[XPersist]
  }
}

