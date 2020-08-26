package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * use {@link XFramesSupplier} instead of that
  * @deprecated Deprecated
  */
@js.native
trait XTasksSupplier extends XInterface {
  /**
    * use {@link XFramesSupplier.getActiveFrame()} instead of this one
    * @deprecated Deprecated
    */
  val ActiveTask: XTask = js.native
  /**
    * use {@link XFramesSupplier.getFrames()} instead of this one
    * @deprecated Deprecated
    */
  val Tasks: XEnumerationAccess = js.native
  /**
    * use {@link XFramesSupplier.getActiveFrame()} instead of this one
    * @deprecated Deprecated
    */
  def getActiveTask(): XTask = js.native
  /**
    * use {@link XFramesSupplier.getFrames()} instead of this one
    * @deprecated Deprecated
    */
  def getTasks(): XEnumerationAccess = js.native
}

object XTasksSupplier {
  @scala.inline
  def apply(
    ActiveTask: XTask,
    Tasks: XEnumerationAccess,
    acquire: () => Unit,
    getActiveTask: () => XTask,
    getTasks: () => XEnumerationAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTasksSupplier = {
    val __obj = js.Dynamic.literal(ActiveTask = ActiveTask.asInstanceOf[js.Any], Tasks = Tasks.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getActiveTask = js.Any.fromFunction0(getActiveTask), getTasks = js.Any.fromFunction0(getTasks), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTasksSupplier]
  }
  @scala.inline
  implicit class XTasksSupplierOps[Self <: XTasksSupplier] (val x: Self) extends AnyVal {
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
    def setActiveTask(value: XTask): Self = this.set("ActiveTask", value.asInstanceOf[js.Any])
    @scala.inline
    def setTasks(value: XEnumerationAccess): Self = this.set("Tasks", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetActiveTask(value: () => XTask): Self = this.set("getActiveTask", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTasks(value: () => XEnumerationAccess): Self = this.set("getTasks", js.Any.fromFunction0(value))
  }
  
}

