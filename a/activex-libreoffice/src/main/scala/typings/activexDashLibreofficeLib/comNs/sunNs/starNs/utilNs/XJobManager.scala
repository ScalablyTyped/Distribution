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
    acquire: js.Function0[scala.Unit],
    cancelAllJobs: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerJob: js.Function1[XCancellable, scala.Unit],
    release: js.Function0[scala.Unit],
    releaseJob: js.Function1[XCancellable, scala.Unit]
  ): XJobManager = {
    val __obj = js.Dynamic.literal(acquire = acquire, cancelAllJobs = cancelAllJobs, queryInterface = queryInterface, registerJob = registerJob, release = release, releaseJob = releaseJob)
  
    __obj.asInstanceOf[XJobManager]
  }
}

