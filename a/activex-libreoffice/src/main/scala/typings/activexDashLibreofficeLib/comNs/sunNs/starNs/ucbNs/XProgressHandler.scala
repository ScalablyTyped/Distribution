package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Handle a tasks notification that it has made some progress. */
trait XProgressHandler
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** The task notifies the handler that it has finished its current activity. */
  def pop(): scala.Unit
  /**
    * The task notifies the handler that it has started some new activity (possibly a sub-activity of another activity already making progress; therefore,
    * these notifications behave in a stack-like manner).
    * @param Status An object representing the new activity. There has to be an agreement between caller and callee of methods {@link XProgressHandler.push()}
    */
  def push(Status: js.Any): scala.Unit
  /**
    * The task notifies the handler that its current activity is making progress.
    * @param Status An object representing the progress made. See the documentation of {@link XProgressHandler.push()} for more information.
    */
  def update(Status: js.Any): scala.Unit
}

object XProgressHandler {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    pop: js.Function0[scala.Unit],
    push: js.Function1[js.Any, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    update: js.Function1[js.Any, scala.Unit]
  ): XProgressHandler = {
    val __obj = js.Dynamic.literal(acquire = acquire, pop = pop, push = push, queryInterface = queryInterface, release = release, update = update)
  
    __obj.asInstanceOf[XProgressHandler]
  }
}

