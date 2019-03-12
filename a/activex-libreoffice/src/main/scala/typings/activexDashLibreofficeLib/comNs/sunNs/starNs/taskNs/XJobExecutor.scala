package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * starts action for any triggered event from outside
  *
  * If somewhere from outside trigger an event on this interface it will be used to find any registered service inside configuration of this executor. If
  * somewhere could be found it will be started and controlled by this instance. After it finish his work it's possible to deactivate further startups or
  * let him run again if a new event will be detected later.
  * @see theJobExecutor
  */
trait XJobExecutor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * trigger event to start registered jobs
    *
    * Jobs are registered in configuration and will be started by executor automatically, if they are registered for triggered event. The meaning of given
    * string **Event** mustn't be known. Because for the executor it's enough to use it for searching a registered job inside his own configuration. So no
    * special events will be defined here.
    * @param Event describe the event for which jobs can be registered and should be started
    */
  def trigger(Event: java.lang.String): scala.Unit
}

object XJobExecutor {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    trigger: java.lang.String => scala.Unit
  ): XJobExecutor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), trigger = js.Any.fromFunction1(trigger))
  
    __obj.asInstanceOf[XJobExecutor]
  }
}

