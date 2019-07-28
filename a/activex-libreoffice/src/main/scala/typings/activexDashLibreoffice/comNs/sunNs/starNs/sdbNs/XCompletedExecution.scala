package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.XInteractionHandler
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used for execution where information for execution may be required from the user. */
trait XCompletedExecution extends XInterface {
  /**
    * completes necessary information before execution, for example parameter values.
    * @param handler will be asked when more information is needed
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def executeWithCompletion(handler: XInteractionHandler): Unit
}

object XCompletedExecution {
  @scala.inline
  def apply(
    acquire: () => Unit,
    executeWithCompletion: XInteractionHandler => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCompletedExecution = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), executeWithCompletion = js.Any.fromFunction1(executeWithCompletion), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XCompletedExecution]
  }
}

