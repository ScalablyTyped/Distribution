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

