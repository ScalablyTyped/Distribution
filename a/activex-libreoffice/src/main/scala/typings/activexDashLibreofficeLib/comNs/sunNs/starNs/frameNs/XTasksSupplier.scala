package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * use {@link XFramesSupplier} instead of that
  * @deprecated Deprecated
  */
trait XTasksSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * use {@link XFramesSupplier.getActiveFrame()} instead of this one
    * @deprecated Deprecated
    */
  val ActiveTask: XTask
  /**
    * use {@link XFramesSupplier.getFrames()} instead of this one
    * @deprecated Deprecated
    */
  val Tasks: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
  /**
    * use {@link XFramesSupplier.getActiveFrame()} instead of this one
    * @deprecated Deprecated
    */
  def getActiveTask(): XTask
  /**
    * use {@link XFramesSupplier.getFrames()} instead of this one
    * @deprecated Deprecated
    */
  def getTasks(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
}

object XTasksSupplier {
  @scala.inline
  def apply(
    ActiveTask: XTask,
    Tasks: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess,
    acquire: js.Function0[scala.Unit],
    getActiveTask: js.Function0[XTask],
    getTasks: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTasksSupplier = {
    val __obj = js.Dynamic.literal(ActiveTask = ActiveTask, Tasks = Tasks, acquire = acquire, getActiveTask = getActiveTask, getTasks = getTasks, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XTasksSupplier]
  }
}

