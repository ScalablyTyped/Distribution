package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used for execution where information for execution may be required from the user. */
trait XCompletedExecution
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * completes necessary information before execution, for example parameter values.
    * @param handler will be asked when more information is needed
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def executeWithCompletion(handler: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler): scala.Unit
}

