package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** listener on finish states of asynchronous job execution */
trait XJobListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * indicates that the job is done
    * @param Job identifies the asynchronous job so that {@link theJobExecutor} can differ between more than ones.
    * @param Result should be the same like for the synchronous mode on {@link XJob.execute()} . It provides information about success or failure of job execu
    */
  def jobFinished(Job: XAsyncJob, Result: js.Any): scala.Unit
}

object XJobListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    jobFinished: js.Function2[XAsyncJob, js.Any, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XJobListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("jobFinished")(jobFinished)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XJobListener]
  }
}

