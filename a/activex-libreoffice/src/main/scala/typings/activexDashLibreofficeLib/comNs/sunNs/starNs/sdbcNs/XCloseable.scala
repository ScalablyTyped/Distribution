package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides for the releasing of resources acquired by the implementing object. */
trait XCloseable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * releases all resources connected to an object.
    * @throws SQLException if a database access error occurs.
    */
  def close(): scala.Unit
}

object XCloseable {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    close: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XCloseable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), close = js.Any.fromFunction0(close), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XCloseable]
  }
}

