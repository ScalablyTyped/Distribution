package typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** listener on finish states of asynchronous job execution */
trait XJobListener extends XEventListener {
  /**
    * indicates that the job is done
    * @param Job identifies the asynchronous job so that {@link theJobExecutor} can differ between more than ones.
    * @param Result should be the same like for the synchronous mode on {@link XJob.execute()} . It provides information about success or failure of job execu
    */
  def jobFinished(Job: XAsyncJob, Result: js.Any): Unit
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
}

