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
    acquire: js.Function0[scala.Unit],
    close: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XCloseable = {
    val __obj = js.Dynamic.literal(acquire = acquire, close = close, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XCloseable]
  }
}

