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
    abort: js.Function1[scala.Double, scala.Unit],
    acquire: js.Function0[scala.Unit],
    createCommandIdentifier: js.Function0[scala.Double],
    execute: js.Function3[Command, scala.Double, XCommandEnvironment, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    releaseCommandIdentifier: js.Function1[scala.Double, scala.Unit]
  ): XCommandProcessor2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createCommandIdentifier")(createCommandIdentifier)
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("releaseCommandIdentifier")(releaseCommandIdentifier)
    __obj.asInstanceOf[XCommandProcessor2]
  }
}

