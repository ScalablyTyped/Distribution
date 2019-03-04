package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines the environment for a command.
  * @author Kai Sommerfeld
  * @see XCommandProcessor
  * @version 1.0
  */
trait XCommandEnvironment
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the command's interaction handler.
    *
    * If called multiple times, this method should consistently return the same value (to allow caching).
    * @returns an interaction handler
    */
  val InteractionHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler
  /**
    * returns the command's progress handler.
    *
    * If called multiple times, this method should consistently return the same value (to allow caching).
    * @returns a progress handler
    */
  val ProgressHandler: XProgressHandler
  /**
    * returns the command's interaction handler.
    *
    * If called multiple times, this method should consistently return the same value (to allow caching).
    * @returns an interaction handler
    */
  def getInteractionHandler(): activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler
  /**
    * returns the command's progress handler.
    *
    * If called multiple times, this method should consistently return the same value (to allow caching).
    * @returns a progress handler
    */
  def getProgressHandler(): XProgressHandler
}

object XCommandEnvironment {
  @scala.inline
  def apply(
    InteractionHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler,
    ProgressHandler: XProgressHandler,
    acquire: js.Function0[scala.Unit],
    getInteractionHandler: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler],
    getProgressHandler: js.Function0[XProgressHandler],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XCommandEnvironment = {
    val __obj = js.Dynamic.literal(InteractionHandler = InteractionHandler, ProgressHandler = ProgressHandler, acquire = acquire, getInteractionHandler = getInteractionHandler, getProgressHandler = getProgressHandler, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XCommandEnvironment]
  }
}

