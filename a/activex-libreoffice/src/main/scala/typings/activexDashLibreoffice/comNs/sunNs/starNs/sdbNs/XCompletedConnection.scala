package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XConnection
import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.XInteractionHandler
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used for establishing connections via a factory which is identified by its name. To complete the information needed for establishing a connection
  * an interaction handler is used.
  */
trait XCompletedConnection extends XInterface {
  /**
    * attempts to establish a database connection. If information is missing, such as a user's password, they are completed by user interaction.
    * @param handler will be asked when more information is needed
    * @returns the {@link Connection} object
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def connectWithCompletion(handler: XInteractionHandler): XConnection
}

object XCompletedConnection {
  @scala.inline
  def apply(
    acquire: () => Unit,
    connectWithCompletion: XInteractionHandler => XConnection,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCompletedConnection = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), connectWithCompletion = js.Any.fromFunction1(connectWithCompletion), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XCompletedConnection]
  }
}

