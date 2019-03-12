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
    acquire: () => scala.Unit,
    addCloseListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseListener => scala.Unit,
    close: scala.Boolean => scala.Unit,
    executeAsync: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue], XJobListener) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeCloseListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseListener => scala.Unit
  ): AsyncJob = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addCloseListener = js.Any.fromFunction1(addCloseListener), close = js.Any.fromFunction1(close), executeAsync = js.Any.fromFunction2(executeAsync), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeCloseListener = js.Any.fromFunction1(removeCloseListener))
  
    __obj.asInstanceOf[AsyncJob]
  }
}

