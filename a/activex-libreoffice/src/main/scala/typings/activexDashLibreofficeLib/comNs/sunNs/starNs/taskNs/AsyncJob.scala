package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represent an asynchronous job, which can be executed by the global {@link theJobExecutor} instance.
  * @see Job
  * @since OOo 1.1.2
  */
trait AsyncJob
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseable
     with XAsyncJob

object AsyncJob {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addCloseListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseListener, scala.Unit],
    close: js.Function1[scala.Boolean, scala.Unit],
    executeAsync: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue], 
      XJobListener, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeCloseListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseListener, scala.Unit]
  ): AsyncJob = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addCloseListener")(addCloseListener)
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("executeAsync")(executeAsync)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeCloseListener")(removeCloseListener)
    __obj.asInstanceOf[AsyncJob]
  }
}

