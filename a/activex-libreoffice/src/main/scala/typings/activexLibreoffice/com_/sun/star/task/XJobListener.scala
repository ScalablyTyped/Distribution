package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** listener on finish states of asynchronous job execution */
@js.native
trait XJobListener extends XEventListener {
  /**
    * indicates that the job is done
    * @param Job identifies the asynchronous job so that {@link theJobExecutor} can differ between more than ones.
    * @param Result should be the same like for the synchronous mode on {@link XJob.execute()} . It provides information about success or failure of job execu
    */
  def jobFinished(Job: XAsyncJob, Result: js.Any): Unit = js.native
}

object XJobListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    jobFinished: (XAsyncJob, js.Any) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XJobListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), jobFinished = js.Any.fromFunction2(jobFinished), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XJobListener]
  }
  @scala.inline
  implicit class XJobListenerOps[Self <: XJobListener] (val x: Self) extends AnyVal {
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
    def setJobFinished(value: (XAsyncJob, js.Any) => Unit): Self = this.set("jobFinished", js.Any.fromFunction2(value))
  }
  
}

