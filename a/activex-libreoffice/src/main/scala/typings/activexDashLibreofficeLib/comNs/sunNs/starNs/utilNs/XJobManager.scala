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

