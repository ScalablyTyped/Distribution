package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manage cancelable jobs. */
trait XJobManager extends XInterface {
  /** cancel all registered jobs. */
  def cancelAllJobs(): Unit
  /** registers a cancelable job. */
  def registerJob(Job: XCancellable): Unit
  /** deregisters a cancelable jobs. */
  def releaseJob(Job: XCancellable): Unit
}

object XJobManager {
  @scala.inline
  def apply(
    acquire: () => Unit,
    cancelAllJobs: () => Unit,
    queryInterface: `type` => js.Any,
    registerJob: XCancellable => Unit,
    release: () => Unit,
    releaseJob: XCancellable => Unit
  ): XJobManager = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), cancelAllJobs = js.Any.fromFunction0(cancelAllJobs), queryInterface = js.Any.fromFunction1(queryInterface), registerJob = js.Any.fromFunction1(registerJob), release = js.Any.fromFunction0(release), releaseJob = js.Any.fromFunction1(releaseJob))
    __obj.asInstanceOf[XJobManager]
  }
}

