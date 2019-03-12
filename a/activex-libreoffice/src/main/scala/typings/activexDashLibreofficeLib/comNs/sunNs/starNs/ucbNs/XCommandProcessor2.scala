package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An improved version of a {@link com.sun.star.ucb.XCommandProcessor} that helps avoid ever-increasing resource consumption. */
trait XCommandProcessor2 extends XCommandProcessor {
  /**
    * releases a command identifier obtained through {@link XCommandProcessor.createCommandIdentifier()} when it is no longer used.
    *
    * After this call the command identifier cannot be used any longer in calls to {@link XCommandProcessor.execute()} and {@link XCommandProcessor.abort()}
    * . (But it can happen that a call to {@link XCommandProcessor.createCommandIdentifier()} reuses this identifier.)
    * @param CommandId A command identifier obtained through {@link XCommandProcessor.createCommandIdentifier()} . If the identifier is zero, the request is s
    */
  def releaseCommandIdentifier(CommandId: scala.Double): scala.Unit
}

object XCommandProcessor2 {
  @scala.inline
  def apply(
    abort: scala.Double => scala.Unit,
    acquire: () => scala.Unit,
    createCommandIdentifier: () => scala.Double,
    execute: (Command, scala.Double, XCommandEnvironment) => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    releaseCommandIdentifier: scala.Double => scala.Unit
  ): XCommandProcessor2 = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction1(abort), acquire = js.Any.fromFunction0(acquire), createCommandIdentifier = js.Any.fromFunction0(createCommandIdentifier), execute = js.Any.fromFunction3(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), releaseCommandIdentifier = js.Any.fromFunction1(releaseCommandIdentifier))
  
    __obj.asInstanceOf[XCommandProcessor2]
  }
}

