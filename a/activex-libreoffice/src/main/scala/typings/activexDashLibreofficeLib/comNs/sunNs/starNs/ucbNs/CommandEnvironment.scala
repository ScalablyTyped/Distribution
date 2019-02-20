package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandEnvironment extends XCommandEnvironment {
  /**
    * Constructor.
    * @param InteractionHandler the interaction handler instance that will be returned by this service's implementation of XCommandEnvironemt::getInteractionH
    * @param ProgressHandler the progress handler instance that will be returned by this service's implementation of XCommandEnvironemt::getProgressHandler()
    */
  def create(
    InteractionHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler,
    ProgressHandler: XProgressHandler
  ): scala.Unit
}

