package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manage cancelable jobs. */
@js.native
trait XJobManager extends XInterface {
  
  /** cancel all registered jobs. */
  def cancelAllJobs(): Unit = js.native
  
  /** registers a cancelable job. */
  def registerJob(Job: XCancellable): Unit = js.native
  
  /** deregisters a cancelable jobs. */
  def releaseJob(Job: XCancellable): Unit = js.native
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
  
  @scala.inline
  implicit class XJobManagerOps[Self <: XJobManager] (val x: Self) extends AnyVal {
    
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
    def setCancelAllJobs(value: () => Unit): Self = this.set("cancelAllJobs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegisterJob(value: XCancellable => Unit): Self = this.set("registerJob", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReleaseJob(value: XCancellable => Unit): Self = this.set("releaseJob", js.Any.fromFunction1(value))
  }
}
