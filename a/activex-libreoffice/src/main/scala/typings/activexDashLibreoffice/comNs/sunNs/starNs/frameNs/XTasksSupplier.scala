package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumerationAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * use {@link XFramesSupplier} instead of that
  * @deprecated Deprecated
  */
trait XTasksSupplier extends XInterface {
  /**
    * use {@link XFramesSupplier.getActiveFrame()} instead of this one
    * @deprecated Deprecated
    */
  val ActiveTask: XTask
  /**
    * use {@link XFramesSupplier.getFrames()} instead of this one
    * @deprecated Deprecated
    */
  val Tasks: XEnumerationAccess
  /**
    * use {@link XFramesSupplier.getActiveFrame()} instead of this one
    * @deprecated Deprecated
    */
  def getActiveTask(): XTask
  /**
    * use {@link XFramesSupplier.getFrames()} instead of this one
    * @deprecated Deprecated
    */
  def getTasks(): XEnumerationAccess
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
    val __obj = js.Dynamic.literal(ActiveTask = ActiveTask, Tasks = Tasks, acquire = js.Any.fromFunction0(acquire), getActiveTask = js.Any.fromFunction0(getActiveTask), getTasks = js.Any.fromFunction0(getTasks), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTasksSupplier]
  }
}

