package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manage cancelable jobs. */
trait XJobManager
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** cancel all registered jobs. */
  def cancelAllJobs(): scala.Unit
  /** registers a cancelable job. */
  def registerJob(Job: XCancellable): scala.Unit
  /** deregisters a cancelable jobs. */
  def releaseJob(Job: XCancellable): scala.Unit
}

object XJobManager {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    cancelAllJobs: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    registerJob: XCancellable => scala.Unit,
    release: () => scala.Unit,
    releaseJob: XCancellable => scala.Unit
  ): XJobManager = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), cancelAllJobs = js.Any.fromFunction0(cancelAllJobs), queryInterface = js.Any.fromFunction1(queryInterface), registerJob = js.Any.fromFunction1(registerJob), release = js.Any.fromFunction0(release), releaseJob = js.Any.fromFunction1(releaseJob))
  
    __obj.asInstanceOf[XJobManager]
  }
}

