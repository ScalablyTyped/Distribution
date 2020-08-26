package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * starts action for any triggered event from outside
  *
  * If somewhere from outside trigger an event on this interface it will be used to find any registered service inside configuration of this executor. If
  * somewhere could be found it will be started and controlled by this instance. After it finish its work it's possible to deactivate further startups or
  * let it run again if a new event will be detected later.
  * @see theJobExecutor
  */
@js.native
trait XJobExecutor extends XInterface {
  /**
    * trigger event to start registered jobs
    *
    * Jobs are registered in configuration and will be started by executor automatically, if they are registered for triggered event. The meaning of given
    * string **Event** mustn't be known. Because for the executor it's enough to use it for searching a registered job inside its own configuration. So no
    * special events will be defined here.
    * @param Event describe the event for which jobs can be registered and should be started
    */
  def trigger(Event: String): Unit = js.native
}

object XJobExecutor {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    trigger: String => Unit
  ): XJobExecutor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), trigger = js.Any.fromFunction1(trigger))
    __obj.asInstanceOf[XJobExecutor]
  }
  @scala.inline
  implicit class XJobExecutorOps[Self <: XJobExecutor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTrigger(value: String => Unit): Self = this.set("trigger", js.Any.fromFunction1(value))
  }
  
}

