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
    acquire: () => scala.Unit,
    pop: () => scala.Unit,
    push: js.Any => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    update: js.Any => scala.Unit
  ): XProgressHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[XProgressHandler]
  }
}

