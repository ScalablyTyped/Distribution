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

