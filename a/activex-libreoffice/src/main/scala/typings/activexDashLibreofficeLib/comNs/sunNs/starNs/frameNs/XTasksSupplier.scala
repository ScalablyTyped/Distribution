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

