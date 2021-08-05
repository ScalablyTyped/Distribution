package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manage cancelable jobs. */
trait XJobManager
  extends StObject
     with XInterface {
  
  /** cancel all registered jobs. */
  def cancelAllJobs(): Unit
  
  /** registers a cancelable job. */
  def registerJob(Job: XCancellable): Unit
  
  /** deregisters a cancelable jobs. */
  def releaseJob(Job: XCancellable): Unit
}
object XJobManager {
  
  inline def apply(
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
  
  extension [Self <: XJobManager](x: Self) {
    
    inline def setCancelAllJobs(value: () => Unit): Self = StObject.set(x, "cancelAllJobs", js.Any.fromFunction0(value))
    
    inline def setRegisterJob(value: XCancellable => Unit): Self = StObject.set(x, "registerJob", js.Any.fromFunction1(value))
    
    inline def setReleaseJob(value: XCancellable => Unit): Self = StObject.set(x, "releaseJob", js.Any.fromFunction1(value))
  }
}
