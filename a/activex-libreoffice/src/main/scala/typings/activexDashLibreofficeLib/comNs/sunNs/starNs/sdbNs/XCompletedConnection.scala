package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used for establishing connections via a factory which is identified by its name. To complete the information needed for establishing a connection
  * an interaction handler is used.
  */
trait XCompletedConnection
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * attempts to establish a database connection. If information is missing, such as a user's password, they are completed by user interaction.
    * @param handler will be asked when more information is needed
    * @returns the {@link Connection} object
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def connectWithCompletion(handler: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection
}

